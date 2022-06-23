package Q2;

public class matiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] matriz = new int[2][2]; 
		int impar=1;
		for(int linhas=0;linhas<2;linhas++){
			for(int cols=0;cols<2;cols++){
				matriz[linhas][cols]=impar;		
				if (linhas==cols)
					System.out.printf("%d\t",matriz[linhas][cols]);
				else
					System.out.printf("0\t");
				impar+=2;
			}
			System.out.printf("\n");
			}

		
		
	}

}
