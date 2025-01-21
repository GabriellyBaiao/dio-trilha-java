package queue;


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<CarroQueue> queueCarros = new LinkedList<CarroQueue>();

        queueCarros.add(new CarroQueue("Ford"));
        queueCarros.add(new CarroQueue("Chevrolet"));
        queueCarros.add(new CarroQueue("Fiat"));
        System.out.println(queueCarros.add(new CarroQueue("Peugeot"))); //IllegalStateException
        System.out.println(queueCarros);

        System.out.println(queueCarros.element());//Pega o elemento da cabeça da fila sem remover
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new CarroQueue("Renault"))); //Retorna false se não conseguir
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());//Pega o elemento da cabeça da fila e se tiver vazia null
        System.out.println(queueCarros);

        System.out.println(queueCarros.remove()); //Remove
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); //Remove ou retorna nulo para caso de fila vazia
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());


    }
}
