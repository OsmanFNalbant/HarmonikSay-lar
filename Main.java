import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Kaça kadar:");
    int a=sc.nextInt();
    double toplam=0;
    for(int i =1; i<=a ; i++) {
        toplam += (1.0/i);
    }
    System.out.println("Sonuc:"+toplam);
    }
}