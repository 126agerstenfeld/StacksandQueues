import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.LinkedTransferQueue;

public class Bathroom_Gerstenfeld {

    private LinkedTransferQueue<Student_Gerstenfeld> bathroomLine;
    private ArrayList<Student_Gerstenfeld> inBathroom;
    private ArrayList<Student_Gerstenfeld> recentlyInBathroom;
    private int numPeopleAllowedIn;

    public Bathroom_Gerstenfeld (int numPeopleAllowedIn) {
        bathroomLine = new LinkedTransferQueue<>();
        inBathroom = new ArrayList<>(0);
        recentlyInBathroom = new ArrayList<>(0);
        this.numPeopleAllowedIn = numPeopleAllowedIn;
    }

    public void setNumPeopleAllowedIn (int numPeopleAllowedIn) {
        this.numPeopleAllowedIn = numPeopleAllowedIn;
    }

    public void addStudent (Student_Gerstenfeld student) {
        if ((!(recentlyInBathroom.contains(student))) && inBathroom.size() < numPeopleAllowedIn && bathroomLine.isEmpty()) {
            inBathroom.add(student);
        }
        else if (!(recentlyInBathroom.contains(student)))
            bathroomLine.add(student);
    }
    public void leaveBathroom (Student_Gerstenfeld student) {
        int index = 0;
        for (int x = 0; x < inBathroom.size(); x++) {
            if (student.checkSameStudent(student, inBathroom.get(x)))
                index = x;
        }
        recentlyInBathroom.add(inBathroom.remove(index));
        if (inBathroom.size() < numPeopleAllowedIn)
        inBathroom.add(bathroomLine.remove());
    }

    public void clear() {
        bathroomLine = new LinkedTransferQueue<>();
        inBathroom = new ArrayList<>(0);
        recentlyInBathroom = new ArrayList<>(0);
        numPeopleAllowedIn = 0;
    }

    public String getInBathroom () {
        String[] students = new String[inBathroom.size()];
        for (int x = 0; x < students.length; x++) {
            students[x] = (inBathroom.get(x)).getFirst() + " " + (inBathroom.get(x)).getLast() + " " + (inBathroom.get(x)).getId();
        }
        return Arrays.toString(students);
    }

    public String search (Student_Gerstenfeld student) {
        Object[] array = bathroomLine.toArray();
        for (int x = 0; x < bathroomLine.size(); x++) {
            if (array[x].equals(student))
                return "in line";
        }
        for (int x = 0; x < inBathroom.size(); x++) {
            if (inBathroom.get(x).checkSameStudent(inBathroom.get(x), student))
                return "in bathroom";
        }
        for (int x = 0; x < recentlyInBathroom.size(); x++) {
            if (recentlyInBathroom.get(x).checkSameStudent(recentlyInBathroom.get(x), student))
                return "left bathroom";
        }
        return "never tried to use the bathroom";
    }

    public int lineLength() {
        return bathroomLine.size();
    }

    public String test () {
        return null;
    }

}
