import java.util.ArrayList;



public class ListArray {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Bob");

        System.out.println(people.get(1));
        people.set(1,"Rob");
        System.out.println(people.get(1));
        System.out.println("List has %d elements \n" + people.size());

        for(String person : people){
            System.out.println(person);
        }

        people.remove("Rob");

        Object[] peopleArray = people.toArray();
        for(Object person : peopleArray){
            System.out.println();
            System.out.println(person);
        }
    }

}
