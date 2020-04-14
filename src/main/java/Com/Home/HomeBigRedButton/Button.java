package Com.Home.HomeBigRedButton;

public class Button extends Controller implements Clickable {
    @Override
    public void click() {
        System.out.println("OK");
    }
}
