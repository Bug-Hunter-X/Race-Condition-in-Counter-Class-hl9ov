public class Counter {
    private int count = 0; // Race condition: multiple threads can access and modify count concurrently

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}