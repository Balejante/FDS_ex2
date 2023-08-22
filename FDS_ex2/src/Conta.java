public class Conta{
    enum Categoria{NORMAL, ADVANCED, PREMIUM};
    Long numero;
    String nomeCorrentista;
    int saldoLivreInicial;
    int salAplicacaoInicial;
    double taxaRemuneracao;
    double taxaSaldoNegativo;
    Categoria categoriaInicial;

    public Conta(Long numero, String nomeCorrentista, int saldoLivreInicial, int salAplicacaoInicial, double taxaRemuneracao, double taxaSaldoNegativo, Categoria categoriaInicial){
        this.numero = numero;
        this.nomeCorrentista = nomeCorrentista;
        this.saldoLivreInicial = saldoLivreInicial;
        this.salAplicacaoInicial = salAplicacaoInicial;
        this.taxaRemuneracao = taxaRemuneracao;
        this. taxaSaldoNegativo = taxaSaldoNegativo;
        this.categoriaInicial = categoriaInicial;
    }
}