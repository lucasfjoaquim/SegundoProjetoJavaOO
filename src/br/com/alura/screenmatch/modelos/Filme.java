package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public void exibeFichaTecnica(){
        System.out.println("===================================================================");
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Media das avaliações: " + getMedia());
        System.out.println("Total de avaliações: " + getTotalDeAvaliacoes());
        System.out.println("Duração do filme em minutos: "+ getDuracaoEmMinutos());
        System.out.println("Dirigido por: " + getDiretor());
        if (isIncluidoNoPlano()){
            System.out.println("Filme incluso no plano premium");
        } else {
            System.out.println("Filme não incluso no plano premium ");
        }
        System.out.println("===================================================================");
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)getMedia() / 2;
    }
}
