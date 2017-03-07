
public class Canal implements IntCanal{

	private int numeroCanal;
	private String nomeCanal;
	
	
	public Canal(){
		
	}
	

	public void setNomeCanal(String nomeCanal) {
		
		this.nomeCanal = nomeCanal;
		
	}
	
	public void setNumeroCanal(int numeroCanal) {
		
		this.numeroCanal = numeroCanal;
	}
	
	public String getNomeCanal() {
	
		return nomeCanal;
	}
	
	public int getNumeroCanal() {

		return numeroCanal;
	}
	
	
	
}
