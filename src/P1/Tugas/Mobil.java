package P1.Tugas;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public void setJumlahPintu(int pintu) {
        jumlahPintu = pintu;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah Pintu : " + jumlahPintu);
        System.out.println("Tipe : Mobil");
    }
}


