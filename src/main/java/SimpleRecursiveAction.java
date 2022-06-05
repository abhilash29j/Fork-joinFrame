import java.util.concurrent.RecursiveAction;

public class SimpleRecursiveAction extends RecursiveAction {
   private int simulateWork;
   public SimpleRecursiveAction(int simulateWork) {
       this.simulateWork = simulateWork;
   }
    @Override
    protected void compute() {
//if the task is too large then we split it and execute the tasks in parallel
        if (simulateWork > 100) {
            System.out.println("parallel execution and split the tasks");
           SimpleRecursiveAction action1 = new SimpleRecursiveAction(simulateWork/2);
           SimpleRecursiveAction action2 = new SimpleRecursiveAction(simulateWork/2);
           action1.fork();
           action2.fork();

        }
        else {
            System.out.println("The tasks is rather small the sequential exectuion is fine");
            System.out.println("The size of the task:" + simulateWork);
        }
    }
}
