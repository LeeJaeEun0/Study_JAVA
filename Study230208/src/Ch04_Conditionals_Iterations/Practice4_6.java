package Ch04_Conditionals_Iterations;

public class Practice4_6 {

	public static void main(String[] args) {
		// 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if (i+j ==6)
					System.out.println("주사위가 6이 되는 경우 - 1번 주사위 : "+i+", 2번 주사위 : "+j+"입니다!");
			}// end of for j
		} // end of for i

	} // end of main

}// end of class
