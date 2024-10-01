import java.util.Scanner;

public class luaspersegipanjang {
public static void main(String[] args) {
Scanner inputan = new Scanner (System.in);
System.out.print("Masukkan panjang" );
Double panjang = inputan.nextDouble();

System.out.print("Masukkan lebar");
Double lebar = inputan.nextDouble();

Double luaspersegipanjang = panjang * lebar;

System.out.println("luas persegi panjang = " + luaspersegipanjang );

inputan.close();
}
}
