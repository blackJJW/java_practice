
public class SwitchNoBreakEx {

	public static void main(String[] args) {
		int time = (int)(Math.random() * 4) + 8; 
			// 8<= ... <=11 ������ ���� �̱�
		System.out.println("[����ð� : " + time + " ��]");
		
		switch(time) {
			case 8:
				System.out.println("���");
			case 9:
				System.out.println("ȸ��");
			case 10:
				System.out.println("����");
			default:
				System.out.println("�ܱ�");
		}

	}

}
