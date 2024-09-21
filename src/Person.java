public class Person {

    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) { this.ID = ID;}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String toCSV() {
        return String.format("%s,%s,%s,%s,%d",
                ID, firstName, lastName, title, YOB);
    }

    public String toXML() {
        return String.format("<person><id>%s</id><firstName>%s</firstName><lastName>%s</lastName><title>%s</title><YOB>%d</YOB></person>",
                ID, firstName, lastName, title, YOB);
    }

    public String toJSON() {
        return String.format("{\"id\":\"%s\",\"firstName\":\"%s\",\"lastName\":\"%s\",\"title\":\"%s\",\"YOB\":%d}",
                ID, firstName, lastName, title, YOB);
    }
    @Override
    public String toString() {
      return String.format("Person[ID = %s, First Name = %s, Last Name = %s, Title = %s, YOB = %d]",
              ID, firstName, lastName, title, YOB);
    }
}