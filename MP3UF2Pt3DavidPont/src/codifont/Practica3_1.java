/*
Aquesta es una segona versio del programa amb l'objectu de poder aillar un metode i passar-lo a la biblioteca, he utilitzat
el mateix tipus de esquema de seqüencia de recorregut pero amb unes petites modificacions.
he tingut que inicialitzar el vector a dalt i inicialitarVariables() le tingut que posar dins el bucle do while, d'aquesta
manera no he respectat 100% l'estructura pero he pogut aillar el metode parametrizant-lo.
 */
package codifont;

import java.util.Scanner;
import static metodes.Escacs.tractarElement;

/**Programa de traduccio de cordenades a posicions de tablero d'escacs
 *
 * @author Palanka
 */
public class Practica3_1 {
    static Scanner ent = new Scanner(System.in);
    static int[] cordenada = new int[2];
   
    /**Metode main que conte la sequencia a ejecutar.
     *
     * @param args
     */
    public static void main(String[] args) {

        
        
        do {
            
            inicialitzarVariables();
            tractarElement(cordenada[1], cordenada[0]);        
        
        } while (!tractamentFinal());

    }

    /**Aquest metode nomes inicialitza el vector.
     *
     */
    public static void inicialitzarVariables() {
        cordenada[1] = ent.nextInt();
        cordenada[0] = ent.nextInt();
    }



    /**Aquest metode serveix per posar final a la sequencia del programa i acabar.
     *
     * @return si una de les dues coordenades es 0 retorna true.
     */
    public static  boolean tractamentFinal() {
        
        return (cordenada[0] == 0 || cordenada[1] == 0);
    }

}
