package Com.Home.ITWorker;

public class ITWorker implements CoffeeMaker {
    public boolean coffee;

    public ITWorker() {
        this.coffee = false;
    }
    @Override
    public void makeCoffee(){
        System.out.println("I made coffee");
    }
}

