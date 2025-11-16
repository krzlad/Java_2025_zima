public class Dog {
    private String name;
    private String breed;
    private int age;

     public Dog(String name, String breed, int age){
         this.name = name;
         this.breed = breed;
         this.age = age;
     }

     public void Bark() {
         System.out.println("wan-wan");
     }

     public static void main(String[] args){
         Dog Dog = new Dog("Sakura", "Dashund Longhair", 3);
         Dog.Bark();
     }
}
