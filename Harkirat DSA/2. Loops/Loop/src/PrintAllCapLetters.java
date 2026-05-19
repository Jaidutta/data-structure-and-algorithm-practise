public class PrintAllCapLetters {
    public static void main(String[] args) {
        printAllCapLetters();
    }
    private static void printAllCapLetters() {
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }
    }
}
