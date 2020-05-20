public class Cheque extends Pagamento{
   private String numeroDoCheque;
   
   public Cheque(String numeroDoCheque, String nomeDoPagador,double valorASerPago){
      super(nomeDoPagador,  valorASerPago);
      this.numeroDoCheque = numeroDoCheque;
   }
   public String getNumeroDoCheque(){
      return numeroDoCheque;
   }
   public void setNumeroDoCheque(String numeroDoCheque){
      this.numeroDoCheque;
   }
}