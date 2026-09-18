package P1.Tugas;

public class Kendaraan {
    private String merk;
    private int kecepatan;

    public void setMerk(String merkName) {
        merk = merkName;
    }

    public void setKecepatan(int speed) {
        kecepatan = speed;
    }

    public void printInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Kecepatan : " + kecepatan + " km/h");
    }
}
