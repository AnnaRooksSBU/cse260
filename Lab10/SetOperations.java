import java.util.*;

public class SetOperations {
    public static void main(String args[]) {
        LinkedHashSet<String> hs1 = new LinkedHashSet<>(Arrays.asList(new String[]
                    {"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
        LinkedHashSet<String> hs2 = new LinkedHashSet<>(Arrays.asList(new String[]
                    {"George", "Katie", "Kevin", "Michelle", "Ryan"}));

        System.out.println("Union: " + union(hs1,hs2));
        System.out.println("Difference: " + difference(hs1,hs2));
        System.out.println("Intersection: " + intersection(hs1,hs2));
    }

    public static <E> LinkedHashSet<E> union(LinkedHashSet<E> set1, LinkedHashSet<E> set2) {
        LinkedHashSet<E> unionSet = new LinkedHashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }
    public static <E> LinkedHashSet<E> difference(LinkedHashSet<E> set1, LinkedHashSet<E> set2) {
        LinkedHashSet<E> differenceSet = new LinkedHashSet<>(set1);
        differenceSet.removeAll(set2);
        return differenceSet;
    }
    public static <E> LinkedHashSet<E> intersection(LinkedHashSet<E> set1, LinkedHashSet<E> set2) {
        LinkedHashSet<E> intersectionSet = new LinkedHashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }
}
