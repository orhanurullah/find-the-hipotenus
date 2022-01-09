import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci Dik Kenar Uzunluğunu Girin: ");
        double kenar1 = scanner.nextInt();
        System.out.println("İkinci Dik Kenar Uzunluğunu Girin: ");
        double kenar2 = scanner.nextInt();
        System.out.println("Üçgenin Hipotenüsü = " +
                hipotenus(kenar1, kenar2));
        System.out.println("Üçgenin Çevresi = " +
                around(kenar1, kenar2, hipotenus(kenar1, kenar2)));
        System.out.println("Üçgenin Alanı = " +
                area(kenar1, kenar2));
    }

    public static double hipotenus(double a, double b){
        double hipo = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        return hipo;
    }
    public static double around(double a, double b, double c){
        return (a+b+c);
    }
    public static double area(double a, double b){
        return a * b / 2;
    }
}
