import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioFinanceiroCompositeTest {

    @Test
    void deveCalcularValorTotalRelatorio() {
        ItemRelatorioFinanceiro receita1 = new LancamentoFinanceiro("Mensalidade janeiro", 1000.0);
        ItemRelatorioFinanceiro receita2 = new LancamentoFinanceiro("Mensalidade fevereiro", 1200.0);

        ItemRelatorioFinanceiro despesa1 = new LancamentoFinanceiro("Luz janeiro", -300.0);
        ItemRelatorioFinanceiro despesa2 = new LancamentoFinanceiro("Água janeiro", -200.0);

        SecaoFinanceira secaoReceitas = new SecaoFinanceira("Receitas");
        secaoReceitas.adicionar(receita1);
        secaoReceitas.adicionar(receita2);

        SecaoFinanceira secaoDespesas = new SecaoFinanceira("Despesas");
        secaoDespesas.adicionar(despesa1);
        secaoDespesas.adicionar(despesa2);

        RelatorioFinanceiroComposite relatorio = new RelatorioFinanceiroComposite("Relatório Financeiro 01/2025");
        relatorio.adicionar(secaoReceitas);
        relatorio.adicionar(secaoDespesas);

        assertEquals(1700.0, relatorio.getValor()); // 1000 + 1200 - 300 - 200
        assertEquals("Relatório Financeiro 01/2025", relatorio.getDescricao());
    }

    @Test
    void deveCalcularValorSecaoIndividualmente() {
        ItemRelatorioFinanceiro receita1 = new LancamentoFinanceiro("Mensalidade março", 1500.0);
        ItemRelatorioFinanceiro receita2 = new LancamentoFinanceiro("Mensalidade abril", 1300.0);

        SecaoFinanceira secaoReceitas = new SecaoFinanceira("Receitas");
        secaoReceitas.adicionar(receita1);
        secaoReceitas.adicionar(receita2);

        assertEquals(2800.0, secaoReceitas.getValor());
        assertEquals("Receitas", secaoReceitas.getDescricao());
    }
}