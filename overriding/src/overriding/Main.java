package overriding;

public class Main {

	public static void main(String[] args) {
		BaseCreditManager[] creditManager = new BaseCreditManager[] { new AgricultureCreditManager(),
				new TeacherCreditManager(), new StudentCreditManager() };

		for (BaseCreditManager baseCreditManager : creditManager) {
			System.out.println(baseCreditManager.calculate(120));
		}
	}
}
