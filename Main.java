public class Main {
    public static void main(String[] args) {
        Park park = new Park(1, "Sunny Park", "Одеса", 2005);
        Attraction attraction = new Attraction(1, "Американські гірки", "Екстремальний", 20, true);
        Employee employee = new Employee(1, "Наталья", "Ковальчук", "Оператор", 5);
        Visitor visitor = new Visitor(1, "Анна", 17);
        Ticket ticket = new Ticket(1, visitor, attraction, 150.0, "2025-10-06");

        System.out.println(park);
        System.out.println(attraction);
        System.out.println(employee);
        System.out.println(visitor);
        System.out.println(ticket);

        park.openPark();
        employee.work();
        attraction.start();
        visitor.visitAttraction(attraction);
        ticket.useTicket();
    }
}
