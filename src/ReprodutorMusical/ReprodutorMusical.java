package ReprodutorMusical;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {

    private List<Musica> musicas;


    public ReprodutorMusical() {
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(String nome, String artistaNome, String albumNome, String classific){
        musicas.add(new Musica(nome, artistaNome, albumNome, classific));
    }

    public List<Musica> pesquisarArtista(String artistas){
        return musicas.stream()
                .filter(m -> m.getArtistaNome().equals(artistas))
                .toList();
    }

    public Musica selecionarMusica(String nome){
        return musicas.stream()
                .filter(m -> m.getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }


    public void play(String nome){
        Musica musica = musicas.stream()
                .filter(m -> m.getNome().equals(nome))
                .findFirst()
                .orElse(null);
        System.out.println("Tocando Musica: " + musica.getNome());
    }

    public void pausar(String nome){
        Musica musica = musicas.stream()
                .filter(m -> m.getNome().equals(nome))
                .findFirst()
                .orElse(null);
        System.out.println("Musica Pausada: " + musica.getNome());
    }




}
