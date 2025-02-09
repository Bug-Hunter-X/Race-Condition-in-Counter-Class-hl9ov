# Java Race Condition Example

This repository demonstrates a classic race condition bug in Java. The `Counter` class is designed to increment a counter, but without proper synchronization, multiple threads can access and modify the `count` variable concurrently, leading to incorrect results. The `CounterFixed` class provides a corrected version that uses synchronization to prevent the race condition.

## How to Run

1. Clone this repository.
2. Compile both Counter.java and CounterFixed.java using a Java compiler (like javac).
3. Run the main method in each class to observe the effects of the race condition and its fix. Note that the output will vary depending on the system and the timing of the threads.