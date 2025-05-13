package BM23AI021;
import java.util.Scanner;
public class Enumeration {
    public enum Days{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
        public boolean Workday(){
            return(this!=SATURDAY && this!=SUNDAY);
        }
    }
    public static void main(String[] args){
        System.out.println("Is Monday a workday?"+Days.MONDAY.Workday());
        System.out.println("Is Sunday a workday?"+Days.SUNDAY.Workday());
    }
}
