package TallerGenericsYCollections.Punto2;

import java.util.ArrayList;
import java.util.List;

public class Par<K,V> {
    public K key;
    public V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Par(K k, V v){
        this.key = k;
        this.value = v;
    }
}
