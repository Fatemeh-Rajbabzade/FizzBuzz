public class Main {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            String result = "";

            if (i % 3 == 0)
                result += "Fizz";
            if (i % 5 == 0)
                result += "Buzz";
            if (result.length() == 0)
                result = String.valueOf(i);

            System.out.println(result);
        }

    }
}