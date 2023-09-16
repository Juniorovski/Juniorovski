import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private List<Vendas> vendas;

    public Main() {
        this.vendas =new ArrayList<>();
    }
    public void addProduct(String product, int codeProduct, double price, int amount){
       vendas.add(new Vendas( product,codeProduct, price,amount));
    }

    public void showProducts(){
        System.out.println(vendas);
    }

    public void deleteProduct(String product){
     List<Vendas> removeProduct = new ArrayList<>();
     if (!vendas.isEmpty()) {
         for (Vendas venda: vendas) {
             if (venda.getProduct().equalsIgnoreCase(product)){
                 removeProduct.add(venda);
         }
     }
         vendas.removeAll(removeProduct);
         if(!vendas.removeAll(removeProduct)){
             System.out.println("Produto deletado com sucesso! \n Produto deletado: "+ product);
         }else{
             System.out.println("Produto nao removido!");
         }
     }else {
         System.out.println("Lista está vazia!");
     }
    }
    public static void main(String[] args) {
        System.out.println("Bem vindo ao painel de controle do sistema!");
        Main main = new Main();

        main.addProduct("Cerveja",01200,5.0,12);
        main.addProduct("Guarana",02300,5.0,18);
        main.addProduct("Cachaça",01100,5.0,15);
        main.showProducts();
        main.deleteProduct("Cachaça");
        main.showProducts();
    }
}
