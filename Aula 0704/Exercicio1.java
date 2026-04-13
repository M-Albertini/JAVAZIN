class Aluno {
   private String nome;
   private int idade;

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }

    public void setIdade(int idade){

        if(idade >=0 ){
            this.idade=idade;
            System.out.println("Idade" + idade);//Já mostra a idade aqui
        }else{
            System.out.println("Idade Invalida");
        }
    }   
 
}

   public class Exercicio1{


        public static void main(String[] args) {
            Aluno Objetoaluno = new Aluno();
            Objetoaluno.setIdade(-1);//Atribui o valor para a variavel encapsulada idade
            Objetoaluno.setNome("Magalu");
            System.out.println( Objetoaluno.getNome() );
        }
    }