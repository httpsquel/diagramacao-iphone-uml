package ReprodutorMusical;

public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.adicionarMusica("M1", "A1", "AN1", "C1");
        reprodutorMusical.adicionarMusica("M2", "A2", "AN2", "C2");
        reprodutorMusical.adicionarMusica("M3", "A3", "AN3", "C3");
        reprodutorMusical.adicionarMusica("M4", "A4", "AN4", "C4");

        System.out.println(reprodutorMusical.pesquisarArtista("A1"));
        System.out.println("Musica selecionada : " + reprodutorMusical.selecionarMusica("M2"));
        reprodutorMusical.play("M2");
        reprodutorMusical.pausar("M2");
    }
}
