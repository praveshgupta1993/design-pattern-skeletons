package design.pattern.skeletons.structural.facade;

public class Service1Impl implements Service1 {

	@Override
	public Object method1() {
		System.out.println("Service1Impl->method1");
		return new Object();
	}

}
