import java.util.List;

public class Main {

    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);

        FizzBuzz fizzBuzz = new FizzBuzz(3, 5);

        List<String> play = fizzBuzz.play(num);

        play.forEach(System.out::println);

    }


}
