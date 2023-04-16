public class printFactorial {
    public static int printFact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact_nm=printFact( n-1);
        int fact_n=n*fact_nm;
        return fact_n;
        
    }
    public static void main(String[] args) {
        int n=5;
       int ans= printFact(n);
       System.out.println(ans);
    }
    
}
