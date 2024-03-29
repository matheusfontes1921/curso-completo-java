public class Pessoa {
    protected String nome;
    protected Double rendaAnual;

    public Pessoa(String nome, Double rendaAnual) {
        this.nome=nome;
        this.rendaAnual=rendaAnual;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    protected abstract double calcularImporto();
}
