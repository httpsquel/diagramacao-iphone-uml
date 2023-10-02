package ReprodutorMusical;

import java.util.Timer;

public class Musica {

    private String nome;

    private String artistaNome;

    private String albumNome;

    private String classific;

    public Musica(String nome, String artistaNome, String albumNome, String classific) {
        this.nome = nome;
        this.artistaNome = artistaNome;
        this.albumNome = albumNome;
        this.classific = classific;
    }

    public String getNome() {
        return nome;
    }

    public String getArtistaNome() {
        return artistaNome;
    }

    public String getAlbumNome() {
        return albumNome;
    }

    public String getClassific() {
        return classific;
    }

    @Override
    public String toString() {
        return "Musica:" + nome + ". Artista: " + artistaNome + ". Album: " + albumNome + ". Classificação: " + classific + ".";
    }
}
