package Ch05_Array;

public class Practice5_4 {

	public static void main(String[] args) {
		int[][] arr = {
				{ 5, 5, 5, 5, 5 },
				{ 10, 10, 10, 10, 10 },
				{ 20, 20, 20, 20, 20 },
				{ 30, 30, 30, 30, 30 }
		};

		int total = 0;
		float average = 0;

		// 알맞은 코드를 넣어 완성하시오 - 총합과 평균을 구하는 프로그래믈 구하시오
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				total += arr[i][j];
		} // end of for i
		average = total / (arr.length * arr[0].length); // 2차원 배열의 합계를 구하기 위함: arr.length * arr[0].length

		System.out.println("total = " + total);
		System.out.println("average =" + average);

	} // end of main

} // end of class
