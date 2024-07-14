class  student_data{

    String name;
    int roll_no;
    String subject;
    // Constructor
    public student_data(String name,int roll_no,String subject){
        this.name = name;
        this.roll_no = roll_no;
        this.subject = subject;

    }

    //Display method

    public  void show(){

        System.out.println("Name : " +name);
        System.out.println("Roll Number : " +roll_no);
        System.out.println("Subject : " + subject);

    }
}

public class attribute_obj {

    public  static void main(String[] args){
        // creating Object.
        student_data student1 = new student_data("Aditya",60,"JAVA PROGRAMING");
        // initialize show method
        student1.show();
    }
}
