import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Comparator;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiFunction;

interface MinhaInterfaceFuncional{
	void ola();
}

public class Main{
	public static void main(String[] args){
		
/* 		List<Todo> todos = new ArrayList<>();
		todos.add(new Todo(1, "Gravar aula pro canal"));
		todos.add(new Todo(1, "Fazer atividades fisicas"));
		todos.add(new Todo(10, "Arrumar a bicicleta"));
		todos.add(new Todo(5, "Estudar ingles"));
		
		//todos.forEach(t -> t.feito());
		todos.forEach(Todo::feito);	//method reference -> lambda ->interface funcional */
		
/* 		//Consumer<Todo> marcarComoFeito = Todo::feito;
		Consumer<Todo> marcarComoFeitoLambda = t -> t.feito();
		todos.forEach(marcarComoFeitoLambda); */
		
/* 		Comparator<Todo> comparaPelaDescricao = Comparator.comparing(Todo::getPrioridade)
			.thenComparing(Todo::getDescricao);
		todos.sort(comparaPelaDescricao);
		
		todos.forEach(t -> System.out.println(t.isFeito())); */
		
/* 		Todo todo = new Todo(5, "Estudar ingles");
		System.out.println(todo.getDescricao() + " => " + todo.isFeito());
		
		
		//Consumer<Todo> consumidor = Todo::feito;
		//consumidor.accept(todo);
		MinhaInterfaceFuncional minhaInterfaceFuncional = todo::feito;
		minhaInterfaceFuncional.ola();
		
		System.out.println(todo.getDescricao() + " => " + todo.isFeito()); */
		
/* 		Supplier<Contato> fabricaDeContato = Contato::new;	//constructor reference
		Contato contato = fabricaDeContato.get(); */
		
		/* Function<String, Contato> fabricaDeContato = Contato::new;
		Contato contato = fabricaDeContato.apply("Roberto");
		System.out.println(contato.getNome()); */
		
		BiFunction<Integer, String, Todo> fabricaDeTodo =  Todo::new;	//stream and collectors
		Todo todo = fabricaDeTodo.apply(5, "Estudar ingles");
		
		System.out.println(todo.getDescricao());
		System.out.println(todo.getPrioridade());
		System.out.println(todo.isFeito());
	}	
}