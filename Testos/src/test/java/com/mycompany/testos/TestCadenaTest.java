/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author david
 */
public class TestCadenaTest {
    
    public TestCadenaTest() {
    }

    @Test
    public void testJuntaSaltejats() {
        System.out.println("juntaSaltejats");
        int salt = 0;
        String[] lletres = null;
        String expResult = "";
        String result = TestCadena.juntaSaltejats(salt, lletres);
        assertEquals(null, TestCadena.juntaSaltejats(0,null));
        assertEquals("0", TestCadena.juntaSaltejats(-25));
        assertEquals("0", TestCadena.juntaSaltejats(3));
        assertEquals("0", TestCadena.juntaSaltejats(0,"La ","teua ","resposta ","no ","és ","la ","correcta."));
        assertEquals("29:La teua resposta no és la correcta.", TestCadena.juntaSaltejats(1,"La ","teua ","resposta ","no ","és ","la ","correcta."));
        assertEquals("21:La resposta és correcta.", TestCadena.juntaSaltejats(2,"La ","teua ","resposta ","no ","és ","la ","correcta."));
        assertEquals("13:La no correcta.", TestCadena.juntaSaltejats(3,"La ","teua ","resposta ","no ","és ","la ","correcta."));
        assertEquals("4:La és ", TestCadena.juntaSaltejats(4,"La ","teua ","resposta ","no ","és ","la ","correcta."));
        assertEquals("4:La la ", TestCadena.juntaSaltejats(5,"La ","teua ","resposta ","no ","és ","la ","correcta."));
        assertEquals("11:La correcta.", TestCadena.juntaSaltejats(6,"La ","teua ","resposta ","no ","és ","la ","correcta."));
        assertEquals("2:La ", TestCadena.juntaSaltejats(7,"La ","teua ","resposta ","no ","és ","la ","correcta."));
        assertEquals("2:La ", TestCadena.juntaSaltejats(8,"La ","teua ","resposta ","no ","és ","la ","correcta."));
       
    }
    
}
