package design.pattern.skeletons.structural.decorator;

public class DecoratorClass extends DecoratedClass {

	private DecoratedClass decoratedClassObject;

	public DecoratorClass(DecoratedClass decoratedClassObjectArg){
		this.decoratedClassObject = decoratedClassObjectArg;
	}
	
	@Override
	public Object method1() {
		return decoratedClassObject.method1();
	}

	public Object method2() {
		System.out.println("DecoratorClass->method2");
		return new Object();
	}
	
}
