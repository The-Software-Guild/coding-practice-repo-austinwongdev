/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.testing.dao.implementations;

import com.sg.testing.dao.MonsterDao;
import com.sg.testing.model.Monster;
import com.sg.testing.model.MonsterType;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 *
 * @author Austin Wong
 */
public class AGoodMonsterDaoTest {
    
    private MonsterDao dao;
    
    public AGoodMonsterDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.dao = new AGoodMonsterDao();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddGetMonsterNormal(){
        // Arrange
        int id = 1;
        String monsterName = "Charles";
        MonsterType monsterType = MonsterType.LIZARDMAN;
        int peopleEaten = 3;
        String favoriteFood = "Bananas";
        Monster monster = new Monster(
                monsterName, monsterType, peopleEaten, favoriteFood);
        
        // Act
        Monster returnedMonster = dao.addMonster(id, monster);
        
        // Assert
        assertNotNull(returnedMonster, "Monster Charles should be added.");
        assertEquals(monster, returnedMonster, "Monster should be Charles.");
        
        returnedMonster = dao.getMonster(id);
        assertNotNull(returnedMonster, "Monster Charles should be retrieved.");
        assertEquals(monster, returnedMonster, "Monster should be Charles.");
    }
    
    @Test
    public void testGetMonsterNotStored(){
        Monster returnedMonster = dao.getMonster(10);
        assertNull(returnedMonster, "Monster should be null.");
        
    }
    
}
