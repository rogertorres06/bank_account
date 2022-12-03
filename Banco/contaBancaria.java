package Banco;


public class contaBancaria {

    //atributos

    private String titular;
    private int numeroConta;
    private Double saldo;

    

    // construtor

    public contaBancaria(String titular, int numeroConta, Double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    //metodos
    public void  depositar(Double deposito){
        saldo +=  deposito;
        System.out.printf("Foi depositado R$%.2f na conta de %s \n", deposito, getTitular());
    }

    public void sacar(Double saque){
        saldo -=  saque;

    }
    public void  transferir(String nome, Double transferencia){
        saldo -= transferencia;
        System.out.printf("foi transferido RS%.2f para conta de %s \n", transferencia, nome);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
}
