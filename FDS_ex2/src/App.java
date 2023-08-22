

public class App{
    public static void main(String[]args){
        Contas conta1 = new Contas.Builder(12, "Joao Silva")
                                    .build();

        System.out.println(conta1.toString());

        Contas conta2 = new Contas.Builder(50, "Joao Silva")
                                    .salAplicacaoInicial(5000)
                                    .saldoLivreInicial(10000)
                                    .taxaRemuneracao(2.5)
                                    .taxaSaldoNegativo(5.0)
                                    .build();

        System.out.println("\n\n"+conta2.toString());

        Contas conta3 = new Contas.Builder(275, "Joao Silva")
                                    .salAplicacaoInicial(75000)
                                    .saldoLivreInicial(500000)
                                    .taxaRemuneracao(3.0)
                                    .taxaSaldoNegativo(4.0) 
                                    .categoriaInicial(Contas.Categoria.PREMIUM)
                                    .build();

        System.out.println("\n\n"+conta3.toString());
    }
}