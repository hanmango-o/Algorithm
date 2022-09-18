package inflearn.solution;

import java.util.Scanner;

public class CH1N12 {
    public String solution(String s, int n) {
        String result = "";
        char[] chars = s.toCharArray();
        int i = 0;
        while (i < n * 7) {
            String temp = "";
            for(int j = i; j < i + 7; j++) {
                if(chars[j] == '*') {
                    temp += '0';
                } else {
                    temp += '1';
                }
            }
            result += (char)Integer.parseInt(temp, 2);
            i += 7;
        }

        return result;
    }

    public static void main(String[] args) {
        CH1N12 T = new CH1N12();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String s = in.next();

        System.out.println(T.solution(s, n));

    }
}
