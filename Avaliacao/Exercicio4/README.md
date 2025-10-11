Escolhi o padrão Decorator por ser a forma mais limpa de adicionar novas funcionalidades, como gráficos ou exportação PDF, a um relatório já existente sem precisar alterar seu código-fonte.

Ele permite "envelopar" o relatório base com novas responsabilidades de forma flexível, evitando a complexidade de se criar uma subclasse para cada combinação possível de recursos e mantendo o código fácil de estender no futuro.


![alt text](image.png)