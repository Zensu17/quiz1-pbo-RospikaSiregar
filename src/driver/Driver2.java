import java.util.Scanner;
public class Driver2 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int N = input.nextInt();
      String[] nama = new String[N];
      int[] nilai = new int[N];
      for (int i = 0; i < N; i++) {
        nama[i] = input.next();   
        nilai[i] = input.nextInt();
        }

        String kodeKelompok = input.next();

        int total = 0;

        for (int i = 0; i < N; i++) {

            if (kodeKelompok.equals("A") && i % 2 == 0) {
                total += nilai[i];
                System.out.println(nama[i] + " - " + nilai[i]);
            } else if (kodeKelompok.equals("B") && i % 2 != 0) {
                total += nilai[i];
                System.out.println(nama[i] + " - " + nilai[i]);
            }
    }
     System.out.println(total);
    
    }
}
