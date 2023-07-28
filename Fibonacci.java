import java.util.Scanner; //poder importar clse para ler num
public class Fibonacci {

	public static void main(String[] args) {
		Scanner ing = new Scanner(System.in);// linea para poder pedir num declarandola con ing
		
		 int num; //variable con valor que usuario ingresa
		 int num1;//variables que llevaran valor 0 y 1
		 int num2;
		 int fib; // num guardado
		  
	        do{ //llaves do
	            System.out.print("Ingresa  un numero");//pido un num
	            num = ing.nextInt();
	        }while(num<=1);
	  
	        System.out.println(num);                 

	        num1=0; //variables que traen valor 0 y 1 para sumar con valor ingresado
	        num2=1;

	        System.out.print(num1 + " ");// se suma variable num 
	        for(fib=2;fib<=num;fib++){  
	            System.out.print(num2 + " ");//se suma variable num2
	            num2 = num1 + num2; //suma de variable con la guardada
	            num1 = num2 - num1;
	        }
	        System.out.println(); //imprime resultado
	    }

}
