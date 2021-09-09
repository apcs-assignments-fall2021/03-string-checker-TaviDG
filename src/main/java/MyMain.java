import java.util.Scanner;

public class MyMain {
    public static boolean compareChar(char one, char two){
        return (one==two);
    }
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int abc = 0;
        for (int i=0;i<str.length();i++){
            char letter= str.charAt(i);
            if (compareChar(letter,'a')||compareChar(letter,'b')||compareChar(letter,'c')){
                abc=abc+1;
            }
        }
        return abc;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        return (str.indexOf("The")!=-1||str.indexOf("the")!=-1);
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=str.charAt(str.length()-(i+1))){
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the string you want to input");
        String str = scan.next();
        System.out.println(countABC(str));
        System.out.println(containsThe(str));
        System.out.println(isPalindrome(str));
    }
}
