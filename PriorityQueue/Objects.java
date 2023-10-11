package PriorityQueue;

import java.util.PriorityQueue;

public class Objects {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>();

        queue.add(new Student("Neet1", 1));
        queue.add(new Student("Other1000", 1000));
        queue.add(new Student("Other12", 12));
        queue.add(new Student("Other50", 50));

        while(!queue.isEmpty()){
            System.out.println(queue.remove().name);
        }
    }
}
