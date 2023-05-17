/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Administrador
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    Long id;
    String nome;
    String cpf;
    String cnpj;
    String endereco;
    String telefone;
    
    
}
