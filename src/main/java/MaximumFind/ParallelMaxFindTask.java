package MaximumFind;

import java.util.concurrent.RecursiveTask;

public class ParallelMaxFindTask extends RecursiveTask<Long> {
    private long[] nums;
    private int lowIndex;
    private int highIndex;

    public ParallelMaxFindTask(long[] nums, int lowIndex, int highIndex) {
        this.nums = nums;
        this.lowIndex = lowIndex;
        this.highIndex = highIndex;
    }

    @Override
    protected Long compute() {
      //if the array is small - then we use sequential appraoah
        if (highIndex - lowIndex < 1000){
            return sequentiaMaxFinding();
        }
        else {
            ///we have to use parallelization
            int middleIndex = (highIndex + lowIndex)/2;
            ParallelMaxFindTask task1 = new ParallelMaxFindTask(nums,lowIndex,middleIndex);
            ParallelMaxFindTask task2 = new ParallelMaxFindTask(nums,middleIndex + 1,highIndex);
            invokeAll(task1,task2);
            return Math.max(task1.join(),task2.join());

        }
    }

    private Long sequentiaMaxFinding() {
           long max = nums[lowIndex];
           for (int i = lowIndex; i < highIndex; i++) {
               if (nums[i] > max) {
                   max = nums[i];
               }
           }
           return max;
    }
}
