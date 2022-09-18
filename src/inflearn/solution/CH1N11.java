package inflearn.solution;

import java.util.Scanner;

public class CH1N11 {

    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        char[] chars = s.toCharArray();
        result.append(chars[0]);

        int count = 1;

        for(int i = 1 ; i < s.length(); i++) {
            if(chars[i] != chars[i - 1]) {
                if(count != 1) {
                    result.append(count);
                }
                count = 1;

                result.append(chars[i]);
            } else {
                count++;
                if(i == s.length() - 1) {
                    result.append(count);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        CH1N11 T = new CH1N11();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(T.solution(s));
    }
}
