/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

/**
 *
 * @author profe
 */
public class Vector {
    
    public static float[] ompleVectorFloats(float... valors){
        //Casos especials
        if(valors==null || valors.length==0) 
            return null; //Casos en que hem rebut null o no hem rebut paràmetre 
                         //o hem rebut un vector buit  

        //Versió llarga                 
//        float[] resultat=new float[valors.length];
//        for (int i = 0; i < resultat.length; i++) {
//            resultat[i]=valors[i];
//        }
                         
//        return resultat;
        
        //Versió curta
        return valors;
    
    }
    
    public static void eliminaNoMultiples(int[] v, int num){
        //Casos especials
        if(v==null || num==0) return;
        
        int i=0, iM=0;
    
        while(i<v.length){
            if(v[i]%num==0){
                v[iM]=v[i];
                if(i!=iM) v[i]=-1;
                iM++;
            }else v[i]=-1;
            i++;
        }
    
    }
    
    public static int[] eliminaNoMultiplesV2(int[] v, int num){
        //Casos especials
        if(v==null || num==0) return v;
        
        //Declaració de variables
        int i=0, iM=0;
        int[] res=new int[v.length]; //vector del mateix tipo i llargada que v
    
        while(i<v.length){
            if(v[i]%num==0){
                res[iM]=v[i];
                if(i!=iM) res[i]=-1;
                iM++;
            }else res[i]=-1;
            i++;
        }
        
        return res;
    
    }
    
    
}
