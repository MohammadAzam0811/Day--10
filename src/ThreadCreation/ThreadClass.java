package ThreadCreation;

class ThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running using Thread class");
    }

    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass();
        t1.start();
    }
}
