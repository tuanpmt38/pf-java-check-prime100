public class CheckPrime {
    public static void main(String[] args) {
        int number;
        for (number = 1; number < 100; number++) {
            boolean check = true;
            {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check)
                    System.out.println(+number);
            }
        }
    }
}