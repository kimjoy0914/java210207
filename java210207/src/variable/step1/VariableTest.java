package variable.step1;

public class VariableTest {
	int age = 10;
	//메소드 추가하기
	void methodA(int x) {
		x = 5;
		System.out.println("x는 "+x);
	}
	public static void main(String[] args) {
		VariableTest vt = new VariableTest();
		System.out.println("age ==> "+vt.age);
	}

}
