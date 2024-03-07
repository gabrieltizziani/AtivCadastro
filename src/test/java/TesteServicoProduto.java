import org.example.Produto;
import org.example.ServicoProduto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteServicoProduto {

    @Test
    public void validarProduto(){
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setNome("Mouse");
        produto.setPreco(98.90);

        Assertions.assertEquals(1, ServicoProduto.validarProduto(produto));
    }

    @Test
    public void testeProdutoInvalido(){
        Produto produto = new Produto();
        Assertions.assertEquals(0, ServicoProduto.validarProduto(produto));
    }

    @Test
    public void testeCadastroProduto(){
         Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setNome("Garrafa");
        produto.setPreco(25);

        Assertions.assertEquals(1, ServicoProduto.validarProduto(produto));

        Assertions.assertEquals(1, ServicoProduto.cadastrarProduto(produto));
    }

    @Test
    public void testeEditarPessoa(){
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setNome("Garrafa");
        produto.setPreco(20);
        if(ServicoProduto.validarProduto(produto) == 1){
            if(ServicoProduto.cadastrarProduto(produto) == 1){
                produto.setIdProduto(1);
                produto.setNome("Garrafa");
                produto.setPreco(10);
                produto.setQuantidade(10);
                produto.setCategoria("A");
                Assertions.assertTrue(ServicoProduto.editarProduto(produto));
            }
        }
    }

    @Test
    public void testeExcluirProduto(){
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setNome("Garrafa");
        produto.setPreco(15);
        ServicoProduto.cadastrarProduto(produto);

        Assertions.assertTrue(ServicoProduto.excluirProduto(1));
        Assertions.assertEquals(0, ServicoProduto.getListaProduto().size());
    }

    @Test
    public void testeConsultarPessoa(){
        Produto produto =  new Produto();
        produto.setIdProduto(1);
        produto.setNome("Garrafa");
        produto.setPreco(30);
        ServicoProduto.cadastrarProduto(produto);

        Assertions.assertEquals("Garrafa", ServicoProduto.consultarProduto(1).getNome());
    }


}
