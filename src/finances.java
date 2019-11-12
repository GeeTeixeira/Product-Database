
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermeteixeira
 */
public class finances implements Serializable{
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date d = new Date();
    public class custoItems implements Serializable{ // This generates a business expense
        String nome;
        String data;
        float valor;
        custoItems(){
            nome = "";
            data = "";
            valor = 0.0f;
        }
        custoItems(String nome, String data, float valor){
            this.nome = nome;
            this.data = data;
            this.valor = valor;
        }
    }
    public class atual implements Serializable{
        String start;
        String end = "Atual";
        float valorBruto; // valor de todas as vendas atuais - init = 0
        float valorProdutos; // expectativa de lucro. Soma de todos os produtos em mao
        float prolabore; // salario da coitada
        float valorLiquido; // valor liquido - calculado ao fechar o mes
        float valorCustos; // valor de todos os custos da empresa 
        ArrayList<custoItems> custos;
        ArrayList<compra> vendas;
        
        atual(){
            start = dateFormat.format(d);
            valorBruto = 0.0f;
            prolabore = 0.0f;
            valorLiquido = 0.0f;
            valorCustos = 0.0f;
            valorProdutos = 0.0f;
            custos = new ArrayList<custoItems>();
            vendas = new ArrayList<compra>();
        }
        atual(float pro){
            start = dateFormat.format(d);
            valorBruto = 0.0f;
            prolabore = pro;
            valorLiquido = 0.0f;
            valorCustos = 0.0f;
            valorProdutos = 0.0f;
            custos = new ArrayList<custoItems>();
            vendas = new ArrayList<compra>();
        }
        atual(float pro, float valorProd){
            start = dateFormat.format(d);
            valorBruto = 0.0f;
            prolabore = pro;
            valorLiquido = 0.0f;
            valorCustos = 0.0f;
            valorProdutos = valorProd;
            custos = new ArrayList<custoItems>();
            vendas = new ArrayList<compra>();
        }
        atual(atual obj){
            start = dateFormat.format(d);
            valorBruto = obj.valorBruto;
            prolabore = obj.prolabore;
            valorLiquido = obj.valorLiquido;
            valorCustos = obj.valorCustos;
            valorProdutos = obj.valorProdutos;
            custos = new ArrayList<custoItems>();
            custos.addAll(obj.custos);
            vendas = new ArrayList<compra>();
            vendas.addAll(obj.vendas);
        }
    }
    public class compra implements Serializable{
        String nomeClient;
        String data;
        ArrayList<produtos.produto> prod;
        float valorTotal;
        boolean card;
        compra(){
            nomeClient = "";
            data = "";
            prod = new ArrayList<>();
            valorTotal = 0.0f;
            card = false;
        }
        compra(String nome, float valor, boolean pagamento, String date){
            nomeClient = nome;
            valorTotal = valor;
            card = pagamento;
            prod = new ArrayList<>();
            data = date;
        }
    }
}
