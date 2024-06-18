import java.util.Scanner;
public class fatorial {

    public static void main (String[] args){
    
    int numero=0, fat=1;

    Scanner scanner = new Scanner(System.in);

    System.out.print("digite um numero: ");

    numero = scanner.nextInt();

    for (int i = numero; i >10; i--){
       fat = fat * i;
    }
    System.out.print("o fatorial de" + numero + "é" + fat);

    scanner.close();
}

}