package by.testgit;

public class Person extends BaseEntity {

    private String firtName;
    private String lastName;

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firtName='" + firtName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
