
public class InputDataCheckEx {

	public static void main(String[] args) {
		String userInput = "NaN"; 
		
		double val = Double.valueOf(userInput); 
		
		double currentBalance = 10000.0;
		
		if (Double.isNaN(val)) { // NaN�� �˻�
			System.out.println("NaN�� �ԷµǾ� ���� �Ұ�");
			val = 0.0;
		}
		
		currentBalance += val; // currentBalance ���� ���� 
		System.out.println(currentBalance);

	}

}
