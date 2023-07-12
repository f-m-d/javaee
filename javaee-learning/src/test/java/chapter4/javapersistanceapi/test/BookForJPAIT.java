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

/**
 *
 * @author dauri
 */
public class BookForJPAIT {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("CHAPTER4TESTPU");
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
        
        
    }


