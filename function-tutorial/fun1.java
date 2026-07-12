
public class fun1 {

    public static void main(String[] args) {
        
        String str = "@#4789abcdAertYYU{}{-=";
        int digit = 0;
        int alpha = 0;
        int special  =0 ;
        for(int i=0; i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                digit++;
            }else if(Character.isAlphabetic(str.charAt(i))){
                alpha++;
            }else{
                special++;
            }
        }
        System.out.println(digit);
        System.out.println(alpha);
        System.out.println(special);
    }
}
