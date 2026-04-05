class contabancaria {
    double saldo = 578;
    int ndaconta = 91939;
    
        void aplicaJuros(){

        }
}

class ContaCorrente extends contabancaria{
    double juroscc = 0.15; // = 15%

    @Override
    void aplicaJuros(){
     
     saldo = saldo +(saldo +juroscc);
     //Wrong   saldo = juroscc*100 ;
    }

}
class ContaPoupanca extends contabancaria{

    double jurosCP = 0.065;//=6.5%

    @Override
    void aplicaJuros(){
        saldo = saldo + (saldo * jurosCP);
        // Errado saldo  = jurosCP * 100;
    }
}

public class Exercicio3 {

    public static void main(String[] args) {
        
        ContaCorrente ObjetoCC = new ContaCorrente();
        ContaPoupanca ObjetoCP  = new ContaPoupanca();

        ObjetoCC.aplicaJuros();//Tem que chamar para aplicar o calculo de juros e alterar o saldo
        System.out.println("Saldo com juros da conta corrente: R$" + ObjetoCC.saldo );//chama o saldo com novo valor
        ObjetoCP.aplicaJuros();//Aplicando juros para alterar o valor do saldo dentro do ObjetoCP 
        System.out.println("Saldo com juros conta poupança: R$" +ObjetoCP.saldo);
    }
}
