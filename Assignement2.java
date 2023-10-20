public class Assignement2 {

	public static void main(String[] args) {
		
		String name = "Borjan Georgievski";
		double salary = 100000;
		
		double stateTax = 0.284 * salary;
		
		double personalTax;
		
		if((salary - stateTax - 7000) > 0 ) {
			personalTax = 0.10 * (salary - stateTax - 7000);
		}
		else {
			personalTax = 0;
		}
		double netSalary = salary - stateTax - personalTax;
		
		System.out.println("The employee with the name " + name + " has a gross salary of " + Math.round(salary) + " MKD "+ "and a net salary of " + Math.round(netSalary) + " MKD");
		System.out.println("State taxes paid is " + Math.round(stateTax) + " MKD ");
		System.out.println("Personal taxes paid is  " + Math.round(personalTax) + " MKD ");
		
	}

}
