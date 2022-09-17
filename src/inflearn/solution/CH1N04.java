package inflearn.solution;

import java.util.Scanner;

public class CH1N04 {

    public String[] solution(String[] s, int n) {
        String[] result = new String[n];

        for(int i = 0; i < n; i++) {
            StringBuffer stringBuffer = new StringBuffer(s[i]);
            result[i] = stringBuffer.reverse().toString();
        }

        return result;
    }

    public static void main(String[] args) {
        CH1N04 T = new CH1N04();

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String[] s = new String[n];

        for(int i = 0; i < n; i++) {
            s[i] = in.next();
        }

        for (String result: T.solution(s, n)) {
            System.out.println(result);
        }
    }
}
