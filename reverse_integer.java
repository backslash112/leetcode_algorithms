import java.util.Arrays;


public class reverse_integer {
    
    public static void main(String[] args) {
        System.out.println(reverseInteger(1534236469));
        // reverseInteger2(123);
    }

    public static int reverseInteger(int i) {
        long inputLong = i;
        System.out.println(String.format("inputLong: %d", inputLong));
        long reversedNum = 0;
        while(inputLong != 0) {
            System.out.println(String.format("----- \r\n reversedNum: %d = %d x 10 + %d %% 10", reversedNum * 10 + inputLong % 10, reversedNum * 10, inputLong % 10));
            reversedNum = reversedNum * 10 + inputLong % 10;
            inputLong = inputLong / 10;
            System.out.println(String.format("inputLong: %d", inputLong));
        }
        System.out.println(Integer.MAX_VALUE);
        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        return (int)reversedNum;
    }

    public static void reverseInteger2(int input) {
        int inputLong = input;
        int reversedNum = 0;
        while(input != 0) {
            System.out.println(input % 10);
            input = input / 10;
        }
    }
}