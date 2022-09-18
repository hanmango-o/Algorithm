package inflearn.solution;

import java.util.Scanner;

public class CH1N06 {

    public String solution(String s) {
        String result = "";
        char[] chars = s.toCharArray();

        result += chars[0];

        for(int i = 1; i < chars.length; i++) {
            CharSequence charSequence = Character.toString(chars[i]);

            if(!result.contains(charSequence)) {
                result += chars[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        CH1N06 T = new CH1N06();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(T.solution(s));
    }
}
