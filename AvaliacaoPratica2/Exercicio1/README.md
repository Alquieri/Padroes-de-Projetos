Usei o Padrão Strategy (Estratégia) porque a Questão 1 pedia para trocar os algoritmos de risco (como Value at Risk ou Stress Test) a qualquer momento, e é exatamente para isso que o Strategy serve. Eu transformei cada algoritmo em sua própria classe "especialista" (ValueAtRiskStrategy, StressTestingStrategy), mas todas "assinam" o mesmo "contrato" (a interface RiskAnalysisStrategy). A classe RiskProcessor é o "gerente" (o Contexto) que segura o algoritmo atual. Para trocar o cálculo, eu só digo ao "gerente" para usar outro especialista. Isso evita um if/else complicado e deixa fácil adicionar novos algoritmos no futuro sem quebrar o código do "gerente".



  