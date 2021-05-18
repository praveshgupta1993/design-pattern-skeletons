package design.pattern.skeletons.structural.facade;

import java.util.Objects;

public class FacadeImpl implements Facade {

	private Service1 service1;
	private Service2 service2;
	
	public FacadeImpl() {
		service1 = new Service1Impl();
		service2 = new Service2Impl();
	}
	
	@Override
	public Object method1() {
		System.out.println("FacadeImpl->method1");
		Object ret = service1.method1();
		return ret;
	}

	@Override
	public Object method2() {
		System.out.println("FacadeImpl->method2");
		Object ret = service1.method1();
		if(Objects.nonNull(ret)) {
			ret= service2.method1();
		}
		return ret;
	}

}
