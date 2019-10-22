import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

import java.util.*;

public class SetHash  {
    public static void main(String[] args) {
        HashSet<String> states = new HashSet<>();

        states.add("Germany");
        states.add("France");
        states.add("Italy");

        boolean isAdded = states.add("Germany");
        //все тоже самое выполняет TreeSet
        List<String> allStates = new ArrayList<>(states);
        Collections.sort(allStates);
        for(String allState : allStates){
            System.out.println(allState);
        }


        for(String state : states){
            System.out.println(state);
        }
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Mike"));
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));

        for(Person p : people){
            System.out.println(p.getName());
        }
    }
}
