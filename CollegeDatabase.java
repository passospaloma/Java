/**
/*
 *Program Name: CollegeDatabase.java
 *Author: Paloma Passos 
 *Date: March 25, 2022
 */
 class CompanyDatabase
 * */
public class CompanyDatabase {
    //main method
    public static void main(String[] args) {

        System.out.println("Test Faculty:");
        Faculty f1 = new Faculty("jack palace", "jpalace@gmail.com", "804 123 5888", "A101", 68000.00, Status.PART_TIME);
        System.out.println(f1);

        Faculty f2 = new Faculty("jack palace", "jpalace@gmail.com", "804 123 5888");
        System.out.println(f2);

        f2.setStatus(Status.FULL_TIME);
        System.out.println(f2.getStatus());
        f2.setOffice("C102");
        f2.setSalary(65000);
        System.out.println(f2);

        System.out.println("------------");
        System.out.println("Test Person:");
        Person p1 = new Person("Mary Poppins", "mpoppins@gmail.com", "604 123 4567");
        System.out.println(p1);
        // add more test cases as required
        Person p2 = new Person("Mike Passos", "mikeinho@mike.com", "604 111 2222");
        System.out.println(p2);
        Person p3 = new Person("Jane Pie", "janejane@jane.com", "604 111 1111");
        System.out.println(p3);

        System.out.println("------------");
        System.out.println("Test Employee:");
        Employee e1 = new Employee("Bill Gates", "bgates@gmail.com", "641 888 7766", "B303", 45000.99);
        System.out.println(e1);
        // add more test cases as required
        Employee e2 = new Employee("Julie Totu", "jtotu@j.com", "604 888 8888", "D001", 80000.00);
        System.out.println(e2);
        Employee e3 = new Employee("Thobias Gin", "tgin@j.com", "604 111 4444", "E201", 50000.00);
        System.out.println(e3);

        System.out.println("------------");
        System.out.println("Test Staff:");
        Employee s1 = new Employee("Clark Gable", "cgable@gmail.com", "1 800 888 8888", "XB02", 85600.0);
        System.out.println(s1);
        // add more test cases as required
        Staff s2 = new Staff("Lilly Beau", "lbeau@lala.com", "1 111 5555");
        System.out.println(s2);
        Staff s3 = new Staff("Diva Henn", "dbaa@ggg.com", "1 000 9999", "T105", 60000.0, "manager");
        System.out.println(s3);
    }
}

//instance fields
enum Status {TEMPORARY, PART_TIME, FULL_TIME};

/**
 * class Person defines a person with name, email and phoneNumber
 */
class Person {

    //instance fields
    private String name;
    private String email;
    private String phoneNumber;

    //constructor

    /**
     * default constructor
     */

    public Person() {
        name = "";
        email = "";
        phoneNumber = "";
    }

    /**
     * Person constructor
     * Constructs a new Person with name, email and phoneNumber
     *
     * @param name
     * @param email
     * @param phoneNumber
     */
    public Person(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * this method is for modifying the info
     *
     * @param name
     * @param email
     * @param phoneNumber
     */
    public void modifyInfo(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * this method is to get the name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * this method is to get the email
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * this method is to get the phone number
     *
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * this method is to write a string
     *
     * @return name, email and phoneNumber
     */
    @Override
    public String toString() {
        return "name: " + name + ", email:" + email + ", phoneNumber:" + phoneNumber;
    }
}

/**
 * class Employee extends Person and adds office and salary to a person
 */
class Employee extends Person {
    //instance fields
    private String office = "A101";
    private double salary = 40000.0;

    /**
     * default constructor
     */
    public Employee() {
        super();
        office = "";
        salary = 0;
    }

    /**
     * default constructor
     */
    public Employee(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
    }

    /**
     * Employee constructor gets from a person, the name, email and phonNumber and adds office and salary to it
     *
     * @param name
     * @param email
     * @param phoneNumber
     * @param office
     * @param salary
     */
    public Employee(String name, String email, String phoneNumber, String office, Double salary) {
        super(name, email, phoneNumber);
        this.office = office;
        this.salary = salary;
    }

    /**
     * this method is to set office
     *
     * @return office
     */
    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * this method is to set salary
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * this method is to get salary
     *
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * this method is to get office
     *
     * @return office
     */
    public String getOffice() {
        return office;
    }

    /**
     * this method is to write a string
     *
     * @return to string super, office and salary
     */
    @Override
    public String toString() {
        return super.toString() + ", office:" + office + ", salary:" + salary;
    }
}

/**
 * class Faculty extends employee and add status to an employee
 */
class Faculty extends Employee {
    private Status status = Status.TEMPORARY;

    /**
     * default constructor
     */
    public Faculty() {
        super();
    }

    /**
     * Faculty constructor gets the name, email and phoneNumber from an employee and adds status to an employee
     *
     * @param name
     * @param email
     * @param phoneNumber
     */
    public Faculty(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
    }

    /**
     * Faculty constructor gets the name, email and phoneNumber, office and salary from an employee and adds status to an employee
     *
     * @param name
     * @param email
     * @param phoneNumber
     * @param office
     * @param salary
     * @param status
     */
    public Faculty(String name, String email, String phoneNumber, String office, Double salary, Status status) {
        super(name, email, phoneNumber, office, salary);
        this.status = status;
    }

    /**
     * this method is to set status
     *
     * @param status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * this method is to get status
     *
     * @return status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * this mehod is to write a string
     *
     * @return to string super and status
     */
    @Override
    public String toString() {
        return super.toString() + ", Status:" + status;
    }
}

/**
 * class Staff extends Employee and adds position to an employee
 */
class Staff extends Employee {
    //instance fields
    private String position = "general";

    /**
     * default constructor
     */
    public Staff() {
        super();
    }

    /**
     * Staff constructor gets the name, email and phoneNumber from an employee and adds position to an employee
     *
     * @param name
     * @param email
     * @param phoneNumber
     */
    public Staff(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
    }

    /**
     * Staff constructor gets the name, email and phoneNumber from an employee and adds position to an employee
     *
     * @param name
     * @param email
     * @param phoneNumber
     * @param office
     * @param salary
     * @param position
     */
    public Staff(String name, String email, String phoneNumber, String office, Double salary, String position) {
        super(name, email, phoneNumber, office, salary);
        this.position = position;
    }

    /**
     * this method is to set position
     *
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * this method is to get position
     *
     * @return position
     */
    public String getPosition() {
        return position;
    }

    /**
     * this method is to write a string
     *
     * @return to string super and position
     */
    @Override
    public String toString() {
        return super.toString() + ", position:" + position;
    }
}
