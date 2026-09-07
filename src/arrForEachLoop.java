public class arrForEachLoop {
    public static void main(String[] args) {
        Employee[] employees=new Employee[]{new Employee(),new Employee(),new Employee() };
        //Employee[] employees=new Employee[3];
        System.out.println(employees[0]);
        System.out.println(employees[2]);
       // employees[0]=new Employee();
        employees[0].empname="Jenny";
        //System.out.println(employees[0].empname);
        employees[0].salary=893435.9;
        employees[0].display();
      //  employees[1]=new Employee();
        employees[1].empname="Teja";
        System.out.println(employees[1].empname);
        employees[1].salary=53435.9;
        employees[1].display();



    }

}


