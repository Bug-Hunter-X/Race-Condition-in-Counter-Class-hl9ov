public class CounterFixed {
    private int count = 0; // Use synchronized methods to ensure thread safety

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}