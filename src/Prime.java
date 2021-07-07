public class Prime {
    public static void main(String[] args) {
        for (int j = 2; j < 100; j++) {
            if (checkPrime(j)) {
                System.out.print(j + "\t");
            }
        }
    }
    public static boolean checkPrime (int number){
        if (number < 2){
            return false;
        }else {
            for(int i = 2; i <= Math.sqrt(number); i++ ){
                if(number % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
