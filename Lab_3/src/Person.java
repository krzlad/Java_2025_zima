public class Person {
    public String name;
    private String password;

    public Person(String name, String password){
        this.name  = name;
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String newPassword){
        this.password = newPassword;
    }

}
