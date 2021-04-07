package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramFive {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner e = new Scanner(System.in);

		// Quantos funcionários serão registrados?
		System.out.print("How many employees will be registered? : ");
		int n = e.nextInt();

		List<Employee> employee = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee " + (i + 1) + "#: ");
			System.out.print("Id: ");
			int id = e.nextInt();
			
			while(isValidade(employee, id)){
				System.out.println("Existing code, try again ...");
				id = e.nextInt();
			}			
			
			e.nextLine();
			System.out.print("Name: ");
			String name = e.nextLine();
			System.out.print("Salary: ");
			double salary = e.nextDouble();

			employee.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		//Digite a identificação do funcionário que terá aumento de salário:
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = e.nextInt();

		//Employee emp = employee.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		Integer emp = findById(employee, idSalary);	
		
		if(emp == null){
			System.out.print("This id does not exist!");
		}else{
			System.out.print("Enter the percentage: ");
			double percent = e.nextDouble();
			employee.get(emp).addIncrease(percent);	
		}

		System.out.println();
		System.out.println("List of employees: ");
		for (Employee listEmp : employee) {
			System.out.println(listEmp.getId() + ", " + listEmp.getName() + ", " + listEmp.getSalary());
		}
		e.close();
	}
	
	public static Integer findById(List<Employee> searchInList, int id){
		for(int i = 0; i < searchInList.size(); i++){
			if(searchInList.get(i).getId() == id){
				return i;
			}
		}
		return null;
	}
	
	public static boolean isValidade(List<Employee> searchValue, int id){
		for(int i = 0; i < searchValue.size(); i++){
			if(searchValue.get(i).getId() == id){
				return true;
			}
		}
		return false;
	}
}
