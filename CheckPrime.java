public class CheckPrime {
    public static void main(String[] args) {
        int number;
        System.out.println("Hiển thị 100 số nguyên tố đầu tiên:");
        for (number = 1; number < 100; number++) {
            boolean check = true;
            {
                int checknumber = (int) Math.sqrt(number);
                for (int i = 2; i <= checknumber; i++) {
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