package Avaliacao.Exercicio1;

/**
 * Interface pra todo transporte seguir o mesmo padrão.
 * Assim o código principal não precisa saber qual é qual.
 */

public interface ITransporte{

    Double calcularTarifa(DadosCalculo  dados);

}