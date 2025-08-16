import java.util.Scanner;
public class twoDimensionalArray{
    public static void main(String[] args) {
        int arr[][]=new int[5][6];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
            System.out.println("Please enter elements at row="+(i+1)+"and columns="+(j+1));
            arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}