public class company {
    public static void main(String[] args) {
        // create employees
        employee e1 = new employee("nick");
        employee e2 = new employee("vernon");
        employee e3 = new employee("mingyu");

        // total number of employees
        System.out.println("Total employees: " + employee.totalEmployee);
    }
}
