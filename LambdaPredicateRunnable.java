import java.util.function.Predicate;
public class LambdaJava8 {
    public static void main(String[] args) {
        String source = "Revert this message in this example";
        revertStringFunction(source);
         Runnable runnable  =  () -> System.out.println("Hello");
         runnable.run();
//        ActionListener actionListener = (event) -> System.out.println(event.paramString());

        Predicate<Integer> predicate = x -> x > 5 ; 
      
        System.out.println(predicate.test(3));  //false
        System.out.println(predicate.test(7));  //true
    }
