public class Strreverse {
    public static void strReverse(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        strReverse(str, idx-1);
    }
    public static void main(String[] args) {
        String str="abcd";
        strReverse(str, str.length()-1);
        
    }
    
}
