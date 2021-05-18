package design.pattern.skeletons.structural.facade;

public class Service2Impl implements Service2 {

	@Override
	public Object method1() {
		System.out.println("Service2Impl->method1");
		return new Object();
	}

}
