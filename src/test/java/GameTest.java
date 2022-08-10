import org.example.Game;
import org.junit.jupiter.api.*;

public class GameTest {
    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @DisplayName("fizzbuzz with one parameter")
    @Nested
    class FizzBuzzWithOneParam {

        @DisplayName("Printing fizz")
        @Test
        public void testFizzbuzzReturnFizz() {
            Assertions.assertAll("returning fizz once provided number divisible by 3",
                    () -> Assertions.assertEquals("fizz", game.fizzBuzz(3)),
                    () -> Assertions.assertEquals("fizz", game.fizzBuzz(6))
            );
        }
        @DisplayName("Printing buzz")
        @Test
        public void testFizzbuzzReturnBuzz() {
            Assertions.assertAll("returning buzz once provided number divisible by 5",
                    () -> Assertions.assertEquals("buzz", game.fizzBuzz(5)),
                    () -> Assertions.assertEquals("buzz", game.fizzBuzz(10))
            );
        }
        @DisplayName("Printing fizzbuzz")
        @Test
        public void testFizzbuzzReturnFizzbuzz() {
            Assertions.assertAll("returning fizzBuzz once provided number divisible by 3 and 5",
                    () -> Assertions.assertEquals("fizzBuzz", game.fizzBuzz(15)),
                    () -> Assertions.assertEquals("fizzBuzz", game.fizzBuzz(30))
            );
        }
        @DisplayName("Printing number")
        @Test
        public void testFizzbuzzReturnNumber() {
            Assertions.assertAll("returning number once provided number is not divisible by 3 or 5",
                    () -> Assertions.assertEquals("0", game.fizzBuzz(0)),
                    () -> Assertions.assertEquals("7", game.fizzBuzz(7)),
                    () -> Assertions.assertEquals("-7", game.fizzBuzz(-7))
            );
        }
    }


    @DisplayName("fizzbuzz with two parameters")
    @Nested
    class FizzBuzzWithTwoParams {

        @DisplayName("printing count of fizz,buzz and fizzbuzz through the provided range")
        @Test
        public void testFizzbuzzThroughRange(){
            Assertions.assertAll("returning count of fizz,buzz and fizzbuzz",
//                    ()->Assertions.assertEquals(3, game.fizzBuzz(1,10).get("fizz")))
                      ()->Assertions.assertEquals("fizz: 1, buzz: 1, fizzBuzz: 0", game.fizzBuzz(1,5)),
                      ()->Assertions.assertEquals("fizz: 6, buzz: 4, fizzBuzz: 1", game.fizzBuzz(5,25)),
                      ()->Assertions.assertEquals("fizz: 0, buzz: 0, fizzBuzz: 0", game.fizzBuzz(-15,-5)),
                      ()->Assertions.assertEquals( game.fizzBuzz(1,5), game.fizzBuzz(5,1))
                   );
        }
    }
}