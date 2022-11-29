import java.util.Scanner;

public class weights {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int t=in.nextInt();
        for(int i=0;i<t;i++){

            int w=in.nextInt();
            int x=in.nextInt();
            int y=in.nextInt();
            int z=in.nextInt();

            if(w==x||w==y||w==z){
                System.out.println("yes");

            }
            else if(w==x+y||w==y+z||w==x+z){
                System.out.println("yes");
            }
            else if(w==x+y+z){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
