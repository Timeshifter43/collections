import java.util.SortedSet;
import java.util.TreeSet;

public class SetTree {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("Germany");
        countries.add("France");
        countries.add("Italy");
        countries.add("Spain");
        countries.add("Great Britain");

        for (String country : countries){
            System.out.println(country);
        }


//        SortedSet<String> set1 = countries.subSet("Germany", "Belgium");
        SortedSet<String> set2 = countries.subSet("France", "Spain");
//        System.out.println(set1);
        System.out.println(set2);
    }

}
