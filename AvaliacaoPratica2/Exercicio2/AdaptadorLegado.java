package AvaliacaoPratica2.Exercicio2;

import java.util.HashMap;


public class AdaptadorLegado implements ProcessadorTransacoes {

    private SistemaBancarioLegado sistemaLegado;

    public AdaptadorLegado(SistemaBancarioLegado sistemaLegado) {
        this.sistemaLegado = sistemaLegado;
    }

   
    @Override
    public RespostaAutorizacao autorizar(String cartao, double valor, String moeda) {
        
        System.out.println("ADAPTADOR: Recebida requisição moderna...");

        HashMap<String, Object> parametrosLegados = this.converterParaLegado(cartao, valor, moeda);

        HashMap<String, Object> respostaLegada = this.sistemaLegado.processarTransacao(parametrosLegados);

        RespostaAutorizacao respostaModerna = this.converterParaModerno(respostaLegada);
        
        return respostaModerna;
    }

    private HashMap<String, Object> converterParaLegado(String cartao, double valor, String moeda) {
        System.out.println("ADAPTADOR: Traduzindo para o formato legado...");
        HashMap<String, Object> parametros = new HashMap<>();

        parametros.put("cartao_numero", cartao);
        parametros.put("valor", valor);

        switch (moeda.toUpperCase()) {
            case "USD":
                parametros.put("cod_moeda", 1);
                break;
            case "EUR":
                parametros.put("cod_moeda", 2);
                break;
            case "BRL":
                parametros.put("cod_moeda", 3);
                break;
            default:
                throw new IllegalArgumentException("Moeda não suportada: " + moeda);
        }

        parametros.put("id_canal", "WEB_MODERNO");

        return parametros;
    }

 private RespostaAutorizacao converterParaModerno(HashMap<String, Object> respostaLegada) {
    
    Integer statusCode = (Integer) respostaLegada.get("status"); 

    if (statusCode != null && statusCode == 200) {
        String codigoLegado = (String) respostaLegada.get("legacy_auth_id");
        
        return RespostaAutorizacao.comSucesso(codigoLegado);

    } else {
        String infoErro = (String) respostaLegada.get("erro"); 
        
        if (infoErro == null) {
            infoErro = "Erro desconhecido do legado (código " + statusCode + ")";
        }

        return RespostaAutorizacao.comErro(infoErro);
    }
}
    }



