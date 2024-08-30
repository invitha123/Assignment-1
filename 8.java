import java.util.Scanner;

    class hello{
        public static void main(String args[]){
    Scanner s=new Scanner(System.in);
        System.out.println("Enter the String");
        String name=s.nextLine();
        name=name.toLowerCase();
        boolean ispalindrome=true;
        int i=0,j=name.length()-1;



        while(i<j){

            if(name.charAt(i) != name.charAt(j)){
                ispalindrome=false;
            }

            i++;
            j--;
        }

        if (ispalindrome)
        {
            System.out.println(name + " is a palindrome number");
        }

        else{
            System.out.println(name + " is not a palindrome number");
        }
    }

}
