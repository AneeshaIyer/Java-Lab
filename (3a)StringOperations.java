package BM23AI021;
import java.util.Scanner;
public class String_Operations {
    public static Boolean Compare(String str1, String str2) {
        if( str1.equals(str2)) {
            return true;
        }
        else{
            return false;
        }
    }
    public static String Concatenate(String str1, String str2){
        return str1 + str2;
    }
    public static String Copy(String str1){
        
        return new String(str1);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        System.out.println("Comparing Strings:\n"+Compare(s1,s2));
        System.out.println("Concatenating Strings:\n"+Concatenate(s1,s2));
        System.out.println("Copying first String:\n"+Copy(s1));
    }
}

