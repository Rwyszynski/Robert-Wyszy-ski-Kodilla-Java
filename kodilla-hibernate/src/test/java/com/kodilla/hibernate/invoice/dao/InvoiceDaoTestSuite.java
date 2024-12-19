package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Transactional
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Invoice invoice1 = new Invoice("1");
        Invoice invoice2 = new Invoice("2");

        Product product1 = new Product("Applepie");
        Product product2 = new Product("Brownie");
        Product product3 = new Product("Cookies");
        Product product4 = new Product("Chocolate");
        Product product5 = new Product("PistachioPie");
        Product product6 = new Product("Donut");

        Item item1 = new Item(product1, new BigDecimal(10), 100, new BigDecimal(3), invoice1);
        Item item2 = new Item(product2, new BigDecimal(12), 50, new BigDecimal(7), invoice2);
        Item item3 = new Item(product3, new BigDecimal(6), 500, new BigDecimal(3), invoice1);
        Item item4 = new Item(product4, new BigDecimal(3), 100, new BigDecimal(1), invoice2);
        Item item5 = new Item(product5, new BigDecimal(15), 200, new BigDecimal(5), invoice1);
        Item item6 = new Item(product6, new BigDecimal(2), 1000, new BigDecimal(1), invoice1);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item3);
        invoice1.getItems().add(item5);
        invoice1.getItems().add(item6);
        invoice2.getItems().add(item2);
        invoice2.getItems().add(item4);

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);
        product4.getItems().add(item4);
        product5.getItems().add(item5);
        product6.getItems().add(item6);

        //When
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        productDao.save(product4);
        productDao.save(product5);
        productDao.save(product6);

        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);
        itemDao.save(item5);
        itemDao.save(item6);

        List<Invoice> result = invoiceDao.findByNumber("1");
        //Then
        assertNotEquals(0, result.size());

    }
}
