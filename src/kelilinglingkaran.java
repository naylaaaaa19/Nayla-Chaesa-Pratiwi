import java.util.Scanner;

public class kelilinglingkaran {
public static void main(String[] args) {
try (Scanner inputan = new Scanner (System.in)) {
    System.out.print("Masukkan jari-jari" );
    Double jarijari = inputan.nextDouble();  
    
    System.out.print("Masukkan keliling lingkaran: ");
    Double keliling = 2 * Math.PI * jarijari;
    
    System.out.println("keliling lingkaran adalah = " + keliling);
    inputan.close();
}

}
}
