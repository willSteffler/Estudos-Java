import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapa{
	
	public static void main(String[] atgs){
		Map<String, Double> cuponsDeDesconto = new HashMap<>();
		
		cuponsDeDesconto.put("CP1", 10.50);
		cuponsDeDesconto.put("CP2", 8.75);
		cuponsDeDesconto.put("CP3", 4.30);
		cuponsDeDesconto.put("CP4", 12.80);
		cuponsDeDesconto.put("CP1", 18.10);
		
		Double valorDoCupom = cuponsDeDesconto.get("CP1");
		System.out.println(valorDoCupom);
		
		boolean verificaSeCupomEXiste = cuponsDeDesconto.containsKey("CPq");
		System.out.println(verificaSeCupomEXiste);		
		
		Set<String> chaves = cuponsDeDesconto.keySet();
		System.out.println(chaves);
		
		for(Map.Entry<String, Double>entrada : cuponsDeDesconto.entrySet()){
			System.out.println(entrada);
		}
		
		for(Map.Entry<String, Double>entrada : cuponsDeDesconto.entrySet()){
			System.out.println(entrada.getKey() + " => " + entrada.getValue());
		}
	}
}