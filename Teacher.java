package inharitance;
public class Teacher {
    // Features
     String name;
    int age;
    String subject;

    // Behaviors
    public void teach() {
        System.out.println("Teaching " + subject);
    }

    public void gradePapers() {
        System.out.println("Grading papers for " + subject);
    }

    public void attendMeeting() {
        System.out.println("Attending a meeting");
    }

    public void takeAttendance() {
        System.out.println("Taking attendance for " + subject);
    }
}

// Subclass MathTeacher
class MathTeacher extends Teacher {
    public MathTeacher(String name, int age) {
        this.name = name;
        this.age = age;
        this.subject = "Math";
    }
}

// Subclass ChemistryTeacher
class ChemistryTeacher extends Teacher {
    public ChemistryTeacher(String name, int age) {
        this.name = name;
        this.age = age;
        this.subject = "Chemistry";
    }
}

// Subclass PianoTeacher
class PianoTeacher extends Teacher {
    public PianoTeacher(String name, int age) {
        this.name = name;
        this.age = age;
        this.subject = "Piano";
    }
}

// Testing all four classes
     class Main {
    public static void main(String[] args) {
        // Creating a Teacher object
        Teacher teacher = new Teacher();
        teacher.teach();
        teacher.gradePapers();
        teacher.attendMeeting();
        teacher.takeAttendance();

        // Creating a MathTeacher object
        MathTeacher mathTeacher = new MathTeacher("John", 35);
        mathTeacher.teach();
        mathTeacher.gradePapers();
        mathTeacher.attendMeeting();
        mathTeacher.takeAttendance();

        // Creating a ChemistryTeacher object
        ChemistryTeacher chemistryTeacher = new ChemistryTeacher("Jane", 42);
        chemistryTeacher.teach();
        chemistryTeacher.gradePapers();
        chemistryTeacher.attendMeeting();
        chemistryTeacher.takeAttendance();

        // Creating a PianoTeacher object
        PianoTeacher pianoTeacher = new PianoTeacher("Bob", 28);
        pianoTeacher.teach();
        pianoTeacher.gradePapers();
        pianoTeacher.attendMeeting();
        pianoTeacher.takeAttendance();
    }
}
