package br.ufmt.GPP.Responses;


import br.ufmt.GPP.models.Fornecedor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FornecedorResponse {
    private int id;
    private String nome;
    private String cidade_id;
    private String cnpj;
    private String telefone;

    public static FornecedorResponse from (Fornecedor entidade){
        FornecedorResponse response = new FornecedorResponse();
        response.setId(entidade.getId());
        response.setNome(entidade.getFornecedor());
        response.setCidade_id(entidade.getCidade().getFornecedores().toString());
        response.setCnpj(entidade.getCnpj());
        response.setTelefone(entidade.getTelefone());
        return response;
    }


}
