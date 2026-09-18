package P3.motorencapsulation.percobaan2;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan < 100) {
                kecepatan += 5;
                if (kecepatan > 100) {
                    kecepatan = 100; 
                }
            } else {
                System.out.println("Kecepatan sudah maksimal (100)!");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off!\n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            if (kecepatan > 0) {
                kecepatan -= 5;
            } else {
                System.out.println("Kecepatan sudah 0, tidak bisa dikurangi lagi!\n");
            }
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off!\n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
