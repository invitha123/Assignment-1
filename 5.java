import java.util.Scanner;
class largest{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
            int n1=input.nextInt();
        System.out.println("Enter the another number");
            int n2=input.nextInt();
        
        if (n1>n2){
            System.out.println(n1 + (" is the largest number"));
        }
        else{
            System.out.println(n2 + (" is the largest number"));
        }

        
            
   
}

}