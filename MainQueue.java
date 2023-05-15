import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
        Queue q1=new Queue();
        int sec=0,value;
        Scanner input =new Scanner(System.in);
        while(sec!=5) {
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Queue boyutu");
            System.out.println("4.Queue yazdır");
            System.out.println("5.Çıkış");
            System.out.print("Seçiniz->");
            sec=input.nextInt();
            switch (sec){
                case 1:
                    System.out.print("Eklemek istediğiniz sayıyı giriniz->");
                    value=input.nextInt();
                    q1.enqueue(value);
                    break;
                case 2:
                    q1.dequeue();
                    break;
                case 3:
                    System.out.println("Stack boyutu->"+q1.size());
                    break;
                case 4:
                    q1.print();
                    break;

            }
        }
    }
}
