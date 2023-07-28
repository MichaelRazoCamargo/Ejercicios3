import java.util.Scanner; //poder importar clse para ler num

public class Nombre {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String Nombre =" "; //declaro variable nombre
		System.out.println("Ingresa tu nombre");//linea para ingreasar nombre
		Nombre= in.nextLine();//linea para escribir

for (int i=0; i<=Nombre.length()-1; i++) { //Length para poder imprimir caracteres de caden
			System.out.println(Nombre.charAt(i));//
	}
}

}
