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
public class Usuario {
    Long id;
    String nome;
    String email;
    String senha;
    boolean is_adm;
    
}
