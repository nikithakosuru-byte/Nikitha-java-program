class Pattern{
    public static void main(String[] args){
        int a=10;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  *");
            }
            System.out.print(" ");
        }
        if(a==3){
            System.out.print("          * * *");
            System.out.print(" ");
        }
        if(a==4){
            System.out.print("* * *     ");
            System.out.print(" ");
        }
    }
}