
public class Contas {
    enum Categoria {NORMAL, ADVANCED, PREMIUM };
    private long numero;
    private String nomeCorrentista;
    private int saldoLivreInicial;
    private int salAplicacaoInicial;
    private double taxaRemuneracao;
    private double taxaSaldoNegativo;
    private Categoria categoriaInicial;

    public static class Builder {
        private long numero;
        private String nomeCorrentista;
        private int saldoLivreInicial = 0;
        private int salAplicacaoInicial = 0;
        private double taxaRemuneracao = 0;
        private double taxaSaldoNegativo = 0;
        private Categoria categoriaInicial = Categoria.NORMAL;

        public Builder (long numero, String nomeCorrentista){
            this.numero = numero;
            this.nomeCorrentista = nomeCorrentista;
        }

        public Builder saldoLivreInicial (int saldoLivreInicial){this.saldoLivreInicial = saldoLivreInicial; return this;}
        public Builder salAplicacaoInicial (int salAplicacaoInicial){this.salAplicacaoInicial = salAplicacaoInicial; return this;}
        public Builder taxaRemuneracao (double taxaRemuneracao){this.taxaRemuneracao = taxaRemuneracao; return this;}
        public Builder taxaSaldoNegativo (double taxaSaldoNegativo){this.taxaSaldoNegativo = taxaSaldoNegativo; return this;}
        public Builder categoriaInicial (Categoria categoriaInicial){this.categoriaInicial = categoriaInicial; return this;}

        public Contas build(){return new Contas(this);}

       
    }

     private Contas (Builder builder){
            this.numero = builder.numero;
            this.nomeCorrentista = builder.nomeCorrentista;
            this.saldoLivreInicial = builder.saldoLivreInicial;
            this.salAplicacaoInicial = builder.salAplicacaoInicial;
            this.taxaRemuneracao = builder.taxaRemuneracao;
            this.taxaSaldoNegativo = builder.taxaSaldoNegativo;
            this.categoriaInicial = builder.categoriaInicial;
    }

    public long getNumero() {
        return numero;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public int getSaldoLivreInicial() {
        return saldoLivreInicial;
    }

    public int getSalAplicacaoInicial() {
        return salAplicacaoInicial;
    }

    public double getTaxaRemuneracao() {
        return taxaRemuneracao;
    }

    public double getTaxaSaldoNegativo() {
        return taxaSaldoNegativo;
    }

    public Categoria getCategoriaInicial() {
        return categoriaInicial;
    }

    public String toString(){
        return "Conta: \n\tNumero: "+ numero + "\n\tCorrentista: "+ nomeCorrentista +"\n\tSalLivreIn: "
                +saldoLivreInicial + "\n\tSalAplicacaoIn: " +salAplicacaoInicial+ "\n\tTaxaRem: "
                + taxaRemuneracao + "\n\tTaxaSalNegativo: " + taxaSaldoNegativo + "\n\tCategoriaIn: "
                + categoriaInicial;
    }
}
