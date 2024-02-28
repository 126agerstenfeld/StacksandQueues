public class BathroomChallenge_Gerstenfeld {
    public static void main(String[] args) {

        Bathroom_Gerstenfeld bathroom1 = new Bathroom_Gerstenfeld(3);
        Bathroom_Gerstenfeld bathroom2 = new Bathroom_Gerstenfeld(2);
        Student_Gerstenfeld james = new Student_Gerstenfeld("James", "Washington", 1);
        Student_Gerstenfeld david = new Student_Gerstenfeld("David", "Monte", 2);
        Student_Gerstenfeld charlie = new Student_Gerstenfeld("Charlie", "Jackson", 3);
        Student_Gerstenfeld johnny = new Student_Gerstenfeld("Johnny", "Johnson", 4);
        Student_Gerstenfeld davis = new Student_Gerstenfeld("Davis", "Davidson", 5);
        Student_Gerstenfeld rachel = new Student_Gerstenfeld("Rachel", "Bobson", 6);
        Student_Gerstenfeld chuck = new Student_Gerstenfeld("Chuck", "Gary", 7);
        Student_Gerstenfeld johnS = new Student_Gerstenfeld("John", "Smith", 8);
        Student_Gerstenfeld johnD = new Student_Gerstenfeld("John", "Doe", 9);
        Student_Gerstenfeld jane = new Student_Gerstenfeld("Jane", "Doe", 10);
        Student_Gerstenfeld jannette = new Student_Gerstenfeld("Jannette", "Reed", 11);
        Student_Gerstenfeld michele = new Student_Gerstenfeld("Michele", "Mickey", 12);


        bathroom1.addStudent(james);
        bathroom1.addStudent(david);
        bathroom1.addStudent(johnD);
        bathroom1.addStudent(johnS);
        bathroom1.addStudent(chuck);

        bathroom2.addStudent(jannette);
        bathroom2.addStudent(jane);
        bathroom2.addStudent(rachel);
        bathroom2.addStudent(michele);

        bathroom1.getInBathroom();
        bathroom2.getInBathroom();

        bathroom1.search(james);
        bathroom1.search(chuck);
        bathroom2.search(james);
        bathroom1.search(davis);

        bathroom1.leaveBathroom(james);
        bathroom2.leaveBathroom(jane);

        bathroom1.test();
        bathroom2.test();
        bathroom1.clear();
        bathroom1.test();

        bathroom1.setNumPeopleAllowedIn(15);

    }
}
