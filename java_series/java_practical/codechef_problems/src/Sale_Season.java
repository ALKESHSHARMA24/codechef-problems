import java.util.Scanner;

public class Sale_Season {

    public static void main(String[] args) {
//        if X \le 100X≤100, no discount.
//        if 100 \lt X \le 1000100<X≤1000, discount is 2525 rupees.
//        if 1000 \lt X \le 50001000<X≤5000, discount is 100100 rupees.
//        if X \gt 5000X>5000, discount is 500500 rupees.

        Scanner in=new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){

            int x=in.nextInt();

            if(x<=100){
                x=x;
            }
            else if (x>=100 && x<=1000){
                x=x-25;
            }
            else if (x>=1000 && x<=5000){
                x=x-100;
            }
            else{
                        x=x-500;
            }
            System.out.println(x);
        }

    }
}
