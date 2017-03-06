
public class Assinante {
	
	private String nomeAssinante;
	private String cpfAssinante;
	private String enderecoAssinante;
	private Pacote pacoteCanal;
	
	public Assinante(String nome, String cpf, String endereco){
		
		this.nomeAssinante = nome;
		this.cpfAssinante = cpf;
		this.enderecoAssinante = endereco;
				
	}
	
	public void setPacoteCanal(Pacote pacoteCanal){
		this.pacoteCanal = pacoteCanal;
	}
	
	
	
}
