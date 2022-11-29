import java.util.Scanner;

public class odd_pairs {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int t= in.nextInt();

        for(int i=0;i<t;i++){
            int n=in.nextInt();
            int count=0;
            for(int a=1;a<=n;a++) {

                for(int b=1;b<=n;b++){

                    if((a+b)%2!=0){

                        count++;
                    }


                }

            }
            System.out.println(count);

        }

    }
}
