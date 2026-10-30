public class Main {
    public static void main(String[] args) {
        Smartphone meuSmartphone = new Smartphone();

        meuSmartphone.tocar();
        meuSmartphone.pausar();

        System.out.println("-------------------");

        meuSmartphone.exibirPagina("https://github.com");
        meuSmartphone.adicionarNovaAba();

        System.out.println("-------------------");

        meuSmartphone.ligar("(11) 99999-9999");
        meuSmartphone.atender();
    }
}
