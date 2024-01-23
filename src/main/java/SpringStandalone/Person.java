package SpringStandalone;

import java.security.Key;
import java.util.List;
import java.util.Map;

public class Person {
    private List<String> friends;
    private Map<String,Integer> feesstructure;

    public Person(List<String> friends, Map<String, Integer> feesstructure) {
        this.friends = friends;
        this.feesstructure = feesstructure;
    }

    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", feesstructure=" + feesstructure +
                '}';
    }
}
