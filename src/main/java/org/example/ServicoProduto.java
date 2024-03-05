package org.example;

import java.util.ArrayList;
import java.util.List;

public class ServicoProduto {

    static List<Produto> listaProduto = new ArrayList<>();

    public static int validarProduto(Produto produto){
        if(produto.getPreco() == 0){
            return 0;
        }
        if(produto.getNome() == null || produto.getNome().trim().isEmpty()){
            return 0;
        }
        return 1;
    }

    public static int cadastrarProduto(Produto produto){
        try{
            listaProduto.add(produto);
            return 1;
        }catch (Exception e){
            return 0;
        }
    }

    public static boolean editarProduto(Produto produto){
        try{
            if(validarProduto(produto) == 1){
                for(Produto p : listaProduto){
                    if(p.getIdProduto() == produto.getIdProduto()){
                        p.setNome(produto.getNome());
                        p.setDescricao(produto.getDescricao());
                        p.setCategoria(produto.getCategoria());
                        p.setPreco(produto.getPreco());
                        p.setQuantidade(produto.getQuantidade());
                        return true;
                    }
                }
                return false;
            }else {
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }


    public static boolean excluirProduto(int idProduto){
        for(int i = 0; i < listaProduto.size(); i ++){
            if(listaProduto.get(i).getIdProduto() == idProduto){
                listaProduto.remove(i);
                return true;
            }
        }
        return false;
    }


    public static Produto consultarProduto(int idProduto){
        Produto produto = null;
        for(Produto p : listaProduto){
            if(p.getIdProduto() == idProduto){
                produto = p;
                break;
            }
        }
        return produto;
    }

    public static List<Produto> getListaProduto() {
        return listaProduto;
    }

    public static void setListaProduto(List<Produto> listaPessoa) {
        ServicoProduto.listaProduto = listaPessoa;
    }
}
