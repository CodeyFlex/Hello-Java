package Sololearn.InterfaceThread;

class InterfaceThread {
    public static void main(String[] args) {
        Thread t = new Thread(new Loader());
        t.start();
    }
}
