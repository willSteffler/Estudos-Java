import java.util.Objects;

public class Funcionario{
	
	private int codigo;
	private String nome;
	
	public Funcionario(int codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public String getNome(){
		return nome;
	}
	
	@Override
	public String toString(){
		return "Funcionario{" + "codigo=" + codigo +
		" nome='" + nome + '\'' + '}';
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Funcionario that = (Funcionario) o;
		return codigo == that.codigo;
	}
	
	@Override
	public int hashCode(){
		return Objects.hash(codigo);
	}
}