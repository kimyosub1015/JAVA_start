package userform;

import java.util.Scanner;

public class AskForm {

	public static void main(String[] args) {
		UserForm user1 = new UserForm();
		Scanner scan = new Scanner(System.in);
		System.out.print("����Ͻ� ID�� �Է��ϼ��� : ");
		user1.setId(scan.next());
		System.out.print("����Ͻ� ��й�ȣ�� �Է��ϼ��� : ");
		user1.setPassword(scan.next());
		System.out.print("����� �̸��� �Է��ϼ��� : ");
		user1.setName(scan.next());
		System.out.print("����� ��ȭ��ȣ�� �Է��ϼ��� : ");
		user1.setPhone_number(scan.next());
		user1.setLevel(1);
		System.out.println(user1.getName() + "���� ID�� " + user1.getId() + "�� ������ �Ϸ�Ǿ����ϴ�.");
		int i = 0;
		while (i < 1) {
			System.out.print("ȸ������ ��ȭ ��ȣ�� " + user1.getPhone_number() + "�� �˸��޼����� �����մϱ�? (���� : Y �Ǵ� y,�ź� : N �Ǵ� n) : ");
			user1.setMmslist(scan.next());
			if ((user1.getMmslist().equals("Y")) || (user1.getMmslist().equals("y"))) {
				System.out.print("����Ȯ�� �Ǿ����ϴ�.");
				i++;
			} else if ((user1.getMmslist().equals("N")) || (user1.getMmslist().equals("n"))) {
				System.out.print("���Űź� �Ǿ����ϴ�.");
				i++;
			} else {
				System.out.print("�ٽ� �Է����ּ���.");
			}
		}
		scan.close();
	}

}
