import java.util.Scanner;
public class oneDimensionalArray{
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Please enter Student Marks"+i+1);
            arr[i]=s.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i]+" ");
        }
    }
}