package AvaliacaoPratica2.Exercicio2;
import java.util.HashMap;

public class SistemaBancarioLegado {

   public HashMap<String, Object> processarTransacao(HashMap<String, Object> parametros) {
    
    System.out.println(">>> LEGADO: Recebi " + parametros);
    HashMap<String, Object> respostaLegada = new HashMap<>();
    
    
    Integer codigoMoeda = (Integer) parametros.get("cod_moeda");
    Double valor = (Double) parametros.get("valor");

    if (codigoMoeda != 3) {
        respostaLegada.put("status", 501);
        respostaLegada.put("erro", "Moeda não suportada pelo legado");
        
    } else if (valor != null && valor > 1000.0) {
        respostaLegada.put("status", 500);
        respostaLegada.put("erro", "Valor muito alto");
        
    } else {
        respostaLegada.put("status", 200); 
        respostaLegada.put("legacy_auth_id", "LEGADO-OK-123");
    }
    
    System.out.println("<<< LEGADO: Respondi " + respostaLegada);
    return respostaLegada;
}
}