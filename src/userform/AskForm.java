package userform;

import java.util.Scanner;

public class AskForm {

	public static void main(String[] args) {
		UserForm user1 = new UserForm();
		Scanner scan = new Scanner(System.in);
		System.out.print("사용하실 ID를 입력하세요 : ");
		user1.setId(scan.next());
		System.out.print("사용하실 비밀번호를 입력하세요 : ");
		user1.setPassword(scan.next());
		System.out.print("사용자 이름을 입력하세요 : ");
		user1.setName(scan.next());
		System.out.print("사용자 전화번호를 입력하세요 : ");
		user1.setPhone_number(scan.next());
		user1.setLevel(1);
		System.out.println(user1.getName() + "님의 ID인 " + user1.getId() + "로 가입이 완료되었습니다.");
		int i = 0;
		while (i < 1) {
			System.out.print("회원님의 전화 번호인 " + user1.getPhone_number() + "로 알림메세지를 수신합니까? (수신 : Y 또는 y,거부 : N 또는 n) : ");
			user1.setMmslist(scan.next());
			if ((user1.getMmslist().equals("Y")) || (user1.getMmslist().equals("y"))) {
				System.out.print("수신확인 되었습니다.");
				i++;
			} else if ((user1.getMmslist().equals("N")) || (user1.getMmslist().equals("n"))) {
				System.out.print("수신거부 되었습니다.");
				i++;
			} else {
				System.out.print("다시 입력해주세요.");
			}
		}
		scan.close();
	}

}
