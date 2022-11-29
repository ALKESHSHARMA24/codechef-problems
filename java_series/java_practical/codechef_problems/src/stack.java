    class stack2
    {

        public class stack {



            public static void main(String[] args) {
                // TODO Auto-generated method stub

                stack2.push(5);
                stack2.push(3);
                stack2.push(7);
                stack2.dis();
            }



        }
        public static int arr[]= new int[10];
        public static int top = -1 ;

        public static void push(int elem)
        {

            if(top == arr.length-1)
            {  System.out.println(" stack full ");

                return ;
            }
            arr[++top]=elem;
        }

        public static void pop()
        {
            if(top==-1)
            {
                System.out.println("stack empty");
                return;
            }
            int elem = arr[top];
            top--;
            System.out.println(elem);
        }

        public static void dis()
        {
            //you can display like this
            for(int i = 0 ; i < arr.length ; i++)
            {
                System.out.println(arr[i]+" ");
            }
        }

    }

// why is my code not working for display in stack implementation

