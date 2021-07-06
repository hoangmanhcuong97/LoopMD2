import java.util.Scanner;

public class NumberPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int count = 0;
        int i = 2;
        while (count < n){
            if(checkPrime(i)){
                System.out.println(i);
                count++;
            }
            i++;
        }
    }

    public static boolean checkPrime(int number){
        boolean check = true;
        if(number < 2) {
          return false;
        }else{
            for (int i = 2; i <= Math.sqrt(number) ; i++) {
                if(number % i == 0){
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

}
