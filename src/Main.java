public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(1000));
    }

    public static int sumDigits(int number) {
        int sumNumber = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 0){
            sumNumber = sumNumber + number % 10;
            number = number / 10;
        }
        return sumNumber;
    }
}