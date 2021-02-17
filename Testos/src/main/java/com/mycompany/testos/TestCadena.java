/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testos;

/**
 *
 * @author david
 */
public class TestCadena {
     public static String juntaSaltejats(int salt, String... lletres){
        //les variables que necessito
        String frase="";
        int numLletres=0;
        //casos especials
        if(lletres==null)return null;
        if(salt < 1)return "0";
        if (salt>=1 && lletres.length==0)return "0";
        //tractament del cas normal
        for (int i = 0; i < lletres.length; i+=salt) {
            numLletres+=lletres[i].trim().length();
            frase+=lletres[i];
        }
        return numLletres+":"+frase;
    }
    
}
