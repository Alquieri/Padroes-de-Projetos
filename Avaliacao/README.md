# 🎯 Avaliação - Padrões de Projeto

---

## 🏭 **Exercício 1** - Factory Method

> **Justificativa Técnica**
> 
> O padrão de projeto **Factory Method** foi escolhido para a criação dos objetos de transporte por centralizar e encapsular a lógica de instanciação. Essa abordagem desacopla o código cliente das classes concretas (TransporteTerrestre, TransporteAereo, etc.), fazendo com que ele dependa apenas da interface ITransporte. Isso resulta em um sistema mais flexível e extensível.

### 📊 Diagrama de Classes
![Diagrama do Exercício 1](image.png)

### 🔗 Recursos
**[📂 Ver código no Google Drive](https://drive.google.com/file/d/1gC6DJIzEyHQV9eUTitlolNF0VVilKru4/view?usp=sharing)**

---

## 💳 **Exercício 2** - Factory Pattern

> **Justificativa Técnica**
> 
> O padrão **Factory** foi escolhido para gerenciar a criação dos pagamentos variados sem que o código principal precisasse conhecer os detalhes de cada classe concreta. A solução centraliza, em uma PagamentoFactory, a lógica que identifica qual o tipo de pagamento criar, o que deixa o código mais escalável.

### 📊 Diagrama de Classes
![Diagrama do Exercício 2](image.png)

### 🔗 Recursos
**[📂 Ver código no Google Drive](https://drive.google.com/file/d/1Sn7XRl0QuywCJEefgkZrq-KVX59IQ56-/view?usp=sharing)**

---

## 📢 **Exercício 3** - Observer Pattern

> **Justificativa Técnica**
> 
> O padrão **Observer** foi escolhido para esta solução porque ele permite que um TopicoNoticia notifique múltiplos Leitores de forma automática, sem que o tópico precise conhecer detalhes específicos de quem são seus assinantes.

### 📊 Diagrama de Classes
![Diagrama do Exercício 3](image.png)

### 🔗 Recursos
**[📂 Ver código no Google Drive](https://drive.google.com/file/d/1P_EYJolFqxVmOB3iRMhttgtRDXa0ym-M/view?usp=sharing)**

---

## 📈 **Exercício 4** - Decorator Pattern

> **Justificativa Técnica**
> 
> Escolhi o padrão **Decorator** por ser a forma mais limpa de adicionar novas funcionalidades, como gráficos ou exportação PDF, a um relatório já existente sem precisar alterar seu código-fonte.
> 
> Ele permite "envelopar" o relatório base com novas responsabilidades de forma flexível, evitando a complexidade de se criar uma subclasse para cada combinação possível de recursos e mantendo o código fácil de estender no futuro.

### 📊 Diagrama de Classes
![Diagrama do Exercício 4](image-1.png)

### 🔗 Recursos
**[📂 Ver código no Google Drive](https://drive.google.com/file/d/1GwhswfPE5knjZHiuUtt6qNLwYABmE7FR/view?usp=sharing)**

---