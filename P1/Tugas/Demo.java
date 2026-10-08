package P1.Tugas;

public class Demo {
    public static void main(String[] args) {
        Televisi tv1 = new Televisi();
        Speaker speaker1 = new Speaker();
        SepedaMotor motor1 = new SepedaMotor();
        Mobil mobil1 = new Mobil();

        tv1.setMerk("Samsung");
        tv1.setUkuranLayar(42);
        tv1.printInfo();

        speaker1.setMerk("JBL");
        speaker1.setVolumeMax(100);
        speaker1.printInfo();

        motor1.setMerk("Honda");
        motor1.setKecepatan(80);
        motor1.setKapasitasMesin(150);
        motor1.printInfo();

        mobil1.setMerk("Toyota");
        mobil1.setKecepatan(120);
        mobil1.setJumlahPintu(4);
        mobil1.printInfo();
    }
}
