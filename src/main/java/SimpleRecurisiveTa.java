import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class SimpleRecurisiveTa extends RecursiveTask<Integer> {
    private int simulatedWork;

     public SimpleRecurisiveTa(int simulatedWork) {
        this.simulatedWork = simulatedWork;
    }

    @Override
    protected Integer compute() {
        if (simulatedWork > 100) {
            System.out.println("paralle execution so split the task:" + simulatedWork);
           SimpleRecurisiveTa task1 = new SimpleRecurisiveTa(simulatedWork/2);
            SimpleRecurisiveTa task2 = new SimpleRecurisiveTa(simulatedWork/2);
           task1.fork();
           task2.fork();

           //Wait for these tasks to be finished
            int subSolution = 0;
            subSolution += task1.join();
           subSolution += task2.join();

return subSolution;
        }
        else {
            System.out.println("THe task is samlle. execute sequentiall");
            return simulatedWork;
        }
    }
}
