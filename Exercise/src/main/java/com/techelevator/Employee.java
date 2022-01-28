package com.techelevator;

public class Employee {

    long employeeId;
    String firstName;
    String lastName;
    String email;
    double salary;
    Deparment deparment;
    String hireDate;

    public static double startingSalary = 60_000;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Deparment getDeparment() {
        return deparment;
    }

    public void setDeparment(Deparment deparment) {
        this.deparment = deparment;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    Employee(int employeeId, String firstName, String lastName, String email, Deparment deparment, String hireDate){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deparment = deparment;
        this.hireDate = hireDate;
    }

    Employee(){

    }

    public String getFullName(){
        return lastName + ", " + firstName;
    }

    public void raiseSalary(double percent){
        salary += salary*(percent/100);
    }
}
