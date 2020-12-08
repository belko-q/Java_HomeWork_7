package academy.belhard;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Petrov", "Ivan", Gender.MALE));
        personList.add(new Person("Sidorova", "Maria", Gender.FEMALE));
        personList.add(new Person("Ivanov", "Petr", Gender.MALE));
        personList.add(new Person("Mironova", "Alla", Gender.FEMALE));
        personList.add(new Person("Titov", "Egor", Gender.MALE));


        Set<Person> personSet = new HashSet<>();
        personSet.add((new Person("FirstName1", "LastName1", Gender.MALE)));
        personSet.add((new Person("FirstName1", "LastName1", Gender.MALE)));
        personSet.add((new Person("FirstName3", "LastName3", Gender.FEMALE)));
        personSet.add((new Person("FirstName3", "LastName3", Gender.FEMALE)));
        personSet.add((new Person("FirstName5", "LastName5", Gender.FEMALE)));

        for (Person person : personSet)
            System.out.println(person);

        System.out.println(personSet.size());


        HashMap<Integer, Person> personMap = new HashMap<>();


        personMap.put(1, (new Person("FirstName6", "LastName6", Gender.FEMALE)));
        personMap.put(2, (new Person("FirstName7", "LastName7", Gender.FEMALE)));
        personMap.put(3, (new Person("FirstName8", "LastName8", Gender.MALE)));
        personMap.put(4, (new Person("FirstName9", "LastName9", Gender.FEMALE)));
        personMap.put(5, (new Person("FirstName10", "LastName10", Gender.MALE)));
        System.out.println(personMap);

        System.out.println(personMap.size());


        Set<Integer> keys = personMap.keySet();
        System.out.println("Ключи: " + keys);

        ArrayList<Person> values = new ArrayList<>(personMap.values());
        System.out.println("Значения: " + values);


    }


}
