public class CheckPrime {
    public static void main(String[] args) {
        int number;
        System.out.println("Hiển thị 20 số nguyên tố đầu tiên:");
        for (number = 2; number < 100; number++) {
            boolean isCheck = true;
            {
                //dung vong lap while
//            int i = 2;
//            boolean check = true;
//            while (i <= Math.sqrt(number)) {
//                if (number % i == 0) {
//                    check = false;
//                    break;
//                }
//                i++;
//            }

                //dùng vòng lặp for
                int CheckNumber = (int) Math.sqrt(number);
                for (int i = 2; i <= CheckNumber; i++) {
                    if (number % i == 0) {
                        isCheck = false;
                        break;
                    }
                }
                if (isCheck)
                    System.out.println(+number);
            }
        }
    }
}