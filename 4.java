import java.util.Scanner;
class operations{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
            int n1=input.nextInt();
        System.out.println("Enter the another number");
            int n2=input.nextInt();
        
        if (n1>n2){
            System.out.println("The addition is " + (n1+n2) + " and the multiplication is " + (n1*n2));
        }
        else{
            System.out.println("The Subtraction is " + (n1-n2) + " and the Division is " + (n1/n2));
        }

        
            
   
}

}