package classStopWatch;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
    public void star(){
        this.startTime =System.currentTimeMillis();
    }
    public void stop(){
        this.endTime =System.currentTimeMillis();
    }




}
