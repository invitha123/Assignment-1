import java.util.Scanner;
class find{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int in=input.nextInt();


        if (in%2==0){
            System.out.println(in + " is even number");
        }

        else{
            System.out.println(in + " is odd number");
        }
    }
}