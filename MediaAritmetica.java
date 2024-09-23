
import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		 double N1, N2, N3 , N4 , N5, MD1, NE, MD2;
		N5= 4;
	
		System.out.println("A nota do primeiro bimestre do aluno foi: ");
			N1= sc.nextInt();
			System.out.println("A nota do segundo bimestre do aluno foi: ");
			N2= sc.nextInt();
			System.out.println("A nota do terceiro bimestre do aluno foi: ");
			N3= sc.nextInt();
			System.out.println("A nota do quarto bimestre do aluno foi: ");
			N4= sc.nextInt();
			
			
			MD1 =( N1 + N2 + N3+ N4) / N5;
			System.out.println("A média aritmética do aluno é: " + MD1);


	}

}