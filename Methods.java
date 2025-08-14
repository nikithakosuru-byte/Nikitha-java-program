public class Methods {
    public static void main(String[] args) {
        Methods m=new Methods();
        m.sayHello();
        m.addNumber(4,5);
        m.addNumber(3,5);
        int k=m.multiplyNumber(6,7);
        System.out.println(k);
    }
    void sayHello(){
        System.out.println("Krishna");
    }
    void addNumber(int a,int b){
        System.out.println(a+b);
        System.out.println(a*b);
    }
    int multiplyNumber(int a,int b){
        int x=a*b;
        return x;
    }
}
