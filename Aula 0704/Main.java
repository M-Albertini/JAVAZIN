class Pessoa {

    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){//Não esquecer de colocar o tipo e o nome da variavel nos parenteses

        this.nome = nome;
    }

    public void setIdade(int idade){//Toda informação que for pra variavel idade passa por essa validação
        if (idade >= 0) {
            this.idade=idade;    
            System.out.println("Sua idade é:" + idade);
        }else{
            System.out.println("Idade invalida");
        }
        
    }

}

public class Main {
    
    public static void main (String[] args){

        Pessoa Objetopessoa= new Pessoa();
        Objetopessoa.setNome("Maria");
        System.out.println(Objetopessoa.getNome());
        Objetopessoa.setIdade(-1);//valor informado aqui cai no if dentro do contrutor
    }
    
}