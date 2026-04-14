package game.factory;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class RegistroTemas {
    private static final Map<String, Supplier<TemaFactory>> REGISTRO = new LinkedHashMap<>();

    static {
        registrar("medieval", TemaMedievalFactory::new);
        registrar("futurista", TemaFuturistaFactory::new);
        registrar("fantasia", TemaFantasiaFactory::new);
    }

    private RegistroTemas() {
    }

    public static void registrar(String nome, Supplier<TemaFactory> fornecedor) {
        REGISTRO.put(nome.toLowerCase(), fornecedor);
    }

    public static TemaFactory criar(String nomeTema) {
        Supplier<TemaFactory> fornecedor = REGISTRO.get(nomeTema.toLowerCase());
        if (fornecedor == null) {
            throw new IllegalArgumentException("Tema inválido. Escolha entre: " + temasDisponiveis());
        }
        return fornecedor.get();
    }

    public static Set<String> temasDisponiveis() {
        return REGISTRO.keySet();
    }
}
