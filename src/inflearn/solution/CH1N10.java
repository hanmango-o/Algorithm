package inflearn.solution;

import java.util.Scanner;

public class CH1N10 {

    public String solution(String s, String c) {
        String result = "";
        char target = c.charAt(0);
        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length; i++) {
            int before = 101;
            int after = 101;
            int temp = 0;

            for(int j = i; j >= 0; j--) {
                if(chars[j] == target) {
                    before = temp;
                    break;
                }
                temp++;
            }
            temp = 0;
            for(int k = i; k < chars.length; k++) {
                if(chars[k] == target) {
                    after = temp;
                    break;
                }
                temp++;
            }
            if(before <= after) {
                result += before;
            } else {
                result += after;
            }
            result += " ";
        }

        return result;
    }

    public static void main(String[] args) {
        CH1N10 T = new CH1N10();
        Scanner in = new Scanner(System.in);

        String s = in.next();
        String c = in.next();

        System.out.println(T.solution(s, c));
    }
}
