public class RevertStringClass {
       public static void main(String[] args) {
        String source = "Revert this message in this example";
           
        revertStringFunction(source);
    }

    private static void revertStringFunction(String source) {
        StringBuilder reversed = new StringBuilder();
        for (int i = source.length() - 1 ; i > 0 ; i--) {
            reversed.append(source.charAt(i));
        }
    }
}
