package baitap.buoi4.stopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;


    public long start() {
        startTime = System.currentTimeMillis();
        return startTime;
    }

    public long stop() {
        endTime = System.currentTimeMillis();
        return endTime;
    }

    public long getElapsedTime() {
        return stop() - start();
    }
}
