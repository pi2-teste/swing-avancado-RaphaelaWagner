/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula5;

/**
 *
 * @author seunome.sobrenome
 */
public class Computador {
        public static String fabricante = "Dell";
        
        public String tipoComputador;
        public String sistemaOperacional;
        public String HD;
        public String[] acessorios;
        public String[] servicos;
        
        public Computador(){
            
        }

    public static void setFabricante(String fabricante) {
        Computador.fabricante = fabricante;
    }

    public void setTipoComputador(String tipoComputador) {
        this.tipoComputador = tipoComputador;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

    public void setAcessorios(String[] acessorios) {
        this.acessorios = acessorios;
    }

    public void setServicos(String[] servicos) {
        this.servicos = servicos;
    }

    public static String getFabricante() {
        return fabricante;
    }

    public String getTipoComputador() {
        return tipoComputador;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public String getHD() {
        return HD;
    }

    public String[] getAcessorios() {
        return acessorios;
    }

    public String[] getServicos() {
        return servicos;
    }
}
    


