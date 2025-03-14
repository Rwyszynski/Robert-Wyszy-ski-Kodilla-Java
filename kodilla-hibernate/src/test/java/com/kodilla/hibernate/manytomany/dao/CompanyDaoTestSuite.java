package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        //try {
        //    companyDao.deleteById(softwareMachineId);
        //    companyDao.deleteById(dataMaestersId);
        //    companyDao.deleteById(greyMatterId);
        //} catch (Exception e) {
        //    //do nothing
        //}
    }

    @Test
    void testNamedQueries() {
        //Given
        Employee employee1 = new Employee("John", "Smith");
        Employee employee2 = new Employee("Stephanie", "Clarckson");
        Employee employee3 = new Employee("Linda", "Kovalsky");
        Employee employee4 = new Employee("Software Machine", "Clarckson");
        Employee employee5 = new Employee("Grey Matter", "Grey Matter");
        Employee employee6 = new Employee("Data Maester", "Data Maester");

        Company company1 = new Company("Software Machine");
        Company company2 = new Company("Data Maester");

        company1.getEmployees().add(employee1);
        company1.getEmployees().add(employee2);
        company1.getEmployees().add(employee3);
        company2.getEmployees().add(employee4);
        company2.getEmployees().add(employee5);
        company2.getEmployees().add(employee6);

        //When
        companyDao.save(company1);
        companyDao.save(company2);

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);
        employeeDao.save(employee5);
        employeeDao.save(employee6);

        //Then

        assertEquals(2, companyDao.count());
        assertEquals(6, employeeDao.count());

        //CleanUp
        try {
            companyDao.deleteAll();
            employeeDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }
}