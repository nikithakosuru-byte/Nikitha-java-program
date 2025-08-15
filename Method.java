

public class Method {
    public static void main(String[] args) {
        Method m = new Method();
        m.sayHello();
        m.addNumber(5, 6);
    }

    void sayHello() {
        System.out.println("Hi Nikitha Kosuru");
    }

    void addNumber(float a, float b) {
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);
    }

}

