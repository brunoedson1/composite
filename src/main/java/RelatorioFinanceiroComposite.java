import java.util.ArrayList;
import java.util.List;

public class RelatorioFinanceiroComposite implements ItemRelatorioFinanceiro {

    private String titulo;
    private List<ItemRelatorioFinanceiro> secoes;

    public RelatorioFinanceiroComposite(String titulo) {
        this.titulo = titulo;
        this.secoes = new ArrayList<>();
    }

    public void adicionar(ItemRelatorioFinanceiro secao) {
        this.secoes.add(secao);
    }

    public void remover(ItemRelatorioFinanceiro secao) {
        this.secoes.remove(secao);
    }

    @Override
    public String getDescricao() {
        return this.titulo;
    }

    @Override
    public double getValor() {
        double total = 0.0;
        for (ItemRelatorioFinanceiro secao : secoes) {
            total += secao.getValor();
        }
        return total;
    }

    public List<ItemRelatorioFinanceiro> getSecoes() {
        return secoes;
    }
}