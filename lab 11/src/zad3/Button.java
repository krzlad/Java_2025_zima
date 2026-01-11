package zad3;

public class Button {
    public void onClick(Action action) {
        action.run();
        action.cancel();
    }
}