import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 int i, N, multiplicacao;
		 
		 System.out.print("Deseja a tabuada para qual valor? ");
		 N = sc.nextInt();
		 
		 multiplicacao = 0;
		 
		 for(i = 1; i <= 10; i++) {
	         multiplicacao = N * i;
	         System.out.println(N + " x " + i + " = " + multiplicacao);
		 }
		 
		 sc.close();
		
	}

}
