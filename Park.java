public class Park {
    private int id;
    private String name;
    private String location;
    private int foundedYear;
    private boolean open;

    public Park(int id, String name, String location, int foundedYear) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.foundedYear = foundedYear;
    }

    public void openPark() {
        open = true;
        System.out.println(name + " is now open.");
    }

    public void closePark() {
        open = false;
        System.out.println(name + " is now closed.");
    }

    public void addAttraction(Attraction attraction) {
        System.out.println("Added attraction: " + attraction.toString());
    }

    @Override
    public String toString() {
        return "Park{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", foundedYear=" + foundedYear +
                ", open=" + open +
                '}';
    }
}
