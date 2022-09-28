package inheritanceDemo;

public class Main {
	public static void main(String[] args) {
		CreditUI myCreditUI = new CreditUI();

		myCreditUI.calculateCredit(new TeacherCreditManager());
	}
}
