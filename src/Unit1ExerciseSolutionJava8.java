import java.util.*;


public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
        //
		//List<String> myList =
		//		Arrays.asList("a1", "a2", "b1", "c2", "c1");

		people
				.stream()
				.filter(s -> s.getFirstName().startsWith("C"))
				.map(p -> p.getFirstName().toUpperCase())
				.sorted()
				.forEach(System.out::println);

		HashMap<String,Integer> m = new HashMap<>();

		m.put("levent", 1);
		m.put("faik", 2);
		m.put("oner", 3);

		m.forEach((k,v)->System.out.println("Key: " + k + " Value: " + v));

	}


}

interface Condition {
    boolean test(Person p);
}

