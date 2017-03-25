package entidades;

import java.util.Date;


public class Recibo {
	
	private Integer ReciboID = 1;
	private Integer numero;
	private Date dataConfirmacao;
	private Boolean confirmacaoRecibo;
	private String assinaturaEmitente;
	
	
	private static Emitente emitente;
	private static Pagador pagador;
	private static Servico servico;
	
	public static void main(String[] args) {
	
	}


}
