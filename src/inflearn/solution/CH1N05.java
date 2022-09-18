package inflearn.solution;

import java.util.Scanner;

public class CH1N05 {

    public String solution(String s) {
        String result = "";
        String temp = "";
        char[] chars = s.toCharArray();

        for(int i = chars.length - 1; i >= 0; i--) {
            if (Character.isAlphabetic(chars[i])) {
                temp += chars[i];
            }
        }
        char[] t = temp.toCharArray();
        int idx = 0;

        for(int i = 0; i < chars.length; i++) {
            char c;
            if (Character.isAlphabetic(chars[i])) {
                c = t[idx];
                idx++;
            } else {
                c = chars[i];
            }
            result += c;
        }

        return result;
    }

    public static void main(String[] args) {
        CH1N05 T = new CH1N05();
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        System.out.println(T.solution(s));
    }
}
