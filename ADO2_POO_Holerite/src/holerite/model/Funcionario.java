/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holerite.model;
import holerite.calculos.*;
/**
 *
 * @author lucas.amsantos4
 */
public class Funcionario extends Pessoa{
    private String registro;
    private double salarioBruto;
    private double salarioLiquido;
    private int bonusHr; //por hora trabalhada
    
    private double irrf; //valor a ser descontado
    private double inss;
    private double convenioMed;
    private double vAl;
    private double vr;
    
    private double valorVtDia; //valor das conduções ida e volta por dia
    private double vt;

    public Funcionario(String registro, double salarioBruto, double salarioLiquido, int bonusHr, double valorVtDia, String nome, String rg, String cpf) {
        super(nome, rg, cpf);
        this.registro = registro;
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.bonusHr = bonusHr;
        this.valorVtDia = valorVtDia;
        
        calculoDescontos();
    }
    
    

    private void calculoDescontos() {
        CalculoIRRF irrf = new CalculoIRRF();
        CalculoINSS inss = new CalculoINSS();
        CalculoConvenioMed convenioMed = new CalculoConvenioMed();
        CalculoVA vAl = new CalculoVA();
        CalculoVR vr = new CalculoVR();
        CalculoVT vt = new CalculoVT();
        
        this.inss = inss.calculoINSS(salarioBruto);
        this.irrf = irrf.calculoIRRF(this.salarioBruto-this.inss);
        this.convenioMed = convenioMed.calculoConvMed(salarioBruto);
        this.vAl = vAl.calculoVA(salarioBruto);
        this.vr = vr.calculoVR(salarioBruto);
        this.vt = vt.calculoVT(salarioBruto, this.valorVtDia);
    }

    
    
    
    
}
