package ksu.swe3643;

public class MyCalculator {
	
	CalculatorService service;
	
	public MyCalculator(CalculatorService service) {
		this.service = service;
	}
	
	public int SumSqure(int i,int j) {
		int sum = service.addHelper(i,j);
		
		return sum * sum;
	}

}
