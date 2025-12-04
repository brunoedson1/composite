public class LancamentoFinanceiro implements ItemRelatorioFinanceiro {

    private String descricao;
    private double valor;

    public LancamentoFinanceiro(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getValor() {
        return valor;
    }
}