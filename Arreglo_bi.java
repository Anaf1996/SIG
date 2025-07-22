import java.util.Random;
public class Arreglo_bi{
    //Asi se definen los arreglos en java
    public static void main(String[]args){
        Random aleatorio=new Random();
        //El arreglo tiene 100 posiciones, 0 1 2 3 4
        int suma=0;
        int min;
        int filas;
        int columnas;
        int max;
        //Marco un arreglo de 100 posiciones, defino la variable
        int z[][]= new int[4][3];
        for(int i=0; i<z.length; i++){
            for(int j=0; j<z[i].length; j++){
                z[i][j]=aleatorio.nextInt(10);
            }
        }
        for(int i=0; i<z.length; i++){
            for(int j=0; j<z[i].length; j++){
                System.out.print(z[i][j]+" ");
            }
        System.out.println(" ");
        }
        System.out.println(z.lenght);
        System.out.println(z[0].length);

        Double filas=z.lenght;
        Double columnas=z[0].length;
        Double promedio;
        while ()

            
    }
}
