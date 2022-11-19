class thread_1 extends Thread {

    public void run() {
        System.out.println("This is the thread_1 ");
    }
}

class thread_2 extends Thread {

    public void run() {
        System.out.println("This is the thread_2 ");
    }
}

class thread_3 extends Thread {

    public void run() {
        System.out.println("This is the thread_3 ");
    }
}

class thread_4 extends Thread {

    public void run() {
        System.out.println("This is the thread_4 ");
    }
}

class thread_5 implements Runnable {

    public void run() {
        System.out.println("This is the thread_5 made using the runnable interface  ");
    }

}

class A39_Multithread {
    public static void main(String[] args) throws InterruptedException {
        thread_1 obj1 = new thread_1();
        thread_2 obj2 = new thread_2();
        thread_3 obj3 = new thread_3();
        thread_4 obj4 = new thread_4();
        thread_5 refr = new thread_5();
        Thread obj5 = new Thread(refr);
        obj1.setPriority(1);
        obj2.setPriority(2);
        obj3.setPriority(3);
        obj4.setPriority(4);
        obj5.setPriority(5);
        obj1.start();
        obj2.start();
        Thread.sleep(1000);
        obj3.start();
        Thread.sleep(1000);
        obj5.start();
        Thread.sleep(1000);
        obj4.start();
    }
}