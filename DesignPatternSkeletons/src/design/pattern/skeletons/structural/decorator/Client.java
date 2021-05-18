package design.pattern.skeletons.structural.decorator;

public class Client {

	public static void main(String[] args) {
		DecoratedClass decoratedClassObject = new DecoratedClass();
		DecoratorClass decoratorClassObject = new DecoratorClass(decoratedClassObject);
		decoratorClassObject.method1();
		decoratorClassObject.method2();
	}

}
