import java.util.Scanner;
class Staff{
    protected int code ;
    protected String name ;

    public Staff(int code , String name){
        this.code = code ;
        this.name = name ;
    }

    public int getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Staff Code : "+ this.code +"\n"+ "Staff Name : "+ this.name ; 
    }
}

class Teacher extends Staff{
    private String subject;

    public Teacher(String subject , int code , String name){
        super( code , name );
        this.subject = subject;
    }

    public String getSubject(){
        return this.subject;
    }

    public String toString(){
        return super.toString() +"\n"+"Teacher's Subject : "+ this.subject ;
    }
}

class Typist extends Staff{
    protected int speed;

    public Typist(int speed , int code, String name){
        super( code , name );
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }

    public String toString(){
        return super.toString() +"\n"+ "Speed of Typist : "+this.speed ;
    }
}

class Officer extends Staff{
    private String grade;

    public Officer(String grade , int code , String name){
        super( code , name );
        this.grade = grade;
    }

    public String getGrade(){
        return this.grade;
    }

    public String toString(){
        return super.toString()+"\n"+"Officer's Grade : "+ this.grade ;
    }
}

class Regular extends Typist{
    private double salary;

    public Regular(double salary , int speed , int code , String name){
        super( speed , code , name);
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public String toString(){
        return super.toString() +"\n"+ "Permanent Employee Salary : "+ this.salary ;
    }
}

class Casual extends Typist{
    private double dailyWages;

    public Casual(double dailyWages , int speed , int code , String name ){
        super(speed , code , name );
        this.dailyWages = dailyWages ;
    }

    public double getDailyWages(){
        return this.dailyWages;
    }

    public String toString(){
        return super.toString() + "\n"+ "Casual Employee Salary : "+ this.dailyWages ;
    }


}

public class Assignmentt1{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String name , subject ,grade ;
       int code , speed ;
       double salary , dailyWages ; 
    
       System.out.println("Details of permanent employee-------------------------");
       
        System.out.println("Enter the name of Employee : ");
       name = sc.nextLine();
       System.out.println("Enter the Employee code : ");
       code = sc.nextInt();
       System.out.println("Enter the typing speed of Employee : ");
       speed = sc.nextInt();
       System.out.println("Enter the salary of Regular Employee : ");
       salary = sc.nextDouble();
       Regular r = new Regular(salary , speed , code , name);
       System.out.println();
       System.out.println(r);

       sc.nextLine();
       sc.nextLine();
       System.out.println("Details of casual employee ---------------");
       System.out.println("Enter the name of Employee : ");
       name = sc.nextLine();
       System.out.println("Enter the daily wage of Employee : ");
       dailyWages = sc.nextDouble();
       System.out.println("Enter the Employee code : ");
       code = sc.nextInt();
       System.out.println("Enter the typing speed of Employee : ");
       speed = sc.nextInt();
       Casual c = new Casual(dailyWages , speed , code , name);
       System.out.println();
       System.out.println(c);
        
        sc.nextLine();
        sc.nextLine();
         System.out.println("Details of Teacher ---------------");
        System.out.println("Enter the Subject of Teacher : ");
       subject = sc.nextLine();
       System.out.println("Enter the name of Employee : ");
       name = sc.nextLine();
       System.out.println("Enter the Employee code : ");
       code = sc.nextInt();
        Teacher t = new Teacher(subject , code , name);
        System.out.println();
         System.out.println(t);
         System.out.println();
       
        sc.nextLine();
        sc.nextLine();
       System.out.println("Details of officer ---------------");
       System.out.println("Enter the grade of Employee : ");
       grade = sc.nextLine();
       System.out.println("Enter the name of Employee : ");
       name = sc.nextLine();
       System.out.println("Enter the Employee code : ");
       code = sc.nextInt();
       Officer o = new Officer(grade , code , name);
       System.out.println();
       System.out.println(o);

       
       


    }
}