import java.util.Scanner;

public class interview {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        for(int i=0;i<n;i++){

            int number=in.nextInt();
            int temp=number;
            int ans=0;
            while(temp>0){

                int rem=temp%10;
                ans=ans*10+rem;
                temp=temp/10;
            }
           // System.out.println(ans);

            if( ans == number){
                System.out.println("WIN");
            }
            else {
                System.out.println("LOSSES");
            }
        }
    }
}
