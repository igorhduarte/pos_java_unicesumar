package entidades;

import java.util.ArrayList;
import java.util.List;

public class Servico {

	private Double valor;
	private String valorDescritivo;
	private String descricaoServico;
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		System.out.println(valor);
		this.valor = valor;
	}
	public String getValorDescritivo() {
		return valorDescritivo;
	}
	public void setValorDescritivo(String valorDescritivo) {
		this.valorDescritivo = valorDescritivo;
	}
	public String getDescricaoServico() {
		return descricaoServico;
	}
	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}
	
	public static String validaValorDescritivo(Double valor) {
		
		
		List<Double> valores = new ArrayList<Double>();
		
		
		valores.add(0.0);
		valores.add(10.0);
		valores.add(20.0);
		
		if(valores.contains(valor)){
			return "";
		}
		

		
		return "";
	}
		
	
	
	
}
