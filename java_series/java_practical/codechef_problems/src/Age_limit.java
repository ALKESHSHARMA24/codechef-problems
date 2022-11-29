import java.util.Scanner;

public class Age_limit {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){

            int x= in.nextInt();
            int y= in.nextInt();
            int a= in.nextInt();

            if(a>=x && a<y){
                System.out.println("yes");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
