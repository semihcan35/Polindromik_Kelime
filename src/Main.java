import java.util.Scanner;
public class Main {
    static boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!= str.charAt(j))
                return false;
           i++;
           j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        System.out.print("Kelimeyi giriniz:");
        word=input.nextLine();

        if(isPalindrome(word)){
            System.out.println("Kelime palindromiktir.");
        }else{
            System.out.println("Kelime palindromik değildir.");
        }
    }
}