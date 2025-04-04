package smartphone;

import smartphone.models.Iphone;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância do Iphone
        Iphone iphone = new Iphone();

        // Testando as funcionalidades do Iphone
        iphone.ligar("1234567890");
        iphone.atender();
        iphone.correioDeVoz();

        iphone.tocarMusica("Minha Música Favorita");
        iphone.pausarMusica();
        iphone.adicionarMusica("Outra Música Favorita");
        iphone.tocarMusica("Outra Música Favorita");
        iphone.pausarMusica();

        iphone.exibirPagina("https://www.example.com");
        iphone.adicionarAba("https://www.example.com/aba2");
        iphone.atualizarPagina("https://www.example.com/aba2");

    }
}
