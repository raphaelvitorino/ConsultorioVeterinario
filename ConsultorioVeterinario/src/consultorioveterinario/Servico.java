/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorioveterinario;

/**
 *
 * @author Fabinho
 */
public class Servico {
    private String nomeServico;
    private double valor;

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void tipoServico(){
        Servico servico = new Servico();
        servico.setNomeServico(nomeServico);
        servico.setValor(valor);
    }
    
}
