import java.util.Date;
public class Cliente {
    private String nome;
    private String email;
    private Date birthDate;

    public Cliente(){
    }
    public Cliente(String nome, String email, Date birthDate) {
        this.email = email;
        this.nome = nome;
        this.birthDate = birthDate;
    }
}
