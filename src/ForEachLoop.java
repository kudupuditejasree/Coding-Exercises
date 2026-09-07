public class ForEachLoop {
    public static void main(String[] args) {
       Employee obj=new Employee();
       obj.empname="Jenny";
       obj.salary=897666.90;
       obj.display();
        Employee[] employees=new Employee[5];
        System.out.println(employees[0]);
       System.out.println(employees[2]);
        employees[0]=new Employee();
        employees[0].empname="Jenny";
        System.out.println(employees[0].empname);
        employees[0].salary=893435.9;
        employees[0].display();
        employees[1]=new Employee();
        employees[1].empname="Teja";
        System.out.println(employees[1].empname);
        employees[1].salary=53435.9;
        employees[1].display();



    }

}
class
Employee{
    String empname;
    double salary;

    void display(){
        System.out.println("Employee name: "+empname+" "+"employee salary: "+salary);
    }
}

