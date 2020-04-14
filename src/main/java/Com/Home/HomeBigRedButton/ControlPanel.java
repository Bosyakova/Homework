package Com.Home.HomeBigRedButton;

public class ControlPanel {
    private static Controller[] controllers = {
            new Button(),
            new Button(),
            new Arm(),
            new Button(),
            new Button(),
            new Arm(),
            new BigRedButton(),
            new Button(),
            new Button(),
            new Arm()
    };
    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.startButton(controllers);
        controlPanel.startArm(controllers);
    }


    public void startButton(Controller[] controllers) {
        for (Controller controller : controllers) {
            if (controller instanceof Clickable && !(controller instanceof BigRedButton)) {
                Clickable click = (Clickable) controller;
                click.click();
            }
        }
    }

    public void startArm(Controller[] controllers) {
        for (Controller controller : controllers) {
            if (controller instanceof Pullable) {
                Pullable pull = (Pullable) controller;
                pull.pull();
            }
        }
    }


}

