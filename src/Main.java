public class Main {
    public static void main(String[] args) {
        // Beräkna summan av 1/1 - 1/2 + 1/3 - 1/4 + ....
        // Fortsätt tills absolutbeloppet på termen är < 0.00001

        String op = "+";
        double sum = 0;
        double x = 1;

        while (Math.abs(1/x) >= 0.00001) {
            if (op.equals("+")) {
                sum += 1/x;
                op = "-";
            } else {
                sum -= 1/x;
                op = "+";
            }
            x++;
        }
        System.out.println("Summan: " + sum);
    }
}