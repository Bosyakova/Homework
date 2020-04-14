package Com.Home.ITWorker;

public class Project {
    private ITWorker[] people;

    public Project(ITWorker... people) {
        this.people = people;
    }

//    public void make(ITWorker[] people) {
//        for (ITWorker itWorker : people) {
//            if (itWorker instanceof CoffeeMaker) {
//                CoffeeMaker coffeeMaker = (CoffeeMaker) itWorker;
//                coffeeMaker.makeCoffee();
//
//            }
//
//        }
//    }

    public void workingDay(ITWorker[] people) {
        for (ITWorker itWorker : people) {
            if (itWorker instanceof Stager) {
                itWorker.makeCoffee();
            }
        }
    }
}

