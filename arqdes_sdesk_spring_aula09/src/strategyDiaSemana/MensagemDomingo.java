package strategyDiaSemana;

public class MensagemDomingo implements MensagemDoDia {

	@Override
	public void imprime() {
		System.out.println("Hoje � domingueira. Manda bala naquela macarronada!");
	}

}
