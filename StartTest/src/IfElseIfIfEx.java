
public class IfElseIfIfEx {

	public static void main(String[] args) {
		int score = 75;
		
		if (score >= 90) {
			System.out.println("90 ~ 100");
			System.out.println("A ���");
		} else if(score >= 80) {
			System.out.println("80 ~ 89");
			System.out.println("B ���");
		} else if(score >= 70) {
			System.out.println("70 ~ 79");
			System.out.println("C ���");
		} else {
			System.out.println("70 �̸�");
			System.out.println("D ���");
		}

	}

}
