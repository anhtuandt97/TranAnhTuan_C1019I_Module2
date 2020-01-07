package B6_CauTrucDuLieuVaGiaiThuat.BaiTap.ArrayList;

import java.util.Arrays;

public class MyList1<E> {
    private int size =0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList1() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList1(int capacity) {
        if(capacity>=0){
            elements = new Object[capacity];
        }
       else {
           throw new IllegalArgumentException("Capacity"+ capacity);
        }
    }

    public int size(){
        return this.size;
    }

    public boolean add(E element){
        if(elements.length==size){
            this.ensureCapacity(5);
        }
        elements[size]= element;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity){
        if(minCapacity>=0){
            int newSide = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSide);
        }
        else{
            throw new IllegalArgumentException("minCapacity"+ minCapacity);
        }
    }

    public void clear(){
        size=0;
        for(int i=0; i<elements.length; i++){
            elements[i]=null;
        }
    }

    public void add(E elemen, int index){
        if(index>elements.length){
            throw new IllegalArgumentException("index" + index);
        }
        else if(elements.length==size){
            this.ensureCapacity(5);
        }
        if (elements[index]==null){
            elements[index]=elemen;
            size++;
        }else {
            for (int i = size+1; i>=index; i++){
                elements[i]=elements[i+1];
                size++;
            }
            elements[index] = elemen;
        }
    }

    public E get(int index){
        return (E) elements[index];
    }

    public int indexOf(E element){
        int index= -1;
        for(int i=0; i<size;i++){
            if(this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }

    public boolean contains(E element){
        return this.indexOf(element) >=0;
    }

    public MyList1<E> clone(){
        MyList1<E> v = new MyList1<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }

    public E remove(int index){
        if(index<0||index>elements.length){
            throw new IllegalArgumentException("Error index"+ index);
        }
        E element = (E)elements[index];
        for (int i=index;i<size-1;i++){
            elements[i]=elements[i+1];
        }
        elements[size-1]= null;
        size--;
        return element;
    }
}
