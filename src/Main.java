import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //waiting n input from the user.
        System.out.print("Sınıf sayısını giriniz: ");
        int n = input.nextInt();

        int powerOfFour = 1;
        int powerOfFive = 1;
        //formula with power of 4
        System.out.println("4'ün kuvvetleri: ");
        while (powerOfFour <= n) {
            System.out.println(powerOfFour);
            powerOfFour *= 4;
        }
        //formula with power of 5
        System.out.println("5'in kuvvetleri: ");
        while (powerOfFive <= n) {
            System.out.println(powerOfFive);
            powerOfFive *= 5;
        }
        input.close();
    }
}
