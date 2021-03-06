package ru.samsung.itschool.mdev;

// T - тип данных
// V - значения
// K - ключ
// N - число

public class School<K, V> {
    private K k;
    private V v;

    public School(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
