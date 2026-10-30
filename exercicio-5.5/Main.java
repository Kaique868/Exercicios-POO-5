import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Imprimivel> listaParaImpressao = new ArrayList<>();
        listaParaImpressao.add(new RelatorioFinanceiro());
        listaParaImpressao.add(new Contrato());

        List<EnviavelPorEmail> listaParaEnvio = new ArrayList<>();
        listaParaEnvio.add(new RelatorioFinanceiro());

        System.out.println("--- Processando Impressões ---");
        for (Imprimivel documento : listaParaImpressao) {
            documento.imprimir();
        }

        System.out.println("\n--- Processando Envios por E-mail ---");
        for (EnviavelPorEmail documento : listaParaEnvio) {
            documento.enviar("contato@empresa.com");
        }
    }
}
