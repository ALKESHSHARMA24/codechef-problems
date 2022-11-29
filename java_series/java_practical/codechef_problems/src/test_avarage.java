import java.util.Scanner;

public class test_avarage {
    /* package codechef; // don't place package name! */


    /* Name of the class has to be "Main" only if the class is public. */

        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner in=new Scanner(System.in);


            int t= in.nextInt();
            for(int i=0;i<t;i++){

                int a=in.nextInt();
                int b= in.nextInt();
                int c=in.nextInt();

                if((a+b)/2<35){

                    System.out.println("fail");
                }
                 else if((b+c)/2<35){

                    System.out.println("fail");

                }
                 else if((a+c)/2<35){

                    System.out.println("fail");

                }
                else{
                    System.out.println("pass");
                }
            }



        }
    }


