package CoreJava;

public class TwoDimArray {

    public static void main(String[] args) {

        String S[][] = new String[3][4];
        //1st row
        S[0][0] = "12";
        S[0][1] = "nisum";
        S[0][2] = "Oracle";
        S[0][3] = "Wipro";

        System.out.println(S[0][0]);
        System.out.println(S.length);
        System.out.println(S[0].length);
        //2nd row
        S[1][0] = "ravi";
        S[1][1] = "kumar";
        S[1][2] = "Test";
        S[1][3] = "Yes";

        for (int row = 0; row < S.length; row++) {
            for (int col = 0; col < S[0].length; col++) {
                System.out.println(S[row][col]);
            }
        }
    }
}
