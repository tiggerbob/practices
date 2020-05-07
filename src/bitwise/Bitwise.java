package bitwise;

import java.util.ArrayList;
import java.util.List;

public class Bitwise {

    public static void main(String[] args) {
//        Method 1: string
//        int num = 24358;
//        String binary;
//
//        binary = reverseString(printBit(num));
//        binary = String.format("%32s", binary).replace(' ', '0');
//        System.out.println(binary);

//        Method 2: array
        int num = 10;
        String binary = "";
        List<Character> numList = convertStringToCharList(reverseString(printBit(num)));
        for(Character c : numList){
            binary += c;
        }
        binary = String.format("%32s", binary).replace(' ', '0');
        System.out.println(binary);
    }

    public static String printBit(int num) {
        String str = "";
        while (num != 1) {
            str += num % 2;
            num /= 2;
        }
        str += 1;
        return str;
    }

    public static String reverseString(String str) {
        StringBuilder input = new StringBuilder();
        input.append(str);
        input = input.reverse();
        return input.toString();
    }

    public static List<Character> convertStringToCharList(String str) {

        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }
        return chars;
    }

}
