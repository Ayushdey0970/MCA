interface Interface1 {
    void method1a();

    void method1b();
}

interface Interface2 {
    void method2a();

    void method2b();
}

interface Interface3 {
    void method3a();

    void method3b();
}

interface NewInterface extends Interface1, Interface2, Interface3 {
    void newMethod();
}

class ConcreteClass {
}

class MyClass extends ConcreteClass implements NewInterface {
    @Override
    public void newMethod() {
        System.out.println("Executing newMethod()");
    }

    @Override
    public void method1a() {
        System.out.println("This is First Method of First Interface");
    }

    @Override
    public void method1b() {
        System.out.println("This is Second Method of First Interface");
    }

    @Override
    public void method2a() {
        System.out.println("This is First Method of Second Interface");
    }

    @Override
    public void method2b() {
        System.out.println("This is Second Method of Second Interface");
    }

    @Override
    public void method3a() {
        System.out.println("This is First Method of Third Interface");
    }

    @Override
    public void method3b() {
        System.out.println("This is Second Method of Third Interface");
    }
}

public class q5_interfaces {
    static void methodWithInterface1(Interface1 obj) {
        obj.method1a();
        obj.method1b();
    }

    static void methodWithInterface2(Interface2 obj) {
        obj.method2a();
        obj.method2b();
    }

    static void methodWithInterface3(Interface3 obj) {
        obj.method3a();
        obj.method3b();
    }

    static void methodWithNewInterface(NewInterface obj) {
        obj.method1a();
        obj.method2b();
        obj.newMethod();
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        methodWithInterface1(myObject);
        methodWithInterface2(myObject);
        methodWithInterface3(myObject);
        methodWithNewInterface(myObject);
    }
}
