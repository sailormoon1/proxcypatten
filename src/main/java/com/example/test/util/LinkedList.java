package com.example.test.util;


public class LinkedList<E> {
    LinkedList.Node<E> last;
    LinkedList.Node<E> first;
    int size;

    private static class Node<E>{
        E e;
        Node<E> next;
        Node<E> previous;
          Node(Node previous,E e,Node next){
            this.e= e;
            this.next=next;
            this.previous= previous;
        }



    }

    public E get(int i){
        LinkedList.Node<E> var3 ;
        if(i<this.size>>1){
            var3=this.first;
            for(int var1=0;var1< i;var1++){
                var3=var3.next;
            }

        }else {
            var3=this.last;
            for (int var1=this.size;var1>0;var1--){
                var3 =var3.previous;
            }
        }
        return var3.e;
    }

    public  void  add(E e){
        LinkedList.Node<E> pre =this.last;
        LinkedList.Node<E> item =  new LinkedList.Node(pre,e,null);
        this.last=item;
        if(pre==null){
            this.first=item;

        }else {
            pre.next=item;
        }
    }

}
