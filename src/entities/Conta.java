package entities;

public class Conta implements InterfaceConta{
    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

    protected Integer agencia = 0;
    protected Integer numero = 0;
    protected Double saldo = 0.0;
    protected Double valor;
    protected Client cliente;

    public Conta(Client cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
    }

    public Conta(){
    }

    @Override
    public void depositar(Double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(Double valor){
        if(saldo == 0)
            System.out.println("Erro: saldo insuficiente");
        else
            saldo -= valor;
    }

    
    @Override
    public void transferir(Double valor, Conta contaDestino){
        if(saldo == 0)
            System.out.println("Erro: saldo insuficiente");
        else{
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public void imprimirExtrato(Client cliente){        
        System.out.printf("nome: " + cliente.getName() + "\nagencia: " + this.agencia + "\nnumero: " + this.numero + "\nsaldo: "+ this.saldo);
    }

    
}
