import java.util.ArrayList;
import java.util.List;

public class SecaoFinanceira implements ItemRelatorioFinanceiro {

    private String titulo;
    private List<ItemRelatorioFinanceiro> itens;

    public SecaoFinanceira(String titulo) {
        this.titulo = titulo;
        this.itens = new ArrayList<>();
    }

    public void adicionar(ItemRelatorioFinanceiro item) {
        this.itens.add(item);
    }

    public void remover(ItemRelatorioFinanceiro item) {
        this.itens.remove(item);
    }

    @Override
    public String getDescricao() {
        return this.titulo;
    }

    @Override
    public double getValor() {
        double total = 0.0;
        for (ItemRelatorioFinanceiro item : itens) {
            total += item.getValor();
        }
        return total;
    }

    public List<ItemRelatorioFinanceiro> getItens() {
        return itens;
    }
}