import java.io.*;
public class App {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String name = "";
        name = br.readLine().toUpperCase();
        System.out.println(Soal6(name));
    }
    public static int Soal6(String name){
        if (name.length() < 2){
            return 0;
        } else if (name.substring(0,2).equalsIgnoreCase("HE")){
                return 1 + Soal6(name.substring(2));
            }
         else {
            return Soal6(name.substring(2));
        }
    }
}
