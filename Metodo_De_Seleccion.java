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
public class Metodo_De_Seleccion {

      
    /**
     *
     * @param arr
     */
    public void seleccion(int[] arr){
                   
           for (int pivote = 0; pivote < arr.length; pivote++){
                int min = pivote;
                for (int aux = pivote + 1; aux < arr.length; aux++){
                    if(arr[aux]<arr[min]){
                        min=aux;
                    }
                }
                int temp=arr[pivote];
                arr[pivote]=arr[min];
                arr[min]=temp;
           
            }
        }
       void imprime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i] + "\t");
            
        }
    }
}
    
