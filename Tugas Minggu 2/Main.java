import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String nama= scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        Integer nim = scanner.nextInt();
 
        System.out.print("Masukkan Nilai Tubes: ");
        double nialiTubes = scanner.nextDouble();

        System.out.print("Masukkan Nilai Quiz: ");
        double nilaiQuiz  = scanner.nextDouble();

        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        Hitung Nilai = new Hitung();
        double nilaiAkhir = Nilai.nilaiAkhir(nialiTubes, nilaiQuiz, nilaiTugas, nilaiUTS, nilaiUAS);
        
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai Matakuliah Pemograman Berorientasi Objek :" + nilaiAkhir);

        scanner.close();
    }   
}
