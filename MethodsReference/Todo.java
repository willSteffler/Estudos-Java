public class Todo{
	private int prioridade;
	private String descricao;
	private boolean feito;
	
	public Todo(int prioridade, String descricao){
		this.prioridade = prioridade;
		this.descricao = descricao;
		this.feito = false;
	}
	
	public int getPrioridade(){
		return prioridade;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public boolean isFeito(){
		return feito;
	}
	
	public void feito(){
		this.feito = true;
	}
	
	@Override
	public String toString(){
		return descricao;
	}
}