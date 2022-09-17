package inflearn.solution;

import java.util.Scanner;

public class CH1N03 {

    public String solution(String k) {
        String[] s = k.split(" ");
        String temp = s[0];
        for(int i = 1; i < s.length; i++) {
            if(temp.length() < s[i].length())
                temp = s[i];
        }

        return temp;
    }

    public static void main(String[] args) {
        CH1N03 T = new CH1N03();
        Scanner in = new Scanner(System.in);
        String k = in.nextLine();

        System.out.println(T.solution(k));
    }
}
