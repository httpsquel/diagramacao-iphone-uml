package AparelhoTelefonico;

public class Main {
    public static void main(String[] args) {
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.adicionarContato("Aparelho 1",  123456);
        aparelhoTelefonico.adicionarContato("Aparelho 2",  654123);
        aparelhoTelefonico.adicionarContato("Aparelho 3",  215463);

        aparelhoTelefonico.exibirContatos();
        aparelhoTelefonico.ligarContato("Aparelho 2");
        aparelhoTelefonico.iniciarCorrerioVoz();
    }
}
