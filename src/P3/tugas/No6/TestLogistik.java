package P3.tugas.No6;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("=== MANAJEMEN KARGO EKSPEDISI ===");
        System.out.println("Nomor Resi        : " + kontainerAlfa.getNomorResi());
        System.out.println("Nama Pemilik      : " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");
        System.out.println("Muatan Saat Ini   : " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        System.out.println("----------------------------------");

        System.out.print("Masukkan berat muatan yang ingin DITAMBAH (kg): ");
        double tambah = input.nextDouble();
        kontainerAlfa.tambahMuatan(tambah);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin DITURUNKAN (kg): ");
        double turun = input.nextDouble();
        kontainerAlfa.turunkanMuatan(turun);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        input.close();
    }
}
