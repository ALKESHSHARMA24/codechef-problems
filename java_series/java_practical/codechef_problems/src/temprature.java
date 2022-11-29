import java.util.Scanner;

public class temprature {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();


        for(int i=0;i<t;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();

            if(b>=a && b>=c){

                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
