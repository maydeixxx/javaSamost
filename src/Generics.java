import java.util.*;
import java.util.function.Predicate;

public class Generics<T> {
    public <T> List<T> firstGeneric(List<T> firstList, List<T> secondList) {
        List<T> result = new ArrayList<>();
        for (T t : firstList) {
            for (T t2 : secondList) {
                if (t.equals(t2)) {
                    result.add(t);
                }
            }
        }
        return result;
    }

    public List<T> secondGeneric(List<T> firstList, List<T> secondList) {
        List<T> result = new ArrayList<>();
        for (T t1 : firstList) {
            if (!secondList.contains(t1)) {
                result.add(t1);
            }
        }

        for (T t2 : secondList) {
            if (!firstList.contains(t2)) {
                result.add(t2);
            }
        }
        return result;
    }

    public List<T> thirdGeneric(List<T> firstList, List<T> secondList) {
        List<T> result = new ArrayList<>();
        for (T t1 : firstList) {
            result.add(t1);
        }

        for (T t2 : secondList) {
            if (!result.contains(t2)) {
                result.add(t2);
            }
        }
        return result;
    }

    public List<T> fourthGeneric(List<T> listMethod, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : listMethod) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
