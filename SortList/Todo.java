public class Todo{
	private int prioridade;
	private String descricao;
	
	public Todo(int prioridade, String descricao){
		this.prioridade = prioridade;
		this.descricao = descricao;
	}
	
	public int getPrioridade(){
		return prioridade;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	@Override
	public String toString(){
		return descricao;
	}
}