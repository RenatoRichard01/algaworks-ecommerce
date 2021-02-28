package com.algaworks.ecommerce.iniciandoComJpa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConsultandoRegistroTest {
    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    //Antes de tudo
    @BeforeClass
    public static void setUpBeforeClass(){
        entityManagerFactory = Persistence.createEntityManagerFactory("Ecommerce-PU");
    }
    //Depois de tudo
    @AfterClass
    public static void tearDownAfterClass(){
        entityManagerFactory.close();
    }
    //Executado antes de cada um dos testes.
    @Before
    public void setUp(){
        entityManager = entityManagerFactory.createEntityManager();
    }
    //Executado depois de cada um dos testes.
    @After
    public void tearDown(){
        entityManager.close();
    }

}
