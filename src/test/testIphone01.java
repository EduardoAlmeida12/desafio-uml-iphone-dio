package test;

import dominio.Iphone;

public class testIphone01 {
    public static void main(String[] args) {
        Iphone iphone=new Iphone();
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
    }
}
