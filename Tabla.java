import java.util.Scanner; //poder importar clase para leer
public class Tabla {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int num;//declaro variable num
		Scanner val1 = new Scanner(System.in);
        
        System.out.print("Introduce un numero de la tabla de multiplicar: ");//linea para pedir num de tabla de multilicar
        num = val1.nextInt(); //ingresar valor
        int multiplica =1;
        while(multiplica <=10) {        //variable multiplic menor a 10
        System.out.println("Tabla de multiplicar de "+ num);
        System.out.println (num + "X" + multiplica + "="+ num * multiplica);
        multiplica++;
        }//concateno mi variables
         }

}
