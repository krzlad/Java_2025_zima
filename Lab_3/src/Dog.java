public class Dog {
    private String name;
    private int age;
    private String breed;


    public Dog(String name, String breed, int age){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void bark(){
        System.out.println("Wow Wow");
    }

    public static void main(String[] args){
        Dog myDog = new Dog("Murzyn",  "Kundel", 4);

        myDog.bark();
    }

}