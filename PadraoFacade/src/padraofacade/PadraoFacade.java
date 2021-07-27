
package padraofacade;

public class PadraoFacade {

    public static void main(String[] args) {
        System.out.println("#### Configurando subsistemas #####");
        SistemasFacade fachada = new SistemasFacade();
        fachada.inicializarSubsistemas();
        
        System.out.println("#### Utilizando subsistemas ####");
        fachada.pagamentoFoiAceitoPor("Dinheiro");
        fachada.destinoViajem("Rio de Janeiro");
        fachada.quartoDeHotel("Quarto nº 35");
    }
    
}
