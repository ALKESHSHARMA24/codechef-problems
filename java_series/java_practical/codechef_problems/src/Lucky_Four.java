import java.util.Scanner;

public class Lucky_Four {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int x=in.nextInt();
            int count=0;
            while(x>0) {
                int reminder = x%10;
                if (reminder == 4) {
                    count++;
                }
                x=x/10;
            }
        System.out.println(count);

        }
   }
}
