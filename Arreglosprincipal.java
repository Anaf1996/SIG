//Clase que coloca numeros aleatorios 
import java.util.Random;
//Clase  que permite ingresar datos del usuario
import java.util.Scanner;
public class Arreglosprincipal{
    //Asi se definen los arreglos en java
    public static void main(String[]args){
        Random aleatorio=new Random();
        Scanner ingreso = new Scanner(System.in);
        int x;
        //El arreglo tiene 5 posiciones, 0 1 2 3 4
        int y[]= new int[5];
        int z[][]=new int[3][3];
        int min;
        int max;
        x=ingreso.nextInt(10);
        x=aleatorio.nextInt(10);
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);
        System.out.println(aleatorio.nextInt(10));
        System.out.println(y[0]);
        for(int i=0; i<5; i++){
            ///Mostrar el arreglo
            y[i]=aleatorio.nextInt(100);
        }
        min=y[0];
        max=y[0];
        for(int i=0; i<5; i++){
            if(y[i]<min){
                min=y[i];
            }
            if(y[i]>max){
                max=y[i];    
            }
            System.out.println(y[i]+" ");
        }
        System.out.println("La posicion minima es"+min);
        System.out.println("La posicion maximo es"+max);
    }
}