import java.util.Scanner;
class fi{
    public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number up to print the fibinacci");
        int n1=input.nextInt();

        int t1=0,t2=1,sum=0;

        for(int i=0;i<=n1;i++){

            System.out.print(t1 + " ");   
    
            sum=t1+t2;
            t1=t2;
            t2=sum;
        
        
        }
        
}

}