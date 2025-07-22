//Clase que coloca numeros aleatorios 
import java.util.Random;
public class Arreglos_promedio{
    //Asi se definen los arreglos en java
    public static void main(String[]args){
        Random aleatorio=new Random();
        //El arreglo tiene 100 posiciones, 0 1 2 3 4
        int suma=0;
        int min;
        int max;
        //Marco un arreglo de 100 posiciones, defino la variable
        int y[]= new int[100];
        
        for(int i=0; i<y.length; i++){
            ///Aplico numeros aleatorios a 100 datos
            y[i]=aleatorio.nextInt(100);
        }
        min=y[0];
        max=y[0];
        for(int i=0; i<y.length; i++){
            if(y[i]<min){
                min=y[i];
            }
            if(y[i]>max){
                max=y[i];    
            }
            System.out.println(y[i]+" ");
            suma=suma+y[i];
        }
        System.out.println("El promedio es"+suma/y.length);
    }
}
        