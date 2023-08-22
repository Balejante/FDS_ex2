
public class Contas {
    enum Categoria { NORMAL, ADVANCED, PREMIUM };
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

        public Builder (){}

        public Builder numero (long numero){
            this.numero = numero;
            return this;
        }

        public Builder nomeCorrentista (String nomeCorrentista){
            this.nomeCorrentista = nomeCorrentista;
            return this;
        }

        public Builder saldoLivreInicial (int saldoLivreInicial){
            this.saldoLivreInicial = saldoLivreInicial;
            return this;
        }

        public Builder salAplicacaoInicial (int salAplicacaoInicial){
            this.salAplicacaoInicial = salAplicacaoInicial;
            return this;
        }

        public Builder taxaRemuneracao (double taxaRemuneracao){
            this.taxaRemuneracao = taxaRemuneracao;
            return this;
        }

        public Builder taxaSaldoNegativo (double taxaSaldoNegativo){
            this.taxaSaldoNegativo = taxaSaldoNegativo;
            return this;
        }

        public Builder categoriaInicial (Categoria categoriaInicial){
            this.categoriaInicial = categoriaInicial;
            return this;
        }

       
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
}
