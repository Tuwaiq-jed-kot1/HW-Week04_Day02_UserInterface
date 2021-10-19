package os;

public class QueueNode {

    private int arrivesTime;
    private int jobNumber;
    private int requiresMemo;
    private int holdDevices;
    private int burstTime;
    private int priority;
    private int weight;

    public int getWeight() {
        return weight;
    }
    
    private QueueNode next;

    // CONSTRUCTORS
    public QueueNode() {
        arrivesTime = jobNumber = requiresMemo = holdDevices = burstTime = priority = 0;
        next = null;
    }

    public QueueNode(int arrivesTime, int jobNumber, int requiresMemo,
            int holdDevices, int runTime, int priority) {
        this.arrivesTime = arrivesTime;
        this.jobNumber = jobNumber;
        this.requiresMemo = requiresMemo;
        this.holdDevices = holdDevices;
        this.burstTime = runTime;
        this.priority = priority;
        if (priority == 1) {

            weight = 2;
        } else {
            weight = 1;
        }
        next = null;
    }

    public QueueNode(int arrivesTime, int jobNumber, int requiresMemo,
            int holdDevices, int runTime, int priority, QueueNode next) {
        this.arrivesTime = arrivesTime;
        this.jobNumber = jobNumber;
        this.requiresMemo = requiresMemo;
        this.holdDevices = holdDevices;
        this.burstTime = runTime;
        this.priority = priority;
        this.next = next;
    }

    // ACCESSORS
    public int getarrivesTime() {
        return arrivesTime;
    }

    public int getjobNumber() {
        return jobNumber;
    }

    public int getrequiresMemo() {
        return requiresMemo;
    }

    public int getholdDevices() {
        return holdDevices;
    }

    public int getrunTime() {
        return burstTime;
    }

    public int getpriority() {
        return priority;
    }

    public QueueNode getNext() {
        return next;
    }

    // MUTATORS
    public void setarrivesTime(int arrivesTime) {
        this.arrivesTime = arrivesTime;
    }

    public void setjobNumber(int jobNumber) {
        this.jobNumber = jobNumber;
    }

    public void setrequiresMemo(int requiresMemo) {
        this.requiresMemo = requiresMemo;
    }

    public void setholdDevices(int holdDevices) {
        this.holdDevices = holdDevices;
    }

    public void setrunTime(int runTime) {
        this.burstTime = runTime;
    }

    public void setpriority(int priority) {
        this.priority = priority;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
}
