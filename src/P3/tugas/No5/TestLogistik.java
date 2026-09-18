package P3.tugas.No5;

public class TestLogistik {
    public static void main(String[] args) {
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Memasukkan muatan baru seberat 4.000 kg...");
        kontainerAlfa.tambahMuatan(4000);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // Mencoba menurunkan 3.000 kg (> 50% dari 4.000 kg, yaitu max 2.000 kg)
        System.out.println("\nMencoba menurunkan muatan seberat 3.000 kg...");
        kontainerAlfa.turunkanMuatan(3000);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // Menurunkan 1.500 kg (<= 50% dari 4.000 kg)
        System.out.println("\nMenurunkan muatan seberat 1.500 kg...");
        kontainerAlfa.turunkanMuatan(1500);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
    }
}
