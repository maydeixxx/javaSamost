import java.util.*;
import java.util.function.Predicate;

public class Generics {
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

    public <T> List<T> secondGeneric(List<T> firstList, List<T> secondList) {
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

    public <T> List<T> thirdGeneric(List<T> firstList, List<T> secondList) {
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

    public <T> List<T> fourthGeneric(List<T> listMethod, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : listMethod) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public <T, S> Map<T, S> fifthGeneric(Set<T> set, List<S> list) {
        Map<T, S> result = new HashMap<>();

        List<T> setList = new ArrayList<>(set);

        int minCollection = Math.min(setList.size(), list.size());

        for (int i = 0; i < minCollection; i++) {
            result.put(setList.get(i), list.get(i));
        }
        return result;
    }
}
