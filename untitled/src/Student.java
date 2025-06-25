class Student {
    private int studentId;
    private String name;
    private double marks;

    // Constructor
    public Student(int id, String name, double marks) {
        this.studentId = id;
        this.name = name;
        this.marks = marks;
    }

    // Getters and Setters

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [ID=" + studentId + ", Name=" + name + ", Marks=" + marks + "]";
    }
}
