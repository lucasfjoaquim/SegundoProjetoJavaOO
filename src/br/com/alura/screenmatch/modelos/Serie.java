package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Serie extends Titulo{
    private int temporada;
    private boolean ativa;
    private int episodeosPorTemporada;
    private int minutosPorEpisodio;


    public void exibeFichaTecnica(){
        System.out.println("===================================================================");
        System.out.println("Nome do serie: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Media das avaliações: " + getMedia());
        System.out.println("Total de avaliações: " + getTotalDeAvaliacoes());
        System.out.println("temporada: " + getTemporada());
        System.out.println("Ativa: " + isAtiva());
        System.out.println("Episodeos Por Temporada: " + getEpisodeosPorTemporada());
        System.out.println("Minutos Por Episodeo: " + getMinutosPorEpisodio());
        System.out.println("Minutos Totais: " + getDuracaoEmMinutos());
        if (isIncluidoNoPlano()){
            System.out.println("Serie incluso no plano premium");
        } else {
            System.out.println("Serie não incluso no plano premium ");
        }
        System.out.println("===================================================================");
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getTemporada() {
        return temporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodeosPorTemporada() {
        return episodeosPorTemporada;
    }

    public void setEpisodeosPorTemporada(int episodeosPorTemporada) {
        this.episodeosPorTemporada = episodeosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return getMinutosPorEpisodio() * getEpisodeosPorTemporada() * getTemporada();
    }

}
