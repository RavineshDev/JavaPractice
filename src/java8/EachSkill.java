package java8;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Write a java8 program to find list of name based on each skill

class Person {
    private String name;
    private List<String> skills;

    public Person(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }
}

public class EachSkill {
	
	public static void main(String[] args) {
        // Sample list of persons
        List<Person> persons = Arrays.asList(
            new Person("Alice", Arrays.asList("Java", "Python", "JavaScript")),
            new Person("Bob", Arrays.asList("C++", "Java")),
            new Person("Charlie", Arrays.asList("Python", "Ruby")),
            new Person("David", Arrays.asList("Java", "JavaScript")),
            new Person("Eve", Arrays.asList("C#", "Java")),
            new Person("Frank", Arrays.asList("Java", "C++")),
            new Person("Grace", Arrays.asList("JavaScript", "Ruby"))
        );

        // Group names by skills
        Map<String, List<String>> skillToNamesMap = persons.stream()
            .flatMap(person -> person.getSkills().stream()
                .map(skill -> new AbstractMap.SimpleEntry<>(skill, person.getName())))
            .collect(Collectors.groupingBy(
                Map.Entry::getKey,
                Collectors.mapping(Map.Entry::getValue, Collectors.toList())
            ));

        // Output the result
        skillToNamesMap.forEach((skill, names) ->
            System.out.println("Skill: " + skill + " -> " + names));
    }

}
