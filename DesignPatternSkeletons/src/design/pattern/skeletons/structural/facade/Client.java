package design.pattern.skeletons.structural.facade;

public class Client {

	public static void main(String[] args) {
		Facade facade = new FacadeImpl();
		facade.method1();
		System.out.println();
		facade.method2();
	}
}
