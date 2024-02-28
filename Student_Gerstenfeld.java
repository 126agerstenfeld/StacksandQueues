public class Student_Gerstenfeld {

    private String first, last;
    private int id;

    public  Student_Gerstenfeld (String firstName, String lastName, int id) {
        first = firstName;
        last = lastName;
        this.id = id;
    }

    public String getFirst () {
        return first;
    }

    public String getLast () {
        return last;
    }

    public int getId () {
        return id;
    }

    public boolean checkSameStudent (Student_Gerstenfeld studentA, Student_Gerstenfeld studentB) {
        return studentA.getId() == (studentB.getId());
    }
}
