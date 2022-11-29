import java.util.Scanner;

public class findPresentPopu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the initilally pooulation");

        int x=in.nextInt();

        System.out.println("Enter the population leave the town");
        int y=in.nextInt();

        System.out.println("Enter the immigrated leave the town");
        int z=in.nextInt();

        int ans=x-y+z;
        System.out.println("the total populaiton in the town is"+ ans );

    }
}
