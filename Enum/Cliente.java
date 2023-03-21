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
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


}
