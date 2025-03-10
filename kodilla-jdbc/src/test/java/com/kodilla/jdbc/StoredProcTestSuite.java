package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";

        // When
        Statement statement2 = dbManager.getConnection().createStatement();
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement2.execute(sqlProcedureCall);
        ResultSet rs = statement.executeQuery(sqlCheckTable);

        // Then
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
        rs.close();
        statement.close();
        statement2.close();
    }

    @Test
    void testUpdateBestsellers() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        Connection connection = dbManager.getConnection();

        try {
            connection.setAutoCommit(false);

            // When
            Statement statement = connection.createStatement();
            statement.execute("CALL UpdateBestsellers();");

            ResultSet rs = statement.executeQuery(
                    "SELECT b.BESTSELLER, " +
                            "       (SELECT COUNT(*) FROM RENTS r WHERE r.BOOK_ID = b.BOOK_ID) AS RENT_COUNT " +
                            "FROM BOOKS b"
            );

            // Then
            int counter = 0;
            while (rs.next()) {
                String bestseller = rs.getString("BESTSELLER");
                int rentCount = rs.getInt("RENT_COUNT");

                if (rentCount > 2) {
                    assertNotNull(bestseller);
                    counter++;
                }
            }
            assertEquals(1, counter);
            rs.close();
            statement.close();
        } finally {
            connection.rollback();
            connection.setAutoCommit(true);
        }
    }}