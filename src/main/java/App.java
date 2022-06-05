import java.util.concurrent.ForkJoinPool;

public class App {
    //fork()-asynchonously exeucted the given tasks in the pool
     //we can call it when using recusivetasks or recusiveAction

    //join()- returns the result of the computation when it is finished
    //invoke()-executes the given tasks+ wait+ return the result upon completions


    public static void main(String[] args) {
       ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
//        SimpleRecursiveAction action = new SimpleRecursiveAction(101);
//        action.invoke();

          SimpleRecurisiveTa action  = new SimpleRecurisiveTa(300);
        System.out.println(action.invoke());
    }

}
