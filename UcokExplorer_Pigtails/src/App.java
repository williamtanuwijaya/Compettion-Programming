import java.io.*;

public class App {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.print("Masukkan angka : ");
        int jumlah = Integer.parseInt(br.readLine());
        System.out.println(test(jumlah));
    }

    static int test(int jumlah) {
        if (jumlah == 0) {
            return 0;
        } else if (jumlah % 2 == 0) {
            return 3 + test(jumlah - 1);
        } else {
            return 2 + test(jumlah - 1);
        }
    }
}
