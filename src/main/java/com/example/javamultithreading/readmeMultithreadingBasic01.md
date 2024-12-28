https://engineeringdigest.medium.com/multithreading-in-java-39f34724bbf6

Basic

Cpu --brain of the computer
Core --A core is an individual processing unit within a cpu
modern cpu have multiple cores,allowing them to perform multiple task simultaneously

example--Quad core processor-- it has 4 cores, allowing it to perform four task simultaneously

Program-- set of instructions
Process-- process is an instance of the program that is being executed. when a program runs,the operating system
creates a process to manage its execution..when we open msWord it becomes a process in the OS.

Thread-- A thread is the smallest unit of execution within a process.A process can have multiple threads
which share the same resource but can run independently.

Multitasking --Multitasking allows an operating system to run multiple processes simultaneously.On single-core CPUs
this is done through time-sharing rapidly switching between tasks.On multi core cpu,true parallel execution occurs,
with task distributed across the cores.The OS scheduler balances the load,ensuring efficient and responsive
system performance.
example-- we are browsing the internet while listening to music and downloading the file.
Multitasking can be achieved through multithreading where each task is divided into threads that are managed
concurrently.
Multitasking operates at the level of processes,which are the operating system's primary units of execution.

Multitasking involves managing resources between completely operate programs which may have independent
memory spaces and system resources.

MultiThreading-- Multithreading refers to the ability to execute multiple threads within a single process concurrently.
example-A web browser can use multithreading by having separate threads for rendering the page.

multithreading enhances the efficiency of multitasking by breaking down individual task into smaller subtask or threads.
These threads can be processed simultaneously,making better use of the CPU's capabilities.
multithreading operates at the level of threads,which are smaller units within a process.
multithreading involves managing resources within a single program,where threads share same memory and resources.

multitasking --run multiple process
multithreading-- run multiple threads

In single core system both threads and processes are managed by the OS Scheduler through time slicing and context
switching to create an illusion of simultaneous execution.

In Multi core system both threads and processes can run in true parallel on different cores,with the OS scheduler
distributing tasks across the cores to optimize performance.

Time Slicing:
Definition: Time slicing divides the cpu time into small intervals called time slices or quanta.
Function: The OS Scheduler allocates this time slices to different processes threads, ensuring each gets the fair share
of CPU time.
Purpose:This prevents any single process or thread from monopolizing the CPU,improving responsiveness and enabling
concurrent execution.

Context Switching:
Definition:Context switching is the process of saving the state of a currently running process or thread and loading
the state of the next one to be executed.
function:when a process or thread's time slice expires the OS scheduler performs a context switch to move the CPU's
focus to another process or thread.
Purpose:This allows multiple processes and threads to share the CPU giving the appearance of simultaneously execution
in a single core cpu or improving parallelism on multi core CPUs.

Multitasking:Multitasking can be achieved through multithreading where each task is divided into threads that are
managed concurrently.
while multitasking typically refers to the running of multiple applications,multithreading is more granular
dealing with multiple threads withing the same application or the process.

Java MultiThreading
In Java multithreading is the concurrent execution of two or more threads to maximize the utilization of the CPU.
Java multithreading capabilities are the part of the java.lang.package,making it easy to implement concurrent execution

********************************************** Thread ************************************************************

Thread--A thread is a lightweight process,the smallest unit of processing.Java supports multithreading through its
java.lang.Thread class and the java.lang.runnable interface.

When a Java program starts,one thread begins running immediately,which is called the main thread.
this thread is responsible for executing the main method of the program.

To create a new thread in java you can either extend the thread class or implement the runnable interface

To Create a new thread in java,you can either extend the Thread class or implement the runnable interface

When you extend a Thread class the RUN method is overridden to define the code that constitutes the new thread
start method is called to initiate the new thread.

When you implement Runnable interface the run method is overridden to define the code constitutes the new thread.
the thread object is created by passing an instance of MyRunnable.
Start method is called on the thread object to initiate the new thread.

********************************************** Thread LifeCycle ********************************************************
The lifecycle of a thread in java consists of several states,which a thread can move through during its execution.
New,Runnable,Running,Blocked/Waiting and Terminated.

New-- A thread is in this state when it is created but not yet started.
Runnable-- After the start method is called the thread becomes runnable.its ready to run and is waiting for CPU time.
Running-- The thread is in this state when it is executing
Blocked/Waiting--A thread is in this state when it is waiting for a resource or for another thread to perform an action
Terminated--A Thread is in this state when it has finished executing.

Threads Methods(start,run,sleep,join,setPriority,interrupt,Yield,setDaemon)
start()-- it is used to start the thread
run()--To run in separate thread..this is a overridden method of thread class
sleep()--current thread is suspended for a specific period.
join()--The join() method in Java's Thread class is used to ensure that one thread waits for the completion of another.
When you call join() on a thread, the current thread pauses its execution until the target thread (the one on which
join() is called) finishes its execution.
Here's an example to demonstrate how the join() method works:

class Task implements Runnable {
private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " started.");
        try {
            Thread.sleep(2000); // Simulate work with a delay
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
        }
        System.out.println(name + " finished.");
    }

}

