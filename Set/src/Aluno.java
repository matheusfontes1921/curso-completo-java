import java.util.Objects;

public class Aluno {
    private String nome;
    private Integer code;
    public Aluno(String nome, Integer code){
        this.code=code;
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(code, aluno.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, code);
    }

    @Override
    public String toString() {
        return "Nome:  "+ nome + "\nCódigo: " + code;
    }
}
