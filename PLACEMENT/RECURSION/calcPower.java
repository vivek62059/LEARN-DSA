public class calcPower {
    public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        // int xnm1=calcPower(x,n-1);
        // int xnm=x*xnm1;
        // return xnm;
        if(n%2==0){
            return calcPower(x,n/2)*calcPower(x,n/2);
        }
        else{
            return calcPower(x, n/2)*calcPower(x, n/2)*x;
        }

    }
    public static void main(String[] args) {
       int ans= calcPower(4,2);
       System.out.println(ans);
        
    }
    
}
