
class Neon{
    public static void main(String[] args){
        int n=81;
        int Square=n*n;
         int sum=0;
        while(Square>0){
            sum+=Square%10;
            Square/=10;
        }
        if(sum==n){
            System.out.println(" 81 is neon number");
        }
          else{
              System.out.println("81 is not neon number");
        }
    }
}