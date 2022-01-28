package com.techelevator;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    List<Department> departments = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();
    Map<String,Project> projects = new HashMap<String, Project>();

    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!
        employees.get(1).raiseSalary(10);
        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        Department department1 = new Department(1,"Marketing");
        Department department2 = new Department(2,"Sales");
        Department department3 = new Department(3,"Engineering");
        departments.add(department1);
        departments.add(department2);
        departments.add(department3);

    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (Department d : departments){
            System.out.println(d.getName());
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        Employee deanJohnson = new Employee();
        deanJohnson.setEmployeeId(1);
        deanJohnson.setDeparment(departments.get(2));
        deanJohnson.setFirstName("Dean");
        deanJohnson.setLastName("Johnson");
        deanJohnson.setEmail("djohnson@teams.com");
        deanJohnson.setSalary(60000);
        deanJohnson.setHireDate("08/21/2020");
        Employee angieSmith = new Employee(2, "Angie", "Smith",
                "asmith@teams.com", 60000, departments.get(2), "08/21/2020");

        Employee margaretThompson = new Employee(3,"Margaret", "Thompson", "mthompson@teams.com",
                60000, departments.get(0), "08/21/2020");
        employees.add(deanJohnson);
        employees.add(angieSmith);
        employees.add(margaretThompson);
    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for (Employee employee : employees) {
            System.out.println(employee.getFullName() + " (" +
                    employee.getSalary() + ") " + employee.getDeparment().getName());
        }

    }

    /**
     * Create the 'Teams' project.
     */
    private void createTeamsProject() {

        Project teams = new Project("TEams","Project Management Software","10/10/2020","11/10/2020");

        List<Employee> employeeToAdd = new ArrayList<>();
        for(Employee e : employees){
            if(e.deparment == departments.get(2)){
                employeeToAdd.add(e);
            }
        }
        teams.setTeamMembers(employeeToAdd);
        projects.put("TEams",teams);

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project marketingLandingPage = new Project("Marketing Landing Page",
                "Lead Capture Landing Page for Marketing","10/10/2020","10/17/2020");
        List<Employee> employeesToAdd = new ArrayList<>();
        for (Employee e : employees){
            if(e.getDeparment() == departments.get(0)){
                employeesToAdd.add(e);
            }
        }
        marketingLandingPage.setTeamMembers(employeesToAdd);
        projects.put("Marketing Landing Page",marketingLandingPage);

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        for (Map.Entry<String,Project> entry : projects.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().getTeamMembers().size());
        }

    }

}
