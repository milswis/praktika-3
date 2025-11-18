public class Visitor {
    private int id;
    private String name;
    private int age;

    public Visitor(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void buyTicket(Ticket ticket) {
        System.out.println(name + " bought ticket: " + ticket.toString());
    }

    public void visitAttraction(Attraction attraction) {
        if (!attraction.isWorking()) {
            System.out.println(name + " cannot visit. Attraction is not working.");
            return;
        }
        System.out.println(name + " visited attraction: " + attraction.toString());
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
