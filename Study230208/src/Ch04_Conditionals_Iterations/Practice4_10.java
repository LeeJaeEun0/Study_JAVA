package Ch04_Conditionals_Iterations;
import java.util.Scanner;
public class Practice4_10 {

	public static void main(String[] args) {
		// 1~100사이의 임의의 값을 얻어서 answer에 저장한다
		int answer = (int) ((Math.random()*100)+1);//1번
		int input = 0;
		int count = 0;

		// 화면으로 부터 사용자 입력을 받기 위해서 Scanner클래스 사용
		Scanner scanner = new Scanner(System.in);
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요: ");
			input = scanner.nextInt(); // 입력받은 값을 변수 input에 저장한다
			
			//2번
			if(input == answer) {
				System.out.println("맞혔습니다.");
				System.out.println("시도횟수는 "+count+"번입니다.");
				break;
			}else if(input >= answer)
				System.out.println("더 작은 수를 입력하세요.");
			else
				System.out.println("더 큰 수를 입력하세요");
			
		}while(true); // end of do while
	} // end of main

} // end of class
