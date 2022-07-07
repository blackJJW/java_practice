
public class CheckOverflowEx {

	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
			
		} catch(ArithmeticException e){
			System.out.println("Overflow �߻�. ��� �Ұ�"); // ���� ó�� �ڵ�
		}

	}
	
	public static int safeAdd(int left, int right) {
		if (right > 0) {
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("Overflow!!!"); // ���� �߻� �ڵ�
			}
		} else { // right <= 0 �� ���
			if(left < Integer.MIN_VALUE - right) {
				throw new ArithmeticException("Overflow!!!"); // ���� �߻� �ڵ�
			}
		}
		return left + right;
	}

}
