import java.util.Scanner;

public class Biryani_class {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int ans;
            int x= in.nextInt();
            int y= in.nextInt();

            ans=x*y;
            System.out.println(ans);

        }
    }
}
