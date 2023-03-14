public class App {
    public static int calculateTotal(String s) {
        int total = 0;
        String[] words = s.split(" ");
        for (String word : words) {
            try {
                int number = Integer.parseInt(word);
                total += number;
            } catch (NumberFormatException e) {
            }
        }
        return total;
    }
    
    public static void main(String[] args) {
        String s = "6 corndog, 2 banana milk";
        int total = calculateTotal(s);
        System.out.println(total); 
    }
}
