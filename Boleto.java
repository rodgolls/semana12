public Boleto extends Pagamento{
   private String numeroDoBoleto;
   private int dia;
   private int mes;
   private int anoDeVencimento;
   
   public Boleto(String numeroDoBoleto, int dia, int mes, int anoDeVencimento, String nomeDoPagador, String cpf, double valorASerPago){
      super(nomeDoPagador, cpf, valorASerPago);
      this.numeroDoBoleto = numeroDoBoleto;
      this.mes = mes;
      this.anoDeVencimento = anoDeVencimento;
   }
   public String getNumeroDoBoleto(){
      return numeroDoBoleto;
   }
   public int getMes(){
      return mes;
   }
   public int getAnoDeVencimento{
      return anoDeVencimento;
   }
   public void setNumeroDoBoleto(String numeroDoBoleto){
      this.numeroDoBoleto = numeroDoBoleto;
   }
   public void setMes(int mes){
      this.mes = mes;
   }
   public void setAnodeVencimento(int anoDeVencimento){
      this.anoDeVencimento = anoDeVencimento;
   }
}