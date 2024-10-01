import java.util.Scanner; 

public class quiz {
    public static void main(String[] args) {
        try (Scanner inputan = new Scanner(System.in)) {
            System.out.print("Masukkan (kg) telur yang dibeli: ");
            Double KiloTelor = inputan.nextDouble();

            System.out.print("Masukkan uang bayar: ");
            Double UangBayar = inputan.nextDouble();

            double HargaTelur = KiloTelor * 28000;
            double Kembalian = UangBayar - HargaTelur;

            System.out.println("Harga telur per kilogram: " + Kembalian);
        }
    }
}


 
    

