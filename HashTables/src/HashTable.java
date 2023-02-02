import java.util.*;

public class HashTable {
    public class KeyValueEntry {
        private int k;
        private String v;
        KeyValueEntry(int k, String v){
            this.k = k;
            this.v = v;
        }
    }
    private LinkedList<KeyValueEntry>[] arr = new LinkedList[5];

    // HashTable(int length){
    //     arr = new LinkedList<KeyValueEntry>[length];
    // }

    public void put(int k, String v){
        int idx = k%arr.length;
        var entry = new KeyValueEntry(k, v);
        if (arr[idx]==null) arr[idx] = new LinkedList<>();
        for (var e : arr[idx]) if (e.k==k) e.v = v;
        arr[idx].addLast(entry);
    }

    public String get(int k){
        int idx = k%arr.length;
        if (arr[idx] != null) for (var e : arr[idx]) if (e.k==k) return e.v;
        return null;
    }

    public void remove(int k){
        int idx = k%arr.length;
        if (arr[idx] != null) for (var e : arr[idx]) if (e.k==k){arr[idx].remove(e); break;}
    }




}
