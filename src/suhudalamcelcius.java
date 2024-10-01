import java.util.Scanner;

public class suhudalamcelcius {
public static void main(String[] args) throws Exception {
 Scanner inputan = new Scanner(System.in); 
 System.out.print("Masukkan Suhu dalam celcius: ");
 Double celcius = inputan.nextDouble();

 Double suhufahrenheit = (celcius * 9/5) + 32;

 System.out.println("suhu dalam fahrenheit= " + suhufahrenheit + "F");

 inputan.close();
}
    
}
