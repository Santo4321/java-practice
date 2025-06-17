import java.util.*;
class EvenNumber {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out .println(" Enter a Number ");
        
        int a = sc.nextInt();
        
        if (a%2==0)
        {
            System.out.println(" The number is Even Number  ");
            
        }
        
        else 
        {
            System.out.println(" The Number is Odd Number   ");
        }
        
    }
}
