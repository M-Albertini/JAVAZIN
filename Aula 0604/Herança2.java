class Usuario{
    String nome,email,senha;

    public Usuario(String nome,String email, String senha){

        if (senha.length() >= 6) {//Valida se a senha tera no minimo 6 caracteres
            this.nome = nome;
            this.email = email;
            this.senha = senha;           
        }else{
            System.out.println("Sendo deve conter no minimo 6 caracteres");
        }
    }

    public class Herança2 {
    
        public static void main(String[] args) {
            Usuario usuario = new Usuario("Maria","maria@gmail.com" ,"123@#$");

        System.out.print("Nome:" + usuario.nome);
        System.out.print("Email:" + usuario.email);
        System.out.print("senha:" + usuario.senha);
        }
    }
}