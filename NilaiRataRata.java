import java.util.Scanner;

public class NilaiRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = input.nextInt();
        
        double[] nilai = new double[jumlah];
        double total = 0;
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i+1) + ": ");
            nilai[i] = input.nextDouble();
            total += nilai[i];
        }
        
        double rata = total / jumlah;
        System.out.println("\nRata-rata nilai siswa: " + rata);
    }
}


