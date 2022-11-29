import java.util.Scanner;

public class kitchen_timetable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        int count = 0;


        for (int i = 0; i < t; i++) {
            int N = in.nextInt();
            for (int i1 = 0; i1 < N; i1++) {
                int value = 0;
                int a1 = in.nextInt();
                int a2 = in.nextInt();
                int a3 = in.nextInt();

                int b1 = in.nextInt();
                int b2 = in.nextInt();
                int b3 = in.nextInt();

//            if(b1<=a1){
//             count++;
//            }

                switch (value) {
                    case 0:
                        if (b1 <= a1-0) {
                            count++;
                        }

                    case 1:
                        if (b2 <= a2 - a1) {
                            count++;
                        }
                    case 2:

                        if (b3 <= a3 - a2) {
                            count++;
                            break;
                        }

                }
                System.out.println(count);
            }
        }
    }
}
