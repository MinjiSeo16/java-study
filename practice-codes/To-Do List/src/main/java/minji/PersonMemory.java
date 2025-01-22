package minji;

import java.util.HashMap;
import java.util.Map;

public class PersonMemory {
    private final Map<Person, ListMemory> personMap = new HashMap<>();

    public void save(Person person, ListMemory listMemory){
        personMap.put(person, listMemory);
    }

    public boolean contain(Person person){
        return personMap.containsKey(person);
    }

    public ListMemory getListMemory(Person person){
        return personMap.get(person);
    }
}
