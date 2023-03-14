import java.io.*;;
public class App {
    public static String makePalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return s.charAt(s.length() - 1) + makePalindrome(s.substring(0, s.length() - 1)) + s.charAt(s.length() - 1);
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        System.out.println("Masukkan kata");
        s = br.readLine();
        String palindrome = makePalindrome(s);
        System.out.println(palindrome); 
    }
}