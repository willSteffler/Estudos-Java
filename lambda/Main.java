@FunctionalInterface
interface Taxi{
	double reservar(String origem, String destino);
}

// 1ª forma de implementar uma interface eh criando uma classe
/* class TaxiImpl implements Taxi{
	@Override
	public void reservar(){
		System.out.println("Taxi reservado");
	}
} */

public class Main{
	public static void main(String[] args){
		//Taxi taxi = new TaxiImpl();
		
		//2ª forma de implementar uma interface eh criando uma classe anonima(gera um arquivo $1)
		/* Taxi taxi = new Taxi(){
			@Override
			public void reservar(){
				System.out.println("Taxi reservado");
			}
		}; */
		
		Taxi taxi = (origem, destino) -> {
			System.out.println("Taxi reservado. origem: " + origem + " => destino: " + destino);
			return 80.60;
		};
		
		double valorReserva = taxi.reservar("Campinas", "Sao Paulo");
		System.out.println("valor reserva: " + valorReserva);
	}
}