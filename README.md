# 🌳 Padrão Estrutural Composite – Relatório Financeiro

O **Composite** é um padrão estrutural que permite representar **estruturas hierárquicas em forma de árvore**, tratando objetos individuais (folhas) e composições de objetos (nós compostos) **de forma uniforme**.  
No projeto de relatório financeiro, ele modela perfeitamente a organização natural de um relatório: **relatório → seções → lançamentos**.

---

## 📘 Visão Geral do Composite

No projeto, o padrão foi aplicado assim:

- **RelatorioFinanceiroComposite** → raiz da árvore (relatório completo)  
- **SecaoFinanceira** → composite intermediário (seções)  
- **LancamentoFinanceiro** → folha (lançamento individual)  
- **ItemRelatorioFinanceiro** → interface comum para todos os tipos

Isso permite que qualquer item da árvore — um relatório inteiro, uma seção ou um único lançamento — seja manipulado da mesma forma.

---

## 🍃 Folha – LancamentoFinanceiro

Representa um item indivisível do relatório:
- descrição (ex.: “Mensalidade Janeiro”, “Luz Janeiro”)
- valor (positivo = receita, negativo = despesa)

---

## 🧪 Benefícios Obtidos
✔ Uniformidade
- Relatório, seções e lançamentos podem ser manipulados pela mesma interface.

✔ Extensibilidade
- Novos níveis ou tipos de itens podem ser acrescentados sem alterar código cliente.

✔ Reuso de lógica
- Comportamento de agregação (getValor()) fica centralizado nos composites.

✔ Representação natural do domínio
- Espelha perfeitamente a estrutura de relatórios financeiros reais.
