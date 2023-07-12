/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4.javapersistanceapi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author dauri
 */
public class Main {

    
    public static void main(String[] argv){
        
        BookForJPA b = new BookForJPA();
        b.setTitle("H2G2");
        b.setDescription("A Famous cookbook for Java EE learning!!");
        b.setPrice(12.5F);
        b.setIsbn("1-84023-742-2");
        b.setNbOfPages(354);
        b.setIllustrations(false);
        
        
        //Obtain an EntityManagerFactory and EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CHAPTER04PU");
        EntityManager em = emf.createEntityManager();
        
        
        //Start a EntityTransaction to persist in the database
        EntityTransaction et = em.getTransaction();
        et.begin();
        
        em.persist(b);
        
        et.commit();
        
        
        
        // End the EntityManager and the EntityManagerFactory
        emf.close();
        em.close();
    }
}

