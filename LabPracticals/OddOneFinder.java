
import java.util.Random;


public class OddOneFinder{

	
	
	public static void main (String args[]){

		int mat[][] = new int[6][6];
		Random rand = new Random();

		for (int i=0; i<6; i++){
			for (int j=0; j<6; j++){
				mat[i][j] = rand.nextInt(2);
			}
		}

		for (int i=0; i<6; i++){
			for (int j=0; j<6; j++){
				System.out.print(mat[i][j] + " " );
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i=0; i<6; i++){
			int flag = 0;
			for (int j=0; j<6; j++){
				if (mat[i][j] == 1){
					if (flag == 0) {
						flag = 1;
					}
					else {
						flag = 0;
					}
				}
			}
			if (flag == 1){
				System.out.println( "Row no: " + (i + 1) + " are with odd row.");
			}
			flag = 0;
		}

		for (int i=0; i<6; i++){
			int flag = 0;
			for (int j=0; j<6; j++){
				if (mat[j][i] == 1){
					if (flag == 0) {
						flag = 1;
					}
					else {
						flag = 0;
					}
				}
			}
			if (flag == 1){
				System.out.println("Column No : " +  (i + 1) + " are with odd column.");
			}
			flag = 0;
		}

		
	}
}