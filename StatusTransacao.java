public enum StatusTransacao{
	
	PENDENTE("Pendente"){
		@Override
		boolean isPodeSerCancelada(){
			return true;
		}
	},
	ANALISE("Em analise"){
		@Override
		boolean isPodeSerCancelada(){
			return true;
		}
	},
	PROCESSADA("Processada"){
		@Override
		boolean isPodeSerCancelada(){
			return false;
		}
	},
	CANCELADA("Cancelada"){
		@Override
		boolean isPodeSerCancelada(){
			return false;
		}
	},
	REVERTIDA("Revertida"){
		@Override
		boolean isPodeSerCancelada(){
			return true;
		}
	};
	
	private String descricao;
	
	StatusTransacao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	abstract boolean isPodeSerCancelada();
}