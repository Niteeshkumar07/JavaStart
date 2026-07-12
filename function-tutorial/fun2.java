

public class fun2 {

    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
        String st = "Abcdeioutyrhm";
        String str = st.toLowerCase();
        int n = str.length();
        int vowel = 0;
        int consonant = 0;
        for(int i=0; i<n; i++){
            if(isVowel(str.charAt(i))){
                vowel++;
            }else{
                consonant++;
            }
        }

        System.out.println(vowel);
        System.out.println(consonant);
    }
    
}
