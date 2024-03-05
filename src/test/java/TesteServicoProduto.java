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
        Pessoa pessoa = new Pessoa();
        pessoa.setIdPessoa(1);
        pessoa.setNome("Ageu");
        pessoa.setCpf("11111111111111");

        Assert.assertEquals(1, ServicoPessoa.validarPessoa(pessoa));

        Assert.assertEquals(1, ServicoPessoa.cadastrarPessoa(pessoa));
    }


}
