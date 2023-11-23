import java.util.Optional;

public class ContatoDAO{
	public Optional<Contato> buscarPorNome(String nome){
		
		return Optional.ofNullable(null); //se pode ser nulo
		//return Optional.ofNullable(new Contato(nome));
		//return Optional.of(new Contato(nome));
	}
}