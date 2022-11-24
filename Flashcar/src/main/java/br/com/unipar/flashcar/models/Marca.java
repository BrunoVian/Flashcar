
package br.com.unipar.flashcar.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Marca {
    private int id;
    private String descricao;
    private int modelo_id;
 
}
