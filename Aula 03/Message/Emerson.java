import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;

public class Emerson
{
    public static void main(String [] args)
    {
        Random randomGenerator = new Random();
        HashSet<Message> mySet = new HashSet<Message>();

        mySet.add(new Message("a"));
        mySet.add(new Message("b"));
        mySet.add(new Message("c"));
        mySet.add(new Message("d"));
        mySet.add(new Message("e"));
        mySet.add(new Message("f"));
        mySet.add(new Message("g"));
        mySet.add(new Message("h"));

        for(Message element: mySet)
        {
            System.out.println(element.getText());
        }

        /*
        ArrayList<Message> mensagens = new ArrayList<Message>();

        mensagens.add(new Message("Fora Temer!"));
        mensagens.add(new Message("Fica Dilma!"));
        mensagens.add(new Message("Oi som!"));
        mensagens.add(new Message("Testando!"));
        mensagens.add(new Message("Onoloconosco senhor!"));
        int random = randomGenerator.nextInt(mensagens.size());
        Message mensagem = mensagens.get(random);
        System.out.println(mensagem.getText());
        */


    }
}