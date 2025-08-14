public class Pattern{
    public static void main(String[] args){
        int a=4;
        for( int i=1;i<=a;i++) {
            int star = i;
            int space = 2 * (a - i);
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=a-1;i>=1;i--){
                int star=i;
                int space=2*(a-i);
                for(int j=1;j<=star;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=space;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
}