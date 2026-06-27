// Jeff Victorino
// 06/14/2026
// Module 3.2 Assignment

public class NestedLoops {
    public static void main(String[] args) {

        for (int row = 0; row < 7; row++) {

            String line = "";

            // leading spaces
            for (int space = 0; space < (6 - row) * 2; space++) {
                line += " ";
            }

            // increasing powers of 2
            for (int col = 0; col <= row; col++) {
                line += (int)Math.pow(2, col) + " ";
            }

            // decreasing powers of 2
            for (int col = row - 1; col >= 0; col--) {
                line += (int)Math.pow(2, col) + " ";
            }

            // print line
            System.out.print(line);

            // add spaces so @ is always at column 40
            for (int i = line.length(); i < 40; i++) {
                System.out.print(" ");
            }

            System.out.println("@");
        }
    }
}