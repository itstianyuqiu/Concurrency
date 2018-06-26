package ictgradschool.industry.lab_concurrency.ex03;

/**
 * TODO Create a multi-threaded program to calculate PI using the Monte Carlo method.
 */
public class ExerciseThreeMultiThreaded extends ExerciseThreeSingleThreaded {

    /**
     * Estimates PI using a multi-threaded Monte Carlo method.
     */
    @Override
    protected double estimatePI(long numSamples) {
        // TODO Implement this.
        return 0;
    }

    /** Program entry point. */
    public static void main(String[] args) {
        new ExerciseThreeMultiThreaded().start();
    }
}
