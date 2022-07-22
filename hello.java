import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is ur name?");
        String name = scan.nextLine();
        System.out.println("hewwo "+ name);
        scan.close();
    }
}