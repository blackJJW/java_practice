package org.opentutorials.javatutorials.array;

public class DefineDemo {

	public static void main(String[] args) {
		
		String[] classGroup = {"������", "������", "�ϳ���", "�̰���"};
		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[3]);
		
		String[] classGroup1 = new String[4];
		classGroup1[0] = "��ģ��";
		System.out.println(classGroup1.length);
		classGroup1[1] = "������";
		System.out.println(classGroup1.length);
		classGroup1[2] = "�Ѿƶ�";
		System.out.println(classGroup1.length);
		classGroup1[3] = "�̰���";
		System.out.println(classGroup1.length);
	}

}
