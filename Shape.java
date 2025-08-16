 import java.util.Scanner;
class Shape{
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=5;i>=0;i++){
            System.out.println("please insert the values"+i+1);
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=4;i--){
            System.out.println(a[i]+" ");
        }
    }
}