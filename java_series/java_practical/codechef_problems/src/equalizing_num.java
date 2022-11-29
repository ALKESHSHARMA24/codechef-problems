import java.util.Scanner;

public class equalizing_num {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);


        int t= in.nextInt();
        for(int i=0;i<t;i++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int d=(a-b)/2;

            if(d<0) {
                if (a - d == b + d) {
                    System.out.println("yes");
                }
                else {
                    System.out.println("no");
                }
            }
            else {
             if (b+d==a-d) {
                 System.out.println("yes");
             }
             else {
                 System.out.println("no");
             }

        }


        }
    }

}
