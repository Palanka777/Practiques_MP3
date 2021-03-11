/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

/**Metodes del programa dels escacs.
 *
 * @author david
 */
public class Escacs {
    
      /**Aquest metode tradueix les cordenades que passa un programa de analisis de moviments i ho tradueix a posicions d'escacs standards.
     *
     *
     *
     * @param x La part de la cordenada X que es traduira a numero de tablero d'escacs.
     * @param y La part de la cordenada Y que es traduira a lletra de tablero d'escacs.
     */
    public static void tractarElement( int x, int y) {

        char[] pos = {'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
        if(y != 0 || x != 0)
        System.out.println(pos[x-1] + "" + y);  
    }  
    
}
