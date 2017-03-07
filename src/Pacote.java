import java.util.ArrayList;

public class Pacote {
	
	private String nomePacote;
	private ArrayList<Canal> listCanais = new ArrayList<Canal>();
	
	public Pacote(){
		
	}
	
	public void adicionaCanal(Canal obj) throws ChannelAlreadyAddedException{
		
		if (listCanais.contains(obj)) {
	        throw new ChannelAlreadyAddedException("Este canal já existe!");
	    } else {
	    	listCanais.add(obj);
	    }
				
	}
	
	public void setNomePacote(String nomePacote){
		this.nomePacote = nomePacote;
		
	}
	public void listaDadosPacote(){
		
		System.out.println(nomePacote);
		
		for(Canal canal : listCanais ){
			
			System.out.println("Nome canal: " + canal.getNomeCanal() + ", N�mero: "+canal.getNumeroCanal());
			
		}
		
	}
	
	
	
}
