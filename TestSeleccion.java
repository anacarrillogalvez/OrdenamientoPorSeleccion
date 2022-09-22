/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_de_seleccion;

/**
 *
 * @author Annie
 */
public class TestSeleccion {
    public static void main(String[] args) {
        Metodo_De_Seleccion ordena = new Metodo_De_Seleccion();
        int [] arr = {23, 12, 8, 7, 1, 4, 3, 2, 11};
       ordena.seleccion(arr);
       ordena.imprime(arr);
    }
}
