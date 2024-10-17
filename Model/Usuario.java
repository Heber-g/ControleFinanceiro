package Model;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private boolean superUser;

    //Constutor para a criação de um usuário novo(Pode ser definido com capacidades especiais de admin). Função só disponível para um admin.
    public Usuario(String nome, String email, String senha, boolean superUser){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.superUser = superUser;
    }

    //Métodos para que se possa ver e alterar o email de login vinculado á um usuário.
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    //Método para que se possa alterar a senha do usuário. Não terá get, pois seria uma possível vulnerabilidade do sistema
    public void setSenha(String senha){
        this.senha = senha;
    }

    //Métodos para ver e alterar o nome dos usuários, respectivamente
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    //Função de login do usuário. Aqui retornará um boolena informando se o usuário logou. Importante conciliar com o banco de dados, isso aqui deve mudar
    public boolean Login(String email, String senha){
        UsuarioRepository usuarioVerificado = new UsuarioRepository();//Instanciando uma conexao com bd. Aqui implementar uma busca no bd
        if(this.email == email && this.senha == senha){
            return true;
        }
        else{
            return false;
        }
    }


}