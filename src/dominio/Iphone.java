package dominio;

import Service.AparelhoTelefonico;
import Service.NavegadordeInternet;
import Service.ReprodutorMusical;

public class Iphone  implements ReprodutorMusical, AparelhoTelefonico, NavegadordeInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica");
    }

    @Override
    public void ligar() {
        System.out.println("Iniciando chamada");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }
}
