/*
Programadora: Júlia Paes
Data: 20/07/2021
Objetivo: Construir um boletim de notas
*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double[][] mat = new double [3][4];
		String[] areas = new String[3];
		
		//leitura das áreas
		for(int a = 0; a<3;a++){
		    System.out.println("Informe a " + (a+1) + "º área: ");
		    areas[a] = leitor.nextLine();
		}
		
		//leitura das notas
		for(int a = 0; a<3; a++){
		    System.out.println("Informe as notas da área: " + areas[a]);
		    for(int n = 1; n<=3; n++){
		        do{
		            System.out.println("Informe a nota do " + n + "º trimestre: ");
		            mat[a][n] = leitor.nextDouble();
		        }while((mat[a][n]<0) || (mat[a][n]>10));
		    }
		}
	
		//Cálculo da média por disciplina e seu armazenamento.
		for(int m = 0; m<=2; m++){
		    mat[m][0] = (mat[m][1] + mat[m][2] + mat[m][3]) / 3;
		}
		
		//exibição
		
		System.out.printf("\t\t1T\t2T\t3T\tMédia\n");
		for(int i=0;i<=2;i++){ //linhas
		    System.out.printf("%s\t", areas[i]);
		    for(int j=1;j<=3;j++){ //colunas
		        System.out.printf("%.1f\t", mat[i][j]);
		    }
		    System.out.printf("%.1f\n", mat[i][0]);
		}
	}
}
