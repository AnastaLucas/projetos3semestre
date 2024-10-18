/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holerite.model.cargos;

import holerite.model.Funcionario;

/**
 *
 * @author lucas.amsantos4
 */
public class Gerente extends Funcionario{
private String cargo = "Analista";    

    public Gerente(String registro, double salarioBruto, double salarioLiquido, int bonusHr, double valorVtDia, String nome, String rg, String cpf) {
        super(registro, salarioBruto, salarioLiquido, bonusHr, valorVtDia, nome, rg, cpf);
    }

    
}
