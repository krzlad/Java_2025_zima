import zad1.Shape;
import zad2.Validator;
import zad3.Action;
import zad3.Button;
import zad4.Logger;
import zad5.Task;
import zad5.Timer;
import zad8.Calculator;
import zad9.Person;
import zad10.Processor;
import zad12.MathUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Zadanie 1 ---");
        Shape rectangle = new Shape() {
            double a = 5;
            double b = 10;

            @Override
            public double area() {
                return a * b;
            }
        };
        System.out.println(rectangle.area());


        System.out.println("\n--- Zadanie 2 ---");
        Validator validator = new Validator() {
            @Override
            public boolean isValid(String value) {
                if (value.length() < 6) {
                    return false;
                }
                for (char c : value.toCharArray()) {
                    if (Character.isDigit(c)) {
                        return true;
                    }
                }
                return false;
            }
        };
        System.out.println(validator.isValid("haslo1"));


        System.out.println("\n--- Zadanie 3 ---");
        Button button = new Button();
        button.onClick(new Action() {
            @Override
            public void run() {
                System.out.println("Kliknięcie zatwierdzone");
            }

            @Override
            public void cancel() {
                System.out.println("Kliknięcie wycofane");
            }
        });


        System.out.println("\n--- Zadanie 4 ---");
        Logger logger = new Logger() {
            @Override
            public void logInfo(String msg) {
                System.out.println("INFO: " + msg);
            }

            @Override
            public void logError(String msg) {
                System.out.println("ERROR: " + msg);
            }
        };
        logger.logInfo("Start");


        System.out.println("\n--- Zadanie 5 ---");
        Timer timer = new Timer();
        Task countingTask = new Task() {
            int counter = 0;

            @Override
            public void run() {
                counter++;
                System.out.println("Wywołanie numer: " + counter);
            }
        };
        timer.execute(countingTask);
        timer.execute(countingTask);
        timer.execute(countingTask);


        System.out.println("\n--- Zadanie 6 ---");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });


        System.out.println("\n--- Zadanie 7 ---");
        List<String> words = Arrays.asList("jablko", "banan", "kiwi", "truskawka", "figa");
        words.sort((s1, s2) -> s2.length() - s1.length());
        System.out.println(words);


        System.out.println("\n--- Zadanie 8 ---");
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Dodawanie: " + add.calculate(5, 3));
        System.out.println("Mnożenie: " + multiply.calculate(5, 3));


        System.out.println("\n--- Zadanie 9 ---");
        List<Person> people = Arrays.asList(
                new Person("Jan", 10),
                new Person("Anna", 25),
                new Person("Marek", 18),
                new Person("Zosia", 15)
        );

        Predicate<Person> isAdult = p -> p.getAge() >= 18;

        people.stream()
                .filter(isAdult)
                .forEach(System.out::println);


        System.out.println("\n--- Zadanie 10 ---");
        Processor processor = new Processor();
        processor.process(x -> System.out.println(x * x));


        System.out.println("\n--- Zadanie 11 ---");
        List<String> names = Arrays.asList("Kasia", "Tomek", "Ania");
        names.forEach(System.out::println);


        System.out.println("\n--- Zadanie 12 ---");
        List<Integer> numbersToSquare = Arrays.asList(1, 2, 3, 4);
        numbersToSquare.stream()
                .map(MathUtils::square)
                .forEach(System.out::println);


        System.out.println("\n--- Zadanie 13 ---");
        people.stream()
                .map(Person::getName)
                .forEach(System.out::println);


        System.out.println("\n--- Zadanie 14 ---");
        List<String> newNames = Arrays.asList("Kamil", "Ewa", "Piotr");
        List<Person> newPeople = newNames.stream()
                .map(Person::new)
                .collect(Collectors.toList());
        System.out.println(newPeople);


        System.out.println("\n--- Zadanie 15 ---");
        people.sort(Comparator.comparingInt(Person::getAge));
        people.forEach(System.out::println);


        System.out.println("\n--- Zadanie 16 ---");
        List<Integer> numbersWithNegatives = Arrays.asList(-5, 3, -1, 10, 4, -2);
        numbersWithNegatives.stream()
                .filter(n -> n >= 0)
                .map(n -> n * n)
                .forEach(System.out::println);


        System.out.println("\n--- Zadanie 17 ---");
        List<String> wordsFind = Arrays.asList("dom", "okno", "komputer", "telefon");
        wordsFind.stream()
                .filter(s -> s.length() > 5)
                .findFirst()
                .ifPresent(System.out::println);


        System.out.println("\n--- Zadanie 18 ---");
        double averageAge = people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
        System.out.println(averageAge);


        System.out.println("\n--- Zadanie 19 ---");
        List<Integer> positiveCheck = Arrays.asList(5, 10, 15, 20);
        boolean allPositive = positiveCheck.stream()
                .allMatch(n -> n > 0);
        System.out.println(allPositive);


        System.out.println("\n--- Zadanie 20 ---");
        List<String> stringsWithDuplicates = Arrays.asList("kot", "pies", "kot", "aligator", "pies");
        List<String> distinctSorted = stringsWithDuplicates.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(distinctSorted);
    }
}