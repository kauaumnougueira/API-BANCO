package entities;

public interface InterfaceConta {
    
    void depositar(Double Valor);
    
    void sacar(Double valor);

    void transferir(Double valor, Conta contaDestino);

    void imprimirExtrato(Client cliente);

}
