import java.util.Scanner;

public class volumekubus {
public static void main(String[] args) {
Scanner inputan = new Scanner(System.in);
System.out.print("Masukkan sisi: ");
Double sisi = inputan.nextDouble();

System.out.print("Masukkan volume kubus: ");
Double volume = sisi * sisi * sisi;

System.out.println("Volume kubus = " + volume);
inputan.close();
}
    
}
