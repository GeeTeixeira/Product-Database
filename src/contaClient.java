/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermeteixeira
 */
public class contaClient {
    String nome;
    contact c;
    Float deve;
    Float totalVendas;
    
    class contact{
        String phone;
        String email;
        String address;
        contact(String ph){
            phone = ph;
            email = "";
            address = "";
        }
        contact(contact oldC){
            phone = oldC.phone;
            email = oldC.email;
            address = oldC.address;
        }
        contact(String ph, String mail, String add){
            phone = ph;
            email = mail;
            address = add;
        }
    }
    contaClient(String nome,String phone){
        this.nome = nome;
        c = new contact(phone);
        totalVendas = 0.0f;
    }
    contaClient(String nome,String phone, Float dv){
        this.nome = nome;
        c = new contact(phone);
        deve = dv;
        totalVendas = 0.0f;
    }
    public void addConta(Float dv){
        deve += dv;
    }
    public void addVenda(Float vnd){
        totalVendas += vnd;
    }
    
}
