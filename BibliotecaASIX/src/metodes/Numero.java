/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

/**<p>Metodes fets amb recursiu o per ensenyar la metodologia recursiva.</p>
 * @author : <b><i>Santi</i></b> i <b>Palanka</b>
 */
public class Numero {
    
    /**<p>Retorna recursivament el màxim comú divisor dels 2 números passats com a paràmetre.</p>
     * <p><b>Casos especials:</b></p>
     * <ol>
     * <li>Si algun d'ells és el 0 retorna 0.</li>
     * </ol>
     * @author <b><i>Santi</i></b> i <b>Palanka</b>
     * @param a El primer número enter
     * @param b El segon número enter
     * @return El màxim comú divisor dels 2 números passats com a paràmetre.
     */
    public static int mcdRecursiu(int a, int b){
        //Mirem si hi ha algun 0 i acabem en cas afirmatiu
        if(a==0 || b==0) return 0;
        
        //Mirem si hi ha algun número negatiu i el passem a positiu
        if(a<0) a=a*-1;
        if(b<0) b=b*-1;
        
        if(a==b) return a;
        if(a>b) return mcdRecursiu(a-b,b);
        return mcdRecursiu(a, b-a);
    }
    
    /**<p>Retorna iterativament el màxim comú divisor dels 2 números passats com a paràmetre.</p>
     * <p><b>Casos especials:</b></p>
     * <ol>
     * <li>Si algun d'ells és el 0 retorna 0.</li>
     * </ol>
     * @author <b><i>Santi</i></b> i <b>Palanka</b>
     * @param a El primer número enter
     * @param b El segon número enter
     * @return El màxim comú divisor dels 2 números passats com a paràmetre.
     */
    public static int mcdIteratiu(int a, int b){
        //Mirem si hi ha algun 0 i acabem en cas afirmatiu
        if(a==0 || b==0) return 0;
        
        //Mirem si hi ha algun número negatiu i el passem a positiu
        if(a<0) a=a*-1;
        if(b<0) b=b*-1;
        
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
        
    }
    
    /**<p>Calcula recursivament la suma dels números naturals des de num a 0.</p>
     * <p><b>Casos especials:</b></p>
     * <ol>
     * <li>Si el paràmetre és negatiu retorna -1.</li>
     * </ol>
     * @author <b><i>Santi</i></b> i <b>Palanka</b>
     * @param num El valor a calcular
     * @return La suma dels números naturals des de num a 0.
     * @throws     StackOverflowError  si el paràmetre {@code num}
     *             és massa gran.
     */
    public static int sumaNaturals(int num){
        //Tractament del cas especial
        if(num<0) return -1;
        
        //Cas de parada
        if(num==0) return 0;
        
        //Cas iteratius
        return num+sumaNaturals(num-1);
    }

    /**<p>Calcula la suma dels números naturals des de num a 0.</p>
     * <p><b>Casos especials:</b></p>
     * <ol>
     * <li>Si el paràmetre és negatiu retorna -1.</li>
     * <li>Si retorna -2 significa que el valor del paràmetre és massa gran.</li>
     * </ol>
     * @author <b><i>Santi</i></b> i <b>Palanka</b>
     * @param num El valor a calcular
     * @return La suma dels números naturals des de num a 0.
     */
    public static int sumaNaturalsIteratiu(int num){
        //Tractament del cas especial
        if(num<0) return -1;
        int suma=0;
        
        while(num!=0){
            if(suma+num<suma) return -2;
            suma=suma+num;
            num=num-1;
        }
        return suma;
        
    }

    /**<p>Aquet metode calcula de forma recursiva la potencia de una base que li pasem i un exponent que li pasem.</p>
     * @author <b><i>Santi</i></b> i <b>Palanka</b>
     * @param base Numero que volguem de base de una potenci
     * @param exponent Numero exponent d'una potencia
     * @return El resultat de fer la potencia introduida als parametres.
     */
    public static double potenciaRec(double base, int exponent){
    
        //Cas de parada
        if(exponent==0) return 1.0;
        
        //Casos recursius
        if(exponent>0) return base * potenciaRec(base, exponent-1);
        return 1.0/potenciaRec(base, exponent*-1);
    }
    
    /**<p>Metode que crida dos metodes externs per fer un calcul, potenciaRec i factorial.</p>
     * <p>El calcul que fa es potenciaRec(x, i)/factorial(i) i la (i) anira incrementan fins el numero que li passem a n.
     * pots consultar la documentacio de {@linkplain #potenciaRec(double, int)} i {@linkplain  #factorial(int num)}</p>
     * @author <b><i>Santi</i></b> i <b>Palanka</b>
     * @param x Base del exponent que volem per el metode potenciaRec().
     * @param n Vegades que volem que incrementi el bucle for.
     * @return Resultat de la la suma de la operacio potenciaRec(x, i)/factorial(i) feta n vegades. 
     */
    public static double potenciaE2Params(int x, int n){
    
        double resultat=1.0;
        
        for (int i = 1; i <= n; i++) {
            
            resultat+= potenciaRec(x, i)/factorial(i);
            
        }
    
        return resultat;
    
    }
    
    /**<p>El mètode potenciaE que rep un enter com a paràmetre i retorna la potència d'℮ elevat al paràmetre especificat calculat de forma recursiva.</p>
     * @author <b><i>Santi</i></b> i <b>Palanka</b>
     * @param x Numero al que volem elevar ℮. 
     * @return El numero resultan de elevar ℮ al exponent que li indiquis al parametre x. 
     */
    public static double potenciaE(int x){
    
        return potenciaE2Params(x,11);
    
    }
    
    /**<p>Metode que calcula de forma recursiva el factorial del numero que li passem.</p>
     * <p><b>Casos especials:</b></p>
     * <ol>
     * <li>Si el paràmetre és negatiu retorna -1.</li>
     * <li>Si el paràmetre és negatiu retorna 0.</li>
     * </ol>
     * @author <b><i>Santi</i></b> i <b>Palanka</b>
     * @param num Numero que volem calucular el seu factorial
     * @return El calcul del valor factorial del numero que li passem al parametre.
     */
    public static int factorial(int num){
        if(num<0) return -1;
        if(num==0) return 1;
        return num*factorial(num-1);
        
    }
    
    /**<p>Metode que calcula de forma iterativa el factorial del numero que li passem.</p>
     * <p><b>Casos especials:</b></p>
     * <ol>
     * <li>Si el paràmetre és negatiu retorna -1.</li>
     * </ol>
     * @author <b><i>Santi</i></b> i <b>Palanka</b>
     * @param num Numero que volem calucular el seu factorial
     * @return El calcul del valor factorial del numero que li passem al parametre
     */
    public static int factorialIteratiu(int num){
        if(num<0) return -1;
        
        int resultat=1;
        
        while(num>1){
        
            resultat*= num;
            num=num-1;
        }
            
        return resultat;
        
        
    }
    
    
    

}
