public class Person {
    private String IDnum;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    public Person(String IDnum, String firstName, String lastName, String title, int YOB) {
        this.IDnum = IDnum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getIDnum() {
        return IDnum;
    }


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
                IDnum, firstName, lastName, title, YOB);
    }

    @Override
    public String toString() {
      return String.format("Person[ID = %s, First Name = %s, Last Name = %s, Title = %s, YOB = %d]",
              IDnum, firstName, lastName, title, YOB);
    };
}