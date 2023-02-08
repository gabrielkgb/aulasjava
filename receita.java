public class receita {
    
    private String nome, tipo, nacionalidade, duracao; //atributos, propriedades
  //atributos, propriedades

    public receita(String nome, String tipo, String nacionalidade, String duracao){
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
        receita receitaa = new receita ("lasanha", "salgado", "italiana", "20 minutos");
        receitaa.imprimirDados();
        receitaa.saudacao();
    }

}

