package TallerGenericsYCollections.Punto10;

import java.util.LinkedList;
import java.util.Queue;

public class MergeQueues<T> {
    public <T> Queue<T> mergeQueues(Queue<T> a, Queue<T> b){
        Queue<T> resultado = new LinkedList<>();

        while(!a.isEmpty() || !b.isEmpty()){
            if(!a.isEmpty()){
                resultado.offer(a.poll());
            }
            if(!b.isEmpty()){
                resultado.offer(b.poll());
            }
        }
        return resultado;
    }
}
