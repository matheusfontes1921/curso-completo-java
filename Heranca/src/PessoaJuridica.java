public final class PessoaJuridica extends Pessoa{
    private int numeroFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
        super(nome,rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public final double calcularImporto() {
        if (numeroFuncionarios > 10) {
            return getRendaAnual() * 0.14;
        } else {
            return getRendaAnual() * 0.14;
        }
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
}
