public class Ticket {
    private int id;
    private Visitor visitor;
    private Attraction attraction;
    private double price;
    private String date;
    private boolean used;

    public Ticket(int id, Visitor visitor, Attraction attraction, double price, String date) {
        this.id = id;
        this.visitor = visitor;
        this.attraction = attraction;
        this.price = price;
        this.date = date;
    }

    public void useTicket() {
        if (used) {
            System.out.println("Ticket already used.");
            return;
        }
        if (!attraction.isWorking()) {
            System.out.println("Attraction is not working.");
            return;
        }
        used = true;
        System.out.println("Ticket used for attraction: " + attraction.toString());
    }

    public void refund() {
        if (used) {
            System.out.println("Cannot refund a used ticket.");
            return;
        }
        System.out.println("Ticket refunded. Price: " + price);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", visitor=" + visitor +
                ", attraction=" + attraction +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", used=" + used +
                '}';
    }
}
