import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!isVowel(ch)) {
                result += ch; 
            }
        }

        System.out.println(result);
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); 
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
