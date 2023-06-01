package br.ufmt.GPP.Responses;

import br.ufmt.GPP.models.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemResponse {
    private int id;
    private String nome;
    private int produto_id;
    private String descricao;
    private String codigo;
    private Integer local_id;
    private Integer tipo_codigo_id;
    public static ItemResponse from (Item entidade){
        ItemResponse response = new ItemResponse();
        response.setId(entidade.getId());
        response.setNome(entidade.getNome());
       // response.setProduto_id(entidade.getProdutos().getProdutos);
        response.setDescricao(entidade.getDescricao());
        response.setCodigo(entidade.getCodigo());
       // response.setTipo_codigo_id(entidade.getTipo_codigo().getTipo_codigos);
        //response.setLocal_id(response.getLocal_id().getLocal);
        return response;
    }
}
