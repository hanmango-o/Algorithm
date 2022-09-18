package inflearn.solution;

import java.util.Scanner;

public class CH1N07 {

    public boolean solution(String s) {
        boolean result = true;
        char[] chars = s.toLowerCase().toCharArray();

        for(int i = 0; i < chars.length / 2; i++) {
            if(chars[i] != chars[chars.length - 1 - i]) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        CH1N07 T = new CH1N07();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(T.solution(s) ? "YES" : "NO");
    }
}
