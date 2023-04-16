import java.util.*;

public class printDec{
    public static void printDecr(int n){
        if(n==8){
            return;
        }
    System.out.println(n);
    printDecr(n+1);
    
    }
    public static void main(String args[]) {
     int n=1;
    printDecr(n);
        
    }
}