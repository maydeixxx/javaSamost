import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;

public class GenericTest {
    @Test
    public <T> void GenericMethodsTest() {
        //given
        List<Integer> t1 = List.of(1, 2, 3, 4, 7, 8, 10);
        List<Integer> t2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Generics<Integer> genericTest = new Generics<>();

        //when
        List<Integer> testList = genericTest.firstGeneric(t1, t2);

        //then
        Assertions.assertEquals("[1, 2, 3, 4, 7, 8]", testList.toString());
    }

    @Test
    public void secondGenericTest() {
        //given
        List<Integer> t1 = List.of(1, 2, 3, 4, 7, 8, 10);
        List<Integer> t2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Generics<Integer> testGeneric = new Generics<>();

        //when
        List<Integer> result = testGeneric.secondGeneric(t1, t2);

        //then
        Assertions.assertEquals("[10, 5, 6, 9]", result.toString());
    }

    @Test
    public void testThirdGeneric() {
        //given
        List<Integer> t1 = List.of(1, 2, 3, 4, 7, 8, 10);
        List<Integer> t2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Generics<Integer> testGeneric = new Generics<>();

        //when
        List<Integer> result = testGeneric.thirdGeneric(t1, t2);

        //then
        Assertions.assertEquals("[1, 2, 3, 4, 7, 8, 10, 5, 6, 9]", result.toString());
    }

    @Test
    public void testFourthGeneric() {
        //given
        List<Integer> t2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Predicate<Integer> isEven = number -> number % 2 != 0;
        Generics testGeneric = new Generics<>();

        //when
        List<Integer> result = testGeneric.fourthGeneric(t2, isEven);

        //then
        Assertions.assertEquals("[1, 3, 5, 7, 9]", result.toString());
    }
}
