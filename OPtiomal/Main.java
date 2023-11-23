import java.util.Optional;

public class Main{
	public static void main(String[] args){
		ContatoDAO contatoDAO = new ContatoDAO();
		Optional<Contato> resposta = contatoDAO.buscarPorNome("Roberto");
		
		/* if(resposta.isPresent()){
			System.out.println(resposta.get().getNome());
		} */
		//resposta.ifPresent(it -> System.out.println(it.getNome()));
		//resposta.get();	//Stream
		
		//resposta.orElse(new Contato("Juliana");
		//Contato contato = resposta.orElse(criaContatoPadrao());
		//Contato contato = resposta.orElseGet(Main::criaContatoPadrao);
		Contato contato = resposta.orElseThrow(IllegalArgumentException::new);
		
		System.out.println(contato.getNome());
	}
	
	private static Contato criaContatoPadrao(){
		System.out.println("Criando um contato padrao");
		
		return new Contato("Juliana");
	}
}