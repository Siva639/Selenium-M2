import java.util.Vector;
public class EmployeeDriver {
public static void main(String[] args) {
				        Vector<Employee02> employees = new Vector<>();

				 employees.add(new Employee02("swapna", "Female", 75000));
				 employees.add(new Employee02("prasad", "Male", 60000));
				employees.add(new Employee02("rani", "Female", 85000));
				employees.add(new Employee02("kiran", "Male", 50000));
				employees.add(new Employee02("kumari", "Female", 90000));

				
				Employee highestPaidFemale = null;
				for (Employee02 emp : employees) {
				            if (emp.getGender().equalsIgnoreCase("Female")) {
				                if (highestPaidFemale == null || emp.getSalary() > highestPaidFemale.getSalary()) {
				                    highestPaidFemale = emp;
				                }
				            }
				        }

				        if (highestPaidFemale != null) {
				            System.out.println("Female employee with the highest salary is: " + highestPaidFemale.getName() + 
				                               " with a salary of " + highestPaidFemale.getSalary());
				        } else 
				        {
				        	
				            System.out.println("No female employees found");
						        }
						    }
						

	}

}
}
