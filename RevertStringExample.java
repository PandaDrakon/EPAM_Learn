public class RevertStringClass {
    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        String source = "Revert this message in this example";
        StringBuilder reversed = new StringBuilder();
        for (int i = source.length() - 1 ; i > 0 ; i--) {
            reversed.append(source.charAt(i));
        }
    }
}
