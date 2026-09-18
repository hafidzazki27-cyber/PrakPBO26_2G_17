package P1.Tugas;

public class SepedaMotor extends Kendaraan {
    private int kapasitasMesin;

    public void setKapasitasMesin(int cc) {
        kapasitasMesin = cc;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Kapasitas Mesin : " + kapasitasMesin + " cc");
        System.out.println("Tipe : Sepeda Motor");
    }
}

