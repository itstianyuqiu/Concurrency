package ictgradschool.industry.lab_concurrency.examples.example03;

/**
 * Represents a possibly long-running task that needs to be computed.
 */
public interface IComputeTask<T> {

    T computeResult();

}
