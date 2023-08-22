public class Conta{
    enum Categoria{NORMAL, ADVANCED, PREMIUM};
    long numero;
    String nomeCorrentista;
    int saldoLivreInicial;
    int salAplicacaoInicial;
    double taxaRemuneracao;
    double taxaSaldoNegativo;
    Categoria categoriaInicial;

    public static class Builder{
        long numero;
        String nomeCorrentista;
        int saldoLivreInicial = 0;
        int salAplicacaoInicial = 0;
        double taxaRemuneracao = 0.0;
        double taxaSaldoNegativo = 0.0;
        Categoria categoriaInicial = Categoria.NORMAL;

        public Builder(long numero, String nomeCorrentista){
            this.numero = numero;
            this.nomeCorrentista = nomeCorrentista;
        }

        public Builder saldoLivreInicial(int saldoLivreInicial){this.saldoLivreInicial = saldoLivreInicial; return this;}
        public Builder saldoAplicacaoInicial(int salAplicacaoInicial){this.salAplicacaoInicial = salAplicacaoInicial; return this;}
        public Builder taxaRemuneracao(double taxaRemuneracao){this.taxaRemuneracao = taxaRemuneracao; return this;}
        public Builder taxaSaldoNegativo(double taxaSaldoNegativo){this.taxaSaldoNegativo = taxaSaldoNegativo; return this;}
        public Builder categoriaInicial(Conta.Categoria catInicial){this.categoriaInicial = catInicial; return this;}
        public Conta Build(){return new Conta(this);}
    }

    private Conta(Builder builder){
        this.numero = builder.numero;
        this.nomeCorrentista = builder.nomeCorrentista;
        this.saldoLivreInicial = builder.saldoLivreInicial;
        this.salAplicacaoInicial = builder.salAplicacaoInicial;
        this.taxaRemuneracao = builder.taxaRemuneracao;
        this.taxaSaldoNegativo = builder.taxaSaldoNegativo;
        this.categoriaInicial = builder.categoriaInicial;
    }
}