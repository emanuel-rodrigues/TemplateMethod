package exercicio_template;

public class CapitalStrategyTermLoan extends CapitalStrategy{
	
	@Override
	public double capital(Loan loan){
		return loan.Commitment();
	}
	
	
	
	

}
