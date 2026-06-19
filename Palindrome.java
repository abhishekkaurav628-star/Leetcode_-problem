public class Palindrome {
    public static void main(String[] args){
        int a = 123;
        int rev = 0;
        int temp = a;

        while(a>0){
            int digit = a%10;
            rev = rev*10 + digit;
            a/=10;


        }
        if(temp==rev){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        
    }
    
}
