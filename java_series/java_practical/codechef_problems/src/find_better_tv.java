import java.util.Scanner;

public class find_better_tv {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int t=in.nextInt();

        for(int i=0;i<t;i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            int c = in.nextInt();
            int d = in.nextInt();

            if (a - c < b - d) {
                System.out.println("first");
            }
            else if (a - c >b - d){
                System.out.println("second");
            } else if (a - c == b - d) {
                System.out.println("any");
            }

        }
    }
}
