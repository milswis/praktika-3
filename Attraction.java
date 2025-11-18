public class Attraction {
    private int id;
    private String name;
    private String type;
    private int capacity;
    private boolean isWorking;

    public Attraction(int id, String name, String type, int capacity, boolean isWorking) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.isWorking = isWorking;
    }

    public void start() {
        isWorking = true;
        System.out.println(name + " started working.");
    }

    public void stop() {
        isWorking = false;
        System.out.println(name + " stopped working.");
    }

    public void repair() {
        isWorking = true;
        System.out.println(name + " has been repaired.");
    }

    public boolean isWorking() {
        return isWorking;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", isWorking=" + isWorking +
                '}';
    }
}
