

public class ShoppingRJ {

    private String nome, cidade, bairro, rua; //atributos, propriedades
    private int numero; //atributos, propriedades

    public ShoppingRJ(String nome, String cidade, String bairro, String rua, int numero){
        this.nome = nome;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public void imprimirDados(){ // método imprimirDados() 
        System.out.println("Nome:  "  + nome + ", Cidade:  "  + cidade  + ", Bairro:  "  + bairro  + ", Rua: " +  rua  + ", Número: " +  numero);
    }
   
    public void saudacao(){
        System.out.println("Bem-Vindo ao Shopping " + nome);
    }

    public static void main(String []args){
        ShoppingRJ shopping = new ShoppingRJ("plazza", "niteroi", "centro", "Av. Amaral peixoto", 297);
        shopping.imprimirDados();
        shopping.saudacao();
    }
}