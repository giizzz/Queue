public class Queue {
    int [] queue =new int[10];
    int head=0;
    int tail=0;
    void enqueue(int value){
        queue[tail++]=value;
    }
    void dequeue(){
        System.out.println("Kuyruktan çıkartılan eleman->"+queue[head++]);
    }
    int size(){
        return tail-head;
    }
    void print(){
        for(int i=head;i<tail;i++){
            System.out.println(queue[i]);
        }
    }
}
