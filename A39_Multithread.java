class InnerMultithread_1 extends Thread {

    public void run() {
        System.out.println("This is the thread InnerMultithread_1 ");
    }
}

class InnerMultithread_2 extends Thread {

    public void run() {
        System.out.println("This is the thread InnerMultithread_2 ");
    }
}

class InnerMultithread_3 extends Thread {

    public void run() {
        System.out.println("This is the thread InnerMultithread_3 ");
    }
}

class InnerMultithread_4 extends Thread {

    public void run() {
        System.out.println("This is the thread InnerMultithread_4 ");
    }
}

class InnerMultithread_5 implements Runnable {

    public void run() {
        System.out.println("This is the thread InnerMultithread_5 made using the runnable interface  ");
    }

}

class A39_Multithread {
    public static void main(String[] args) {
        InnerMultithread_1 obj1 = new InnerMultithread_1();
        InnerMultithread_2 obj2 = new InnerMultithread_2();
        InnerMultithread_3 obj3 = new InnerMultithread_3();
        InnerMultithread_4 obj4 = new InnerMultithread_4();
        InnerMultithread_5 refr = new InnerMultithread_5();
        Thread obj5 = new Thread(refr);
        obj1.setPriority(5);
        obj2.setPriority(4);
        obj3.setPriority(3);
        obj4.setPriority(2);
        obj5.setPriority(1);
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
        obj5.start();
    }
}