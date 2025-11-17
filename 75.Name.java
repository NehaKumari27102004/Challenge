package Challenge;

//------------------------------- Parameterized Constructors ------------------------------

class Name {

    String name;
    int age;


    Name(String name, int age){
        this.name=name;
        this.age=age;

    }

    void Display(){
        System.out.println("Name of the student is: " + name + " And age is: " + age);
    }
    public static void main(String [] args){
        Name name=new Name("Neha",22);
        name.Display();
    }
}
