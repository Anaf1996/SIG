import java.util.Scanner;

public class Factorial_multi{
	public static int factorial(int a){
		if (a>1){
			return a*(factorial(a-1));
			
		}else{
			return 1;
		}
	}
	public static int multiplicar(int x, int p){
		if (p>1){
			return x+multiplicar(x,p-1);
			
		}else{
			return x;
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Que desea hacer");
		System.out.println("1: calcular factorial:");
		System.out.println("2: calcular multiplicacion:");
		int opcion = sc.nextInt();
		if (opcion==1){ 	
			System.out.println("Ingrese el numero a calcular factorial:");
			int numero = sc.nextInt();
	
			if (numero<0){
				System.out.println("No es posible calcular factorial");
			}else{
				int resultado = factorial(numero);
			System.out.println("El factorial de " + numero + " es " + resultado);
			}
		}else if (opcion==2){
			System.out.println("Ingresar numero a multiplicar");
			System.out.println("Ingrese el numero 1:");

			int numero1 = sc.nextInt();
		
			System.out.println("Ingrese el numero 2:");

			int numero2 = sc.nextInt();	
	
			int resultado2 = multiplicar(numero1,numero2);
			System.out.println("La multiplicacion entre "+numero1+ numero2+" es " + resultado2);
		
			} 
		sc.close();
	}

}

