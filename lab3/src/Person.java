public class Person {
    public String name;
    private String password;

    public static void main(String[] args){
        Person person = new Person();
        person.name = "Wiktor";
        person.password = "Haslo123";

        System.out.println("Imię: " + person.name);
    }
}
