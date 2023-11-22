import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Main{
	public static void main(String[] args){
		List<Todo> todos = new ArrayList<>();
		todos.add(new Todo(1, "Gravar aula pro canal"));
		todos.add(new Todo(10, "Arrumar a bicicleta"));
		todos.add(new Todo(5, "Estudar ingles"));
		
		//Ordenando a lista antes do java8
		/* Comparator<Todo> comparaPelaDescricao = new Comparator<Todo>(){
			
			@Override
			public int compare(Todo o1, Todo o2){
				return o1.getDescricao().compareTo(o2.getDescricao());
			}
		}; */
		
		/* Comparator<Todo> comparaPelaDescricao = (o1, o2) -> o1.getDescricao().compareTo(o2.getDescricao());
		Collections.sort(todos, comparaPelaDescricao); */
		
		//a partir do java8
		/* Function<Todo, Integer> extraiPrioridade = t -> t.getPrioridade();
		Comparator<Todo> comparaPelaPrioridade = Comparator.comparing(extraiPrioridade); */
		
/* 		ToIntFunction<Todo> extraiPrioridade = t -> t.getPrioridade();
		Comparator<Todo> comparaPelaPrioridade = Comparator.comparingInt(extraiPrioridade);
		todos.sort(comparaPelaPrioridade); */

		//System.out.println(todos);
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Luiza");
		nomes.add("Ana");
		nomes.add("Roberto");
		
		//nomes.sort((n1, n2) -> n1.compareTo(n2));
		nomes.sort(Comparator.naturalOrder());
		
		System.out.println(nomes);
		
	}
}