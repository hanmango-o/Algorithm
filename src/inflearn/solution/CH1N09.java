package inflearn.solution;

import java.util.Scanner;

public class CH1N09 {

    public int solution(String s) {
        String result = "";
        char[] chars = s.toCharArray();

        for(char c : chars) {
            if(Character.getType(c) == Character.DECIMAL_DIGIT_NUMBER) {
                result += c;
            }
        }
        return Integer.parseInt(result);
    }


    public static void main(String[] args) {
        CH1N09 T = new CH1N09();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(T.solution(s));
    }
}
