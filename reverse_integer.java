import java.util.Arrays;


public class reverse_integer {
    
    public static void main(String[] args) {
        // System.out.println(reverseInteger(123));
        reverseInteger2(123);
    }

    public static int reverseInteger(int i) {
        int inputLong = i;
        System.out.println(String.format("inputLong: %d", inputLong));
        int reversedNum = 0;
        while(inputLong != 0) {
            System.out.println(String.format("----- \r\n reversedNum: %d = %d x 10 + %d %% 10", reversedNum * 10 + inputLong % 10, reversedNum * 10, inputLong % 10));
            reversedNum = reversedNum * 10 + inputLong % 10;
            inputLong = inputLong / 10;
            System.out.println(String.format("inputLong: %d", inputLong));
        }
        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        return reversedNum;
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