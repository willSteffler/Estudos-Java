import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Conjuntos{
	
	public static void main(String[] args){
		
		//Set<String> nomes = new HashSet<>();	//nao permite itens duplicados
		Set<Funcionario> funcionarios = new LinkedHashSet<>();	//garante a ordem de insercao
		//Set<String> nomes = new TreeSet<>();	//garante a ordem do tipo do dado
		
		/* nomes.add("Ana");
		nomes.add("Luiz");
		nomes.add("Roberto");
		nomes.add("Carla");

		nomes.add("Ana");
		System.out.println(nomes.size());
		System.out.println(nomes);

		*/
		
		funcionarios.add(new Funcionario(1, "Ana"));
		funcionarios.add(new Funcionario(2, "Luiz"));
		funcionarios.add(new Funcionario(3, "Roberto"));
		funcionarios.add(new Funcionario(4, "Carla"));
		funcionarios.add(new Funcionario(2, "Patricia"));
		
		
		System.out.println(funcionarios);
		
		
	}
}