class thread_1 extends Thread {

    public void run() {
        System.out.println("This is the thread InnerMultithread_1 ");
    }
}

class thread_2 extends Thread {

    public void run() {
        System.out.println("This is the thread InnerMultithread_2 ");
    }
}

class thread_3 extends Thread {

    public void run() {
        System.out.println("This is the thread InnerMultithread_3 ");
    }
}

class thread_4 extends Thread {

    public void run() {
        System.out.println("This is the thread InnerMultithread_4 ");
    }
}

class thread_5 implements Runnable {

    public void run() {
        System.out.println("This is the thread InnerMultithread_5 made using the runnable interface  ");
    }

}

class A39_Multithread {
    public static void main(String[] args) {
        thread_1 obj1 = new thread_1();
        thread_2 obj2 = new thread_2();
        thread_3 obj3 = new thread_3();
        thread_4 obj4 = new thread_4();
        thread_5 refr = new thread_5();
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