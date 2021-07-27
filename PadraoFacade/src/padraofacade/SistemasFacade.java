
package padraofacade;

public class SistemasFacade {
    
    protected SistemaDePagamento pagamento;
    protected SistemaDePassagem passagemAviao;
    protected SistemaDeReservaHotel reservaHotel;
    protected SistemaDeAluguelCarro aluguelCarro;
    
    public void inicializarSubsistemas() {
        pagamento = new SistemaDePagamento();
        pagamento.formaDePagamento();
        
        passagemAviao = new SistemaDePassagem();
        passagemAviao.companhiaAeria();
        
        reservaHotel = new SistemaDeReservaHotel();
        reservaHotel.hotel();
        
        aluguelCarro = new SistemaDeAluguelCarro();
        aluguelCarro.alugarCarro();
    }
    
    public void pagamentoFoiAceitoPor(String forma){
        pagamento.pagamentoFoiAceitoPor(forma);
    }
    
    public void destinoViajem(String forma) {
        passagemAviao.destinoViajem(forma);
    }
    
    public void quartoDeHotel(String forma){
        reservaHotel.quartoDeHotel(forma);
    }

}
