package ComparableAndComporator;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return  p1.getName().compareTo(p2.getName());
    }

}

class PersonAgeCompare implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() < o2.getAge()){
            return -1;
        }else
            return 0;
    }

    public static void main(String[] args) {
        Comparator<Person> pcomp = new PersonComparator().thenComparing(new PersonAgeCompare());
        TreeSet<Person> people = new TreeSet(pcomp);
        people.add(new Person("Tom", 23));
        people.add(new Person("Nick",34));
        people.add(new Person("Tom",10));
        people.add(new Person("Bill",14));

        for(Person p : people){
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}

