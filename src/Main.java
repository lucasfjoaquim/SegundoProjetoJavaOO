import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;


public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(false);
        meuFilme.setDiretor("Steven Segaul");

        meuFilme.avalia(10);
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.exibeFichaTecnica();

        Serie supernatural = new Serie();
        supernatural.setAtiva(true);
        supernatural.setTemporada(4);
        supernatural.setEpisodeosPorTemporada(20);
        supernatural.setMinutosPorEpisodio(100);
        supernatural.setNome("Supernatural");
        supernatural.setAnoDeLancamento(2020);
        supernatural.setIncluidoNoPlano(true);
        supernatural.avalia(6);
        supernatural.avalia(9);
        supernatural.avalia(0);
        supernatural.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(supernatural);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(supernatural);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);
    }


}