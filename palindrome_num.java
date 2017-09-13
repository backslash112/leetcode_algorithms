import java.util.Arrays;


public class palindrome_num {
    
    public static void main(String[] args) {
        System.out.println(palindrome_num(123321));
        System.out.println(palindrome_num(1233211));
    }

    public static boolean palindrome_num(int x) {
    	int reversedNum = reverseInteger(x);
    	return reversedNum == x;
    }

    public static int reverseInteger(int i) {
        long inputLong = i;
        long reversedNum = 0;
        while(inputLong != 0) {
            reversedNum = reversedNum * 10 + inputLong % 10;
            inputLong = inputLong / 10;
        }
        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            reversedNum = 0;
        }
        return (int)reversedNum;
     }

     public static boolean palindrome_num(int x) {
    	int reversedNum = reverseInteger(x);
    	return reversedNum == x;
    }


    public static int palindrome_num2(int x) {
    	if (x < 0) {
    		return false;
    	}
        long inputLong = x;
        long reversedNum = 0;
        while(inputLong != 0) {
            reversedNum = reversedNum * 10 + inputLong % 10;
            inputLong = inputLong / 10;
        }
        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            reversedNum = 0;
        }
        return (int)reversedNum == x;
     }

     
}