import java.util.Arrays;

public class PokemonTest
{
    public static void main(String[] args)
    {
        Pikachu pika = new Pikachu();
        System.out.println(pika.getHP());
        System.out.println();
        System.out.println(Arrays.toString(pika.getStats()));
        pika.levelUp(9);
        System.out.println(Arrays.toString(pika.getStats()));
    }
}