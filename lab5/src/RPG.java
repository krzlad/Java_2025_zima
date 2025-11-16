package games;

public class RPG extends Game {
    public String worldName;

    public RPG(String title, String worldName) {
        super(title);
        this.worldName = worldName;
        System.out.println("World Name = " + worldName);
    }

    public void showRPG() {
        System.out.println("RPG: " + title + ", świat: " + worldName);
    }
}
