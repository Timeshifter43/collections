package MapHash;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapHash {
    public static void main(String[] args) {
        Map<String, Person> people = new TreeMap<String,Person>();
        people.put("123124",new Person("Tom"));
        people.put("12351", new Person("Bill"));
        people.put("12128261", new Person("Nick"));

        for (Map.Entry<String, Person> item : people.entrySet()){
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}
