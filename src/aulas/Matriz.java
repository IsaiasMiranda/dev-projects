package aulas;
import java.util.*;

public class Matriz{

	public static void main(String[] args){

		Scanner e = new Scanner(System.in);
		Random gerador = new Random();

		int m = e.nextInt();
		int n = e.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int l = 0; l < mat.length; l++){
			for(int c = 0; c < mat.length; c++){
				mat[l][c] = gerador.nextInt(100); 
			}
		}
		
		int x = e.nextInt();
		
		for(int l = 0; l < mat.length; l++){
			for(int c = 0; c < mat.length; c++){
				if (mat[l][c] == x) {
					System.out.println("Position " + l + "," + c + ":");
					if (c > 0) {
						System.out.println("Left: " + mat[l][c-1]);
					}
					if (l > 0) {
						System.out.println("Up: " + mat[l-1][c]);
					}
					if (c < mat[l].length-1) {
						System.out.println("Right: " + mat[l][c+1]);
					}
					if (l < mat.length-1) {
						System.out.println("Down: " + mat[l+1][c]);
					}
				}
			}
		}	
	}
}
