import java.util.Scanner;

public class GettingPentagonalNumber {
    public static void main(String[] args) {
        System.out.println("Số Pentagonal là: " + getPentagonalNumber(getIndexOfPentagonalNumber()));
    }

    private static int getIndexOfPentagonalNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào vị trí của số trong dãy số Pentagonal:");
        return scanner.nextInt();
    }

    private static int getPentagonalNumber(int index) {
        return index * (3 * index - 1) / 2;
    }
}
