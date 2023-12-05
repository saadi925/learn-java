package method_references;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/* What are Method References?
     Method references provide a way to refer to methods without executing them.
     They are often used in functional programming and are a shorthand notation for lambda expressions that  directly call a method.

 */
public class MethodReferences {
    public static void main(String[] args) {
        // Reference to a Static Method:
        // Syntax: ClassName::staticMethodName
        Function<Integer, String> converter = String::valueOf; // Equivalent to: num -> String.valueOf(num)
        // Reference to an Instance Method of a Particular Object:
        // Syntax: objectInstance::instanceMethodName
        // Example:
        String str = "Hello";
        Function<Integer, Character> charAtFunc = str::charAt; // Equivalent to: index -> str.charAt(index)
        // Reference to a Constructor:
        // Syntax: ClassName::new


    }


}
