package beans;

public class Monitoring {
    private long id;
    private String nameOperation;
    private long statusPacklogs;
    private long planCapacity;
    private long actualCapacity;
    private long performanceDeviation;
    private long preparednessRatePlan;
    private long preparednessRateFact;
    private long performanceAberrant;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getNameOperation() {
        return nameOperation;
    }

    public void setNameOperation(String nameOperation) { this.nameOperation = nameOperation; }


    public long getStatusPacklogs() {
        return statusPacklogs;
    }

    public void setStatusPacklogs(long statusPacklogs) {
        this.statusPacklogs = statusPacklogs;
    }


    public long getPlanCapacity() {
        return planCapacity;
    }

    public void setPlanCapacity(long planCapacity) {
        this.planCapacity = planCapacity;
    }


    public long getActualCapacity() { return actualCapacity; }

    public void setActualCapacity(long actualCapacity) { this.actualCapacity = actualCapacity; }

    public long getPerformanceDeviation() { return performanceDeviation;  }

    public void setPerformanceDeviation(long performanceDeviation) { this.performanceDeviation = performanceDeviation; }


    public long getPreparednessRatePlan() { return preparednessRatePlan; }

    public void setPreparednessRatePlan(long preparednessRatePlan) { this.preparednessRatePlan = preparednessRatePlan; }


    public long getPreparednessRateFact() { return preparednessRateFact; }

    public void setPreparednessRateFact(long preparednessRate) { this.preparednessRateFact = preparednessRateFact; }


    public long getPerformanceAberrant() { return performanceAberrant; }

    public void setPerformanceAberrant(long performanceAberrant) { this.performanceAberrant = performanceAberrant; }


}
