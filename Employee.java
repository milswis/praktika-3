public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private int experienceYears;

    public Employee(int id, String firstName, String lastName, String position, int experienceYears) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.experienceYears = experienceYears;
    }

    public void work() {
        System.out.println(firstName + " " + lastName + " is working as " + position);
    }

    public void takeBreak() {
        System.out.println(firstName + " " + lastName + " is taking a break.");
    }

    public void maintainAttraction(Attraction attraction) {
        attraction.repair();
        System.out.println(firstName + " maintained attraction " + attraction.toString());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }
}
