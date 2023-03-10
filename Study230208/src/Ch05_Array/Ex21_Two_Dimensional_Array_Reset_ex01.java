package Ch05_Array;

public class Ex21_Two_Dimensional_Array_Reset_ex01 {

	public static void main(String[] args) {
		int[][] score = {
				{100,	100,	100},
				{20,	20,		20},
				{30,	30,		30},
				{40,	40, 	40}
		};
		
		int sum = 0;
		
		for(int i=0; i< score.length; i++) {
			for(int j=0; j< score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);
				
				sum += score[i][j];
			}// end of for j
		} // end of for i
		System.out.println("sum="+sum);
	} // end of main

} // end of class
