package com.deepak.concurrecny;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
/*
 * Demonstrates the usage java.util.PriorityBlockingQueue
 */
public class TestPriorityBlockingQueue {
	
	public static void main(String[] args) {
		PriorityBlockingQueue<Element> queue = new PriorityBlockingQueue<Element>(11,new ElementComparator());
		queue.add(new Element("e"));
		queue.add(new Element("d"));
		queue.add(new Element("c"));
		queue.add(new Element("b"));
		queue.add(new Element("a"));
		int size = queue.size();
		for(int i=0;i<size;i++) {
			System.out.println(queue.poll().getName());
		}
	}
}

class ElementComparator implements Comparator<Element> {

	@Override
	public int compare(Element o1, Element o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}