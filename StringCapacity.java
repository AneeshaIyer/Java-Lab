package BM23AI021;
import java.util.Scanner;
public class More_operations {
    public static void main(String[] args){
        StringBuffer sb1=new StringBuffer();
        System.out.println("Capacity of Buffer string object:\n"+sb1.capacity());
        StringBuffer sb2 =new StringBuffer("Hello");
        System.out.println("Capacity of Buffer string object:\n"+ sb2.capacity());
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String s1=scanner.nextLine();
        StringBuffer s2=new StringBuffer(s1);
        String s3=s2.reverse().toString().toUpperCase();
        StringBuffer s6=new StringBuffer(s3);
        System.out.println("Reversed uppercase string is:\n"+s3);
        System.out.println("Enter another string:");
        String s4=scanner.nextLine();
        StringBuffer s5=new StringBuffer(s4);
        StringBuffer s7=new StringBuffer(s6.append(s5));
        System.out.println("Appended string is:\n"+s7);
        System.out.println("Capacity of Buffer string object:\n"+ s7.capacity());
    }
}
