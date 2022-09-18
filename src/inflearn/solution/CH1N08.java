package inflearn.solution;

import java.util.Scanner;

public class CH1N08 {

    public boolean solution(String s) {
        boolean result = true;
        char[] chars = makeString2OnlyAlphabetic(s.toLowerCase());

        for(int i = 0; i < chars.length / 2; i++) {
            if(chars[i] != chars[chars.length - 1 - i]) {
                result = false;
                break;
            }
        }

        return result;
    }

    public char[] makeString2OnlyAlphabetic(String s) {
        String str = "";
        char[] chars = s.toCharArray();

        for(char c : chars) {
            if(Character.isAlphabetic(c)) {
                str += c;
            }
        }

        return str.toCharArray();
    }

    public static void main(String[] args) {
        CH1N08 T = new CH1N08();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(T.solution(s) ? "YES" : "NO");
    }
}
