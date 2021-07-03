package com.srm.generics;

import java.util.ArrayList;

class Queue<K>
{
    int front = -1, rear = -1;
    ArrayList<K> al = new ArrayList<>();
    K front()
    {
        if (front == -1)
 
            return null;
        return al.get(front);
    }

    K rear()
    {
        if (rear == -1)
            return null;
        return al.get(rear);
    }
    void enqueue(K X)
    {
        if (this.empty()) {
            front = 0;
            rear = 0;
            al.add(X);
        }
        else {
            front++;
            if (al.size() > front) {
                al.set(front, X);
            }
            else
                al.add(X);
        }
    }
    void dequeue()
    {
        if (this.empty())
            System.out.println("Queue is already empty");
        else if (front == rear) {

            front = rear = -1;
        }
        else {
            rear++;
        }
    }
    boolean empty()
    {
        if (front == -1 && rear == -1)
            return true;
        return false;
    }
 
    // @Override
    public String toString()
    {
        if (this.empty())
            return "";
 
        String result = "";
 
        for (int i = rear; i < front; i++) {
            result += String.valueOf(al.get(i)) + "->";
        }
 
        result += String.valueOf(al.get(front));
 
        return result;
    }

}
public class QueueGeneric {

	public static void main(String[] args) {
		Queue<Integer> q1 = new Queue<>();
        q1.enqueue(5);
        q1.enqueue(10);
        q1.enqueue(15);
        System.out.println(
            "q1 after enqueue of 3 elements:\n" + q1);
        q1.dequeue();
        System.out.println("q1 after dequeue :\n" + q1);

	}

}
