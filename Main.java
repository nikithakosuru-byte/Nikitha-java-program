class Main{
       static int addNumber(int a,int b){
         return a+b;
       }
    public static void main(String[] args) {
        int a=3,b=5;
        if(a>b){
            if (a == b) {

                System.out.println("A is Greater than b");
            }
            else{
                System.out.println("A is Less Than b");
            }
        }
        else{
            System.out.println("B is Greater than A");
        }
        int result=addNumber(3,5);
        System.out.println(result);
    }
}