package org.example;

import java.util.HashMap;

public class Game {
    private final HashMap<String, Integer> container = new HashMap<String, Integer>();

    public String fizzBuzz(int num) {
        if (num <= 0) {
            return String.valueOf(num);
        }
        if ((num % 3 == 0) && (num % 5 == 0)) {
            return "fizzBuzz";
        } else if (num % 3 == 0) {
            return "fizz";
        } else if (num % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(num);
    }

    public String fizzBuzz(int num1, int num2) {

        container.put("fizz", 0);
        container.put("buzz", 0);
        container.put("fizzBuzz", 0);

        if (num2 < num1) {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        for (int i = num1; i <= num2; i++) {
            String result = fizzBuzz(i);
            try {
                container.put(result, container.get(result) + 1);
            } catch (Exception e) {

            }
        }
//        same as printf,instead of dumping in command line,it returns string
        return String.format("fizz: %d, buzz: %d, fizzBuzz: %d",
                container.get("fizz"),
                container.get("buzz"),
                container.get("fizzBuzz"));
//        return container;
    }
}
//    public static void main(String[] args) {
//        Game game= new Game();
//        System.out.println(game.fizzBuzz(1,10));
//    }
//}
