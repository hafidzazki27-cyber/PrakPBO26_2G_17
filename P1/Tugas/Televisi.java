package P1.Tugas;

public class Televisi {
    private String merk;
    private int ukuranLayar;

    public void setMerk(String merkName) {
        merk = merkName;
    }

    public void setUkuranLayar(int inch) {
        ukuranLayar = inch;
    }

    public void printInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Ukuran Layar : " + ukuranLayar + " inch");
    }
}
