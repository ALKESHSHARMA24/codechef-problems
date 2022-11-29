import java.util.Scanner;

public class candies_problem {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the nu of test cases");

        int t=in.nextInt();
        int i=0;
        int counter=0;
        while (i<t){
            System.out.println("enter the nu. of cities");
            int cities=in.nextInt();
            int[] c = new int[cities];
            int j=0;
            while (j <cities){
                c[j] = in.nextInt();
                j++;
            }
//            if(c[i]==c[j]){
//                counter++;
//                System.out.println(counter);
           
//
//            }

            for(int k=0;k<c.length--2;k++)
            i++;


        }

    }
}
