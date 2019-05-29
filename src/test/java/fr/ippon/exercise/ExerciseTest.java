package fr.ippon.exercise;
import static fr.ippon.exercise.Solution.*;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class ExerciseTest {

    @Test
    public void test_fib() {
        assert fibonacci(0) == 0;
        assert fibonacci(1) == 1;
        assert fibonacci(2) == 1;
        assert fibonacci(3) == 2;
        assert fibonacci(4) == 3;
        assert fibonacci(5) == 5;
        assert fibonacci(11) == 89;
        assert fibonacci(13) == 233;

        long preTime = System.currentTimeMillis();
        fibonacci(50);
        long postTime = System.currentTimeMillis();
        long timeTaken = postTime - preTime;
        System.out.println("time taken = " + timeTaken + " ms");
    }

    @Test
    @TestName(lang = "fr", value = "Termes inférieurs à 1")
    @TestName(lang = "en", value = "Terms below 1")
    public void test_fib_1() {
        assertThat(evenFibonacci(1)).isEqualTo(0);
    }

    @Test
    @TestName(lang = "fr", value = "Termes inférieurs à 100")
    @TestName(lang = "en", value = "Terms below 100")
    public void test_fib_2() {
        assertThat(evenFibonacci(100)).isEqualTo(44);
    }

    @Test
    @TestName(lang = "fr", value = "Termes inférieurs à 10000")
    @TestName(lang = "en", value = "Terms below 10000")
    public void test_fib_4() {
        assertThat(evenFibonacci(10000)).isEqualTo(3382);
    }

    @Test
    @TestName(lang = "fr", value = "Termes inférieurs à 1 million")
    @TestName(lang = "en", value = "Terms below 1 million")
    public void test_fib_6() {
        assertThat(evenFibonacci(1_000_000)).isEqualTo(1089154);
    }

    @Test
    @Hide
    @TestName(lang = "fr", value = "Termes supérieurs")
    @TestName(lang = "en", value = "Bigger terms")
    public void test_fib_ten() {

        long preTime = System.currentTimeMillis();
        long result = evenFibonacci(10_000_000_000L);
        long postTime = System.currentTimeMillis();
        long timeTaken = postTime - preTime;
        System.out.println("time taken = " + timeTaken + " ms");

        assertThat(result).isEqualTo(6293134512L);
    }


}