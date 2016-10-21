/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema20;
import java.util.*;
/**
 *
 * @author jaime
 */
public class Problema20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2,o;
        n1=solicitarDato("1");  //solicitamos Datos
        n2=solicitarDato("2");
        o=operacion(n1,n2);   //Se hace la operacion
        mensajeSalida();
    }
    public static int solicitarDato(String d){  
        int dato;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el numero " + d);
        dato= teclado.nextInt();
        return dato ;
    }
    public static int operacion (int n1, int n2){ 
        int suma=0,i;   
        for(i=1;i<n1;i++){  //se suman todos los divisores del numero
             if(n1%i==0){
                suma=suma+i;  
        }
     }
   
     if(suma==n2){    //funcion if si suma de divisores es igual al segundo numero
     for(i=1;i<n2;i++){  // se suman los divisores del segundo numero
     if(n2%i==0){
      suma=suma+i;
               }
           }
        if(suma==n1){ //funcion if si suma de divisores es igual al primer numero
              System.out.println("los numeros " + n1 + " y " + n2 + " no son amigos");
           }else{
                   System.out.println("los numeros " + n1 + " y " + n2 + " son amigos");
           }
        }        
        
     return n1;
    }
    public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa"); //se agradece
        System.exit(0);//Sale del programa
     }
}

