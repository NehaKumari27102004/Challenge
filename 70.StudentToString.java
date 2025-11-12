package Challenge;

class StudentToString {
    String name;
    int age;
    long rollnumber;
    String house;
    public StudentToString(String name, int age, long rollnumber, String house) {
        this.name = name;
        this.age = age;
        this.rollnumber = rollnumber;
        this.house = house;
    }

    public String toString(){
        return "Student Details : {name:" + name
                + ",age:" + age
                + ", roll number:" + rollnumber
                + ", house:" + house + "}";
    }

    public static void main(String[] args) {
        StudentToString stv = new StudentToString("Neha",22,220304037,"Sasaram");
        System.out.println(stv);
    }

}
