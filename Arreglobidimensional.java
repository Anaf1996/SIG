//Clase que coloca numeros aleatorios 
import java.util.Random;
public class Arreglobidimensional{
    //Asi se definen los arreglos en java
    public static void main(String[]args){
        Random aleatorio=new Random();
        //El arreglo tiene 100 posiciones, 0 1 2 3 4
        int suma=0;
        int min;
        int max;
        //Marco un arreglo de 100 posiciones, defino la variable
        int y[]= new int[100];
        int z[][]= new int[5][10];
        for(int i=0; i<z.length; i++){
            for(int j=0; j<z[i].length; j++){
                z[i][j]=aleatorio.nextInt(1000);
            }
        }
        for(int i=0; i<z.length; i++){
            for(int j=0; j<z[i].length; j++){
                System.out.print(z[i][j]+" ");
            }
        System.out.println(" ");
        }
    }
}
        