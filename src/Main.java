import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Condition> conditions = new ArrayList<>();
        conditions.add(new Condition(3, "Fizz"));
        conditions.add(new Condition(5, "Buzz"));

        for (int currentNumber = 1; currentNumber <= 100; currentNumber++) {
            String fizzBuzzResult = generateFizzBuzzResult(currentNumber, conditions);
            System.out.println(fizzBuzzResult);
        }
    }


    private static String generateFizzBuzzResult(int numberToCheck, List<Condition> conditions) {
        String result = "";

        for (Condition condition : conditions) {
            if (numberToCheck % condition.divisor == 0) {
                result += condition.output;
            }
        }

        if (result.length() == 0) {
            result += numberToCheck;
        }

        return result;
    }
}
