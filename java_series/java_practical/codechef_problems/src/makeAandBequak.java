import java.util.Scanner;

public class makeAandBequak {
    public static void main(String[] args) {


        Scanner in=new Scanner(System.in);

        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a=in.nextInt();
            int b=in.nextInt();

            if (a == b) {

                System.out.println("YES");
            }
            else if (a<b) {
                a=a*2*2;
                    if(a==b){
                    System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
            }
            else if (b<a) {
                b=b*2*2;
                if(a==b){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }



        }
    }
}