public class JoinExample {
public static void main(String[] args) {
Thread thread1 = new Thread(new Task("Thread 1"));
Thread thread2 = new Thread(new Task("Thread 2"));

        thread1.start(); // Start Thread 1
        thread2.start(); // Start Thread 2

        try {
            thread1.join(); // Main thread waits for Thread 1 to finish
            System.out.println("Main thread waited for Thread 1.");
            thread2.join(); // Main thread waits for Thread 2 to finish
            System.out.println("Main thread waited for Thread 2.");
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("All threads have finished. Main thread resumes.");
    }

}

Output//
Thread 1 started.
Thread 2 started.
Thread 1 finished.
Main thread waited for Thread 1.
Thread 2 finished.
Main thread waited for Thread 2.
All threads have finished. Main thread resumes.

Explanation:
thread1.start() and thread2.start(): These calls start the two threads. They run concurrently.
thread1.join(): The main thread pauses here until thread1 completes its execution.
thread2.join(): After thread1 finishes and the main thread resumes, it waits for thread2 to finish.
Completion: Once both threads have completed, the main thread continues with the rest of the code.

Key Points:
If you don't call join(), the main thread and other threads will run independently, potentially completing in an
unpredictable order.
You can call join() with a timeout, e.g., thread1.join(1000), to wait for a specific duration instead of indefinitely.
The join() method is particularly useful when thread execution order is important or when you need to wait for a
thread's results before proceeding.

Que..Give me the output if i do not use join?

If you do not use the join() method, the threads will run concurrently with the main thread.
The output order will be unpredictable because thread scheduling is managed by the Java Virtual Machine (JVM), and it
may vary with each run.
Here’s the same example without the join() calls:

Code Example Without join():
class Task implements Runnable {
private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " started.");
        try {
            Thread.sleep(2000); // Simulate work with a delay
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
        }
        System.out.println(name + " finished.");
    }

}

public class WithoutJoinExample {
public static void main(String[] args) {
Thread thread1 = new Thread(new Task("Thread 1"));
Thread thread2 = new Thread(new Task("Thread 2"));

        thread1.start(); // Start Thread 1
        thread2.start(); // Start Thread 2

        System.out.println("Main thread does not wait for other threads.");
        System.out.println("Main thread continues execution.");
    }

}

output
Thread 1 started.
Thread 2 started.
Main thread does not wait for other threads.
Main thread continues execution.
Thread 1 finished.
Thread 2 finished.

Explanation:
Thread Scheduling: thread1 and thread2 start, but they execute independently of the main thread.
Main Thread: The main thread does not wait for the other threads to complete and continues executing its own code
immediately.
Unpredictable Order: The actual order of Thread 1 finished. and Thread 2 finished. in the output may vary because the
threads are running concurrently.

Key Difference:
Without join(), the main thread doesn't wait for the other threads to complete. As a result:

The main thread may finish its execution before the other threads.
The output order becomes non-deterministic for the background threads (thread1 and thread2).

Que.But in this scenario thread 2 can finish its task first than thread1 right?
Ans..
Yes, in this scenario, Thread 2 can finish its task before Thread 1, even though thread1 was started first. This happens
because thread execution order is not guaranteed in Java. The JVM's thread scheduler determines which thread gets CPU
time, and this can vary between runs due to factors like:

Operating System Scheduling: The OS manages threads based on its internal scheduling policies, which consider priority,
load, and available resources.
Thread Priority: Java threads have priorities, but these are hints to the scheduler, not guarantees.
Concurrent Execution: Threads run independently, and their completion depends on how much CPU time they receive.

Example Output Without join() (Possible Order):
Thread 1 started.
Thread 2 started.
Main thread does not wait for other threads.
Main thread continues execution.
Thread 2 finished.
Thread 1 finished.

Why Might Thread 2 Finish Before Thread 1?
Even though thread1 is started before thread2, the following can occur:

Thread 2 gets CPU time earlier: The scheduler might allocate more resources to thread2 for some reason.
Thread Preemption: If thread1 is preempted (paused) by the scheduler for a higher-priority task, thread2 might finish
first.
Equal Priority: Since both threads are likely created with the same priority (default is Thread.NORM_PRIORITY), their
execution order is largely up to the scheduler.

In summary, without explicit synchronization (like join()), you can't predict which thread will finish first.
This behavior highlights the importance of join() if the order of thread execution matters in your program.

//SetDaemon
The setDaemon() method in Java is used to mark a thread as a daemon thread or a user thread.
Daemon threads are background threads that do not prevent the JVM from exiting when all user threads have finished
execution.

//Synchronization
jb ek object share kiya jata hai toh incorrect result aate hai...kyu aate hai incorrect result..kyu ki common data share
hora hai threads concurrently run hore hai toh result unpredictable aare hai...when we are not using Synchronization
then this is called as
Race Condition..jb multiple thread ek shared resource pe kaam kr raha ho our unki timing ulti sidhi ho jaye to
result bhi ulta sidha aa jayenga usi ko bolte hai race condition....
hmm ye race condition ko bacha sakte hai using sycronization keyword

In Java, synchronized functions and synchronized blocks are mechanisms that allow threads to access shared resources in
a thread-safe manner.
These are part of Java's concurrency framework, ensuring that only one thread can execute a synchronized piece of code
at a time for a given object or class.

//Locks
There are two types of locks
1.Intrinsic --These are build into every object in java.you don't see them,but they are there when you use synchronized
keyword you are using this automatic locks.

2.Explicit -- These are more advanced locks you can control yourself using the lock class from java.util.concurrent.locks
you explicitly say when to lock and unlock,giving you more control over how and when people can write in the notebook.

Lock is an interface
methods of the lock -- lock.lock(),lock.trylock(),lock.unlock()























