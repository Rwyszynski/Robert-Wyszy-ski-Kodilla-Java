package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("National Library");
        Book book1 = new Book("Wodnikowe Wzgórze", "Richard Adams", LocalDate.of(1982, 4, 2));
        Book book2 = new Book("Choroba czerwonych oczu", "Stanisław Michalkiewicz", LocalDate.of(2018, 12, 2));
        Book book3 = new Book("Bracia Karamazow", "Fiodor Dostojewski", LocalDate.of(1879, 2, 14));
        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        //When
        int size = library.books.size();


        //making a shallow copy of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("City Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        int sizeCityLibrary = clonedLibrary.books.size();

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Village Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        int sizeVillageLibrary = deepClonedLibrary.books.size();

        //Then

        assertEquals(3, size);
        assertEquals(3, sizeCityLibrary);
        assertEquals(3, sizeVillageLibrary);
        //assertNotEquals(deepClonedBoard.getLists(), board.getLists());
    }
}
