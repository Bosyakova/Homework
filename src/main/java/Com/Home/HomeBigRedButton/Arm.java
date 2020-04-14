package Com.Home.HomeBigRedButton;

public class Arm extends Controller implements Pullable {
    @Override
    public void pull() {
        System.out.println("PULLED");
    }
}
