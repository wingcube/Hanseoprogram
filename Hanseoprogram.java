import java.util.Scanner;
public class HanseoProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("진로과목 점수를 입력하세요 : ");
		int grade = scan.nextInt();

		if (grade >= 90) {
			System.out.println("등급은 A 입니다.");
		}
		else if (grade >= 80) {
			System.out.println("등급은 B 입니다.");
		}
		else if (grade >=70) {
			System.out.println("등급은 C 입니다.");
		}
		else {
			System.out.println("조금 더 노력하세요.");
		}
		
			
		scan.close();
	}

}
