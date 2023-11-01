import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Lista{
	public static void main(String[] args){
		// ArrayList nomes = new ArrayList(); #1
		// ArrayList<String> nomes = new ArrayList<String>(); //generics
		List<String> nomes = new ArrayList<>();
		nomes.add("Ana");
		nomes.add("Luiz");
		nomes.add("Roberto");
		
		System.out.println(nomes);
		/* #1
		
		String nome = (String) nomes.get(0);
		System.out.println(nome); */
			
		
		//foreach
		for(String nome : nomes){
			System.out.println(nome);
		}
		
		nomes.add(0, "carlos");
		
		System.out.println(nomes.size() -1); // 0 -> n-1
		
		nomes.remove("Ana");
		System.out.println(nomes);
		
		boolean existeOLuiz = nomes.contains("Luiz");
		System.out.println(existeOLuiz);
		
		nomes.add("Ana");
		nomes.add("Beatriz");
		
		//ordena a lista
		Collections.sort(nomes);
		System.out.println(nomes);
	}
}