package P1.Tugas;

public class Speaker {
    private String merk;
    private int volumeMax;

    public void setMerk(String merkName) {
        merk = merkName;
    }

    public void setVolumeMax(int volume) {
        volumeMax = volume;
    }

    public void printInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Volume Maksimal : " + volumeMax);
    }
}
