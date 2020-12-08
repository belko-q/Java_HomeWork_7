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
        personSet.add((new Person("FirstNameSet1", "LastNameSet1", Gender.MALE)));
        personSet.add((new Person("FirstNameSet1", "LastNameSet1", Gender.MALE)));
        personSet.add((new Person("FirstNameSet3", "LastNameSet3", Gender.FEMALE)));
        personSet.add((new Person("FirstNameSet3", "LastNameSet3", Gender.FEMALE)));
        personSet.add((new Person("FirstNameSet5", "LastNameSet5", Gender.FEMALE)));

        for (Person person : personSet)
            System.out.println(person);

        System.out.println(personSet.size());


        HashMap<Integer, Person> personMap = new HashMap<>();


        personMap.put(1, (new Person("FirstNameSet6", "LastNameSet6", Gender.FEMALE)));
        personMap.put(2, (new Person("FirstNameSet7", "LastNameSet7", Gender.FEMALE)));
        personMap.put(3, (new Person("FirstNameSet8", "LastNameSet8", Gender.MALE)));
        personMap.put(4, (new Person("FirstNameSet9", "LastNameSet9", Gender.FEMALE)));
        personMap.put(5, (new Person("FirstNameSet10", "LastNameSet10", Gender.MALE)));
        System.out.println(personMap);

        System.out.println(personMap.size());




    }

    private static HashMap<Integer, Person> getPersonMap(HashMap<Integer, Person> personMap) {
        return personMap;
    }
}
