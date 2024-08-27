import java.util.Scanner;
class SI{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the principle amount");
            int p=input.nextInt();
        System.out.println("Enter the time");
            int t=input.nextInt();
        System.out.println("Enter the rate");
            int r=input.nextInt();

        int si=(p*t*r)/100;

        System.out.println(si + " is the simple intrest");   
}

}