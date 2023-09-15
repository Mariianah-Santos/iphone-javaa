package Celular;
public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical musica = new ReprodutorMusical();
        AparelhoTelefonico contato = new AparelhoTelefonico();

        musica.listaMusica();
        musica.playMusica();
        musica.musicaPausada();
        musica.proximaMusica();
        musica.musicaAnterior(); 
        System.out.println("--------------------");
        contato.todosContatos();
        contato.adicionarContato();
        contato.removerContato();
        contato.editarContato();

    }
}

