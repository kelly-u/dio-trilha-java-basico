import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        //itemList.removeAll(itemList)
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }
    
    public int calcularValorTotal(){
        return itemList.size();
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras listaItem = new CarrinhoDeCompras();

        System.out.println("O número total de elementos na lista é: " + listaItem.calcularValorTotal());

        listaItem.adicionarItem("pirulito", 6.9, 2);
        listaItem.adicionarItem("confeito", 8.9, 4);
        listaItem.adicionarItem("jujuba", 2, 9);
        listaItem.adicionarItem("jujuba", 4, 5);

        System.out.println("O número total de elementos na lista é: " + listaItem.calcularValorTotal());

        listaItem.exibirItens();
        
        listaItem.removerItem("jujuba");
        System.out.println("O número total de elementos na lista é: " + listaItem.calcularValorTotal());

        listaItem.exibirItens();
    }

}
