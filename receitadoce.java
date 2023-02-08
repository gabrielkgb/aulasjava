public class receitadoce {
    private String nome, tipo, nacionalidade, duracao; //atributos, propriedades
    //atributos, propriedades
  
      public receitadoce (String nome, String tipo, String nacionalidade, String duracao){
          this.nome = nome;
          this.tipo = tipo;
          this.nacionalidade = nacionalidade;
          this.duracao = duracao;
      }
  
      public void imprimirDados(){ // método imprimirDados() 
          System.out.println("Nome:  "  + nome + ", tipo:  "  + tipo  + ", nacionalidade:  "  + nacionalidade  + ", duracao: " +  duracao);
      }
     
      public void saudacao(){
          System.out.println("receita de " + nome);
      }
  
      public static void main(String []args){
          receitadoce receitaa = new receitadoce ("bolo de morango", "doce", "françes", "60 minutos");
          receitaa.imprimirDados();
          receitaa.saudacao();
      }
  
}
