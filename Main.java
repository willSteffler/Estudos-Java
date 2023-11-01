import java.util.EnumSet;
import java.util.EnumMap;

public class Main{
	
	public static void main(String[] args){
		
		Transacao transacao = new Transacao();
		transacao.setStatus(StatusTransacao.CANCELADA);
		
		System.out.println(transacao.getStatus());
		System.out.println(transacao.getStatus() == StatusTransacao.CANCELADA);
		
		EnumSet<StatusTransacao> statusCancelaveis = EnumSet.of(StatusTransacao.PENDENTE, StatusTransacao.ANALISE);
		System.out.println(statusCancelaveis.contains(StatusTransacao.PROCESSADA));
		
		EnumMap<StatusTransacao, String> corPorStatus = new EnumMap(StatusTransacao.class);
		corPorStatus.put(StatusTransacao.PENDENTE, "Amarela");
		corPorStatus.put(StatusTransacao.PROCESSADA, "Verde");
		corPorStatus.put(StatusTransacao.CANCELADA, "Vermelha");
		
		System.out.println(corPorStatus.get(StatusTransacao.PENDENTE));
	}
}