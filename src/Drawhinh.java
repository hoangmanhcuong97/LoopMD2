import java.util.Scanner;

public class Drawhinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Menu:");
        System.out.println("0. Exit");
        System.out.println("1. Hình chữ nhật");
        System.out.println("2. Hình tam giác vuông, có cạnh góc vuông ở botton-left");
        System.out.println("3. Hình tam giác vuông, có cạnh góc vuông ở top-left");
        System.out.println("4. hình tam giác cân.");
        System.out.println("Choice a number:");
        number = sc.nextInt();

        switch (number) {
            case 0:
                System.exit(0);
                break;
            case 1:
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 5; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for (int r = 1; r <= 5; r++){
                    for(int c = 1; c <= r; c ++){
                        System.out.print(" * ");
                    }
                        System.out.println("");
                }
                break;
            case 3:
                for(int r = 5; r >= 1; r--){
                    for (int c = 1; c <= r ; c++) {
                        System.out.print(" * ");
                    }
                        System.out.println("");
                }
                break;
            case 4:
                    for (int r = 1; r <= 7; r++) {
                        for (int c = 7; c >= r; c--) {
                            System.out.print(" ");
                            for (int i = 0; i <= c; i++) {
                                System.out.print(" * ");
                            }
                        }
                        System.out.println(" * ");
                    }
                break;
        }
    }
}
