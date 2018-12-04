package com;

public class Main {
    public static void add(Cell cell){
        cell.setT("Hello");
    }
    public static void main(String[] args) {
            Cell<House> cell=new Cell<>();
            add(cell);
            House house=cell.getT();
    }
}
class House{}
class Cell<T>{
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}










































