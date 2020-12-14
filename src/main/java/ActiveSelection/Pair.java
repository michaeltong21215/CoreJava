package ActiveSelection;

public class Pair implements Comparable<Pair>{
    public Integer startTime;
    public Integer endTime;

    public Pair(Integer startTime, Integer endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public int compareTo(Pair p){
        return this.endTime - p.endTime;
    }

    public Integer getStartTime() {
        return startTime;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }
}
