/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4.javapersistanceapi.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import chapter4.javapersistanceapi.BookForJPA;
import javax.validation.ConstraintViolationException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 *
 * @author dauri
 */
public class BookForJPAIT {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("CHAPTER04PU");
    private static EntityManager em;
    private static EntityTransaction et;

    @Before
    public void initEntityManager() throws Exception {
        em = emf.createEntityManager();
        et = em.getTransaction();
    }

    @After
    public void closeEntityManager() throws Exception {
        if(em != null){
            em.close();
        }
    }
        
    
    @Test
    public void shouldFindJavaEE7Book() throws Exception{
        BookForJPA book = em.find(BookForJPA.class, 1001L);
        assertEquals("Beginning of Java EE 7", book.getTitle());
    }
    
    
//    @Test
//    public void shouldCreateH2G2Book() throws Exception{
//        // Create an instance of BookForJPA
//        BookForJPA b = new BookForJPA();
//        b.setTitle("H2G2");
//        b.setDescription("A Famous cookbook for Java EE learning!!");
//        b.setPrice(12.5F);
//        b.setIsbn("1-84023-742-2");
//        b.setNbOfPages(354);
//        b.setIllustrations(false);
//        
//        
//        //Start EntityTransaction, persist the book and close all
//        et.begin();
//        em.persist(b);
//        et.commit();
//        
//        assertNotNull("Id should not be null", b.getId());
//        
//        
//        // Retrieves all the books from database
//        b = em.createNamedQuery("findBookH2G2", BookForJPA.class).getSingleResult();
//        
//        assertEquals("A Famous cookbook for Java EE learning!!", b.getDescription());
//    }
//    
//    
//    @Test(expected = ConstraintViolationException.class)
//    public void shouldRaiseConstraintViolationExceptionNullTitle(){
//        BookForJPA b = new BookForJPA();
//        // It will rais an exception for this one
//        //b.setTitle("H2G2");
//        b.setDescription("A Famous cookbook for Java EE learning!!");
//        b.setPrice(12.5F);
//        b.setIsbn("1-84023-742-2");
//        b.setNbOfPages(354);
//        b.setIllustrations(false);
//        
//        em.persist(b);
//    }
//    
    }


