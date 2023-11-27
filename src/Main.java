import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {

//AGORA NO MAIN NÓS VAMOS DAR VIDA AQUILO QUE PROJETAMOS TRAREMOS A VIDA NOSSO PROJETO...
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Pet", "Preto", 10, 9.8, 5);
        Gato gato1 = new Gato( "file", "branco", 5, 2.2);
        Passaro passaro1 = new Passaro("Piu Piu", "Amarelo", 1.2);

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());

        System.out.println(cachorro1);
        //sout é para criar System.out.println

        cachorro1.latir();
        cachorro1.peidar();
        passaro1.piar();
        gato1.miar();
        cachorro1.nome();
        System.out.println("O Cachorro pegou uma " +  cachorro1.pegar() + " esse cachorro é esperto!!");

        System.out.println("O Cachorro esta " + cachorro1.interagir( "feliz"));
        System.out.println("O Cachorro esta " + cachorro1.interagir( "Nada"));
        System.out.println("O Cachorro esta " + cachorro1.interagir( "vai dormir"));
        System.out.println("Meu cachorro quando falo ele dá " + cachorro1.falar( "olhar"));
        System.out.println("Meu cachorro é desobediente quando falo ele " + cachorro1.falar( "deitar"));
        System.out.println("Quando falo pra meu cachorro fazer o numero 1 ele faz " + cachorro1.obediente( "xixi"));
        System.out.println("Quando falo pra meu cachorro fazer o numero 2 ele faz " + cachorro1.obediente( "coco"));
        System.out.println("Ou mando ele deitar " + cachorro1.obediente("Deitar"));
        System.out.println("Quando dou comida pra meu gatto " + gato1.interagir( "come"));
        System.out.println("Faço carinho no meu gato " + gato1.interagir("Feliz"));
        System.out.println("Quando dou a bolinha pra meu gato ele " + gato1.interagir("brinca e pula corre "));
        System.out.println( "Quando dou alpiste e falo com meu passaro ele " + passaro1.interagir( "come e canta"));










    }
}