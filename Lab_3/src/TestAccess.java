public class TestAccess {
    public static void main(String[] args){
        Person p = new Person("Kasia", "tajne123");

        System.out.println("ImięP: " +p.name);

        System.out.println("Hasło: " +p.getPassword());

        p.setPassword("noweHasło123");
        System.out.println("Nowe hasło: "+ p.getPassword());
    }
}
