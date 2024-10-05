class member{
private String name;
private int age;
private String phnnum;
private String address;
private double salary;
public member (String name, int age,String phnnum, String address, double salary){
 this.name=name;
 this.age=age;
 this.phnnum=phnnum;
 this.address=address;
 this.salary=salary;
}
 public void printSalary(){
	System.out.println("Salary"+salary);
}}
class employee extends member{
 public employee(String name,int age,String phnnum,String address,double salary)
 {
   super(name,age,phnnum,address,salary);
 }}
class manager extends member{

 public manager (String name,int age,String phnnum,String address,double salary){
 super(name,age,phnnum,address,salary);
}}
public class main{
public static void main(String args[])
{
employee e=new employee("Keerthana",20,"8509808767","asiet",8500000);
manager m=new manager("Sree",19,"876543245","asiet",6500000);
e.printSalary();
m.printSalary();
}}
