package entities;

public class Conta {
    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

    protected Integer agencia;
    protected Integer numero;
    protected Double saldo;
    protected Client cliente;

    public Conta(Client cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
    }

    
}
