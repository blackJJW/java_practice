package classEx;

public class Car3 {
	// �ʵ�
	String company = "A�ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	// ������
	Car3(){
	}
	
	Car3(String model){
		this(model, "����", 250);  // ȣ��
	}
	
	Car3(String model, String color){
		this(model, color, 250);  // ȣ��
	}
	
	Car3(String model, String color, int maxSpeed){
		// ���� ���� �ڵ�
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
