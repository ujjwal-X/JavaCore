package MultiThreading.ThreadGroup;

public class ThreadGroupMehtods {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        t.setName("Java");
        System.out.println(t.getName());
        t.setPriority(10);
        System.out.println(t.getThreadGroup());
        System.out.println(t.getThreadGroup().getMaxPriority());

        System.out.println(t.getThreadGroup().getParent().getName());
        System.out.println(t.getPriority());
    }
}
