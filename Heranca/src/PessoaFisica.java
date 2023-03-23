public final class PessoaFisica extends Pessoa {
    private Double gastosSaude;
    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude){
        super(nome, rendaAnual);
        this.gastosSaude=gastosSaude;
    }

    @Override
    public final double calcularImporto() {
        if (rendaAnual >20000) {
            return (rendaAnual*0.25)-(gastosSaude*0.50);
        } else {
            return (rendaAnual*0.15)-(gastosSaude*0.50);
        }
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
}
