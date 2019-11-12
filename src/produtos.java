/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermeteixeira
 */

import java.io.Serializable;
public class produtos implements Serializable {
    public class precos implements Serializable{
        String dataRecebido;
        String dataVenda;
        float valor_item; // valor do item em dolares
        float transporte; //taxa individual de transporte para o item. 
        float recebido; // valor pago pelo item
        float valor_final; // valor final do item USAR ESTE PARA VALOR FINAL PARA VENDA
        float porcentagem_do_total; 
        float valor_item_real;
        float dolar;
        //float valor_venda; // valor final da venda
        float lucro;
        float imposto;

        //valor = value in dollars
        //dollar = dolar exchange
        //inputed final value
        precos(float valor, float dollar,float venda){
            recebido = 0.0f;
            
            dolar = dollar;
            
            valor_item = valor;
            
            valor_final = venda;
            
            valor_item_real = valor_item*dolar;
            
            lucro = 0.0f;
            
            imposto = 0.0f;
            
            porcentagem_do_total = 0.0f;
        }
        precos(){
            valor_item = 0.00f; 
            transporte = 0.00f; 
            recebido = 0.00f;
            valor_final = 0.00f;
            imposto = 0.00f;
            lucro = 0.00f;
        }
        precos(precos obj){
            valor_item = obj.valor_item; 
            transporte = obj.transporte; 
            recebido = obj.recebido;
            valor_final = obj.valor_final;
            imposto = obj.imposto;
            lucro = obj.lucro;
            valor_item_real = obj.valor_item_real;
        }
    }
    public class produto implements Serializable{
        String nome;
        String desc;
        precos valor;
        String loja;
        String dept; //departamento
        String sexo;
        String tamanho;
        int remessa;
        int quantidade;
        produto(String name,String description,String loja, String dept,String size,int qnt,String sexo,int remessa){
            nome = name;
            desc = description;
            this.loja = loja;
            this.dept = dept;
            tamanho = size;
            quantidade = qnt;
            this.sexo = sexo;
            this.remessa = remessa;
        }
        produto(produto obj){
            nome = obj.nome;
            desc = obj.desc;
            this.loja = obj.loja;
            this.dept = obj.dept;
            tamanho = obj.tamanho;
            quantidade = obj.quantidade;
            this.sexo = obj.sexo;
            this.remessa = obj.remessa;
            this.valor = new precos(obj.valor);
        }
        public String toString(){
            return nome+" | Qnt: "+quantidade+" | Valor "+valor.valor_final;
        }
        public boolean equals(produto prod){
            if(nome.contains(prod.nome)){
                if(dept.equals(prod.dept)){
                    return true;
                }
            }
            return false;
        }
    }
    public class list_produtos implements Serializable{
        produto prod;
        list_produtos prox;
        list_produtos(){
            prod = null;
            prox = null;
        }
        list_produtos(produto prod){
            this.prod = prod;
            prox = null;
        }
        public void adc_produto(produto product){
            list_produtos temp = this;
            while(temp.prox != null){
                temp = temp.prox;
            }
            temp.prox = new list_produtos(product);
        }
    }
    public class remessa implements Serializable{
        String data;
        int id;
        float total_real;
        float dolar;
        float total_dolar;
        float frete;
        float imposto;
        remessa(){
            data = "";
            id = 0;
            total_real = 0.0f;
            total_dolar = 0.0f;
            frete = 0.0f;
            imposto = 0.0f;
            dolar = 0.0f;
        }
    }
    public class remessaClass implements Serializable{
        String data;
        list_produtos allProd = null;
        String metodo_transporte;
        int remessaID;
        int transporteID; //valor 1 para navio, 2 para mala, ou 3 para correio
        remessaClass(){
            data = "";
            metodo_transporte = "";
        }
        remessaClass(String data,String transporte){
            this.data = data;
            metodo_transporte = transporte;
            if(transporte.compareToIgnoreCase("Navio") == 0) transporteID = 1;
            else if(transporte.compareToIgnoreCase("Avião") == 0) transporteID = 2;
            else if(transporte.compareToIgnoreCase("Correio") == 0) transporteID = 3;
        }
        public void add_prod(produto prod){
            if(this.allProd == null) this.allProd = new list_produtos(prod);
            else allProd.adc_produto(prod);
        }
        public String toString(){
            return data+" "+metodo_transporte;
        }
    }
}