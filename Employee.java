package task12;

    public class Employee {
        private String name;
        private int id;
        private double salary;

        // Constructor
        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        // Method to print the employee's name
        public void printName() {
            System.out.println("Employee Name: " + name);
        }

        // Method to print the employee's salary
        public void printSalary() {
            System.out.println("Employee Salary: $" + salary);
        }

        // Getters and Setters for name, id, and salary
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public static class Question1 {
            public static void main(String[] args) {
                // Create an instance of the Employee class
                Employee employee = new Employee("John Doe", 12345, 75000);

                // Call methods to print the employee's name and salary
                employee.printName();
                employee.printSalary();
            }
        }
}
