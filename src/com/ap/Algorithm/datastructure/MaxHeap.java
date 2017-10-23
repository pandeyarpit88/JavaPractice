package com.ap.Algorithm.datastructure;

/**
 * Created by apandey on 27-04-2017.
 */
public class MaxHeap {
	private int[] heap;
	private int size;
	private int maxSize;

	private static final int FRONT = 1;

	public MaxHeap(int maxSize) {
		this.size = 0;
		this.maxSize = maxSize;
		this.heap = new int[maxSize + 1];
		heap[0] = Integer.MAX_VALUE;
	}

	private int parent(int pos) {
		return pos/2;
	}

	private int leftChild(int pos) {
		return pos*2;
	}

	private int rightChild(int pos) {
		return (pos * 2) +1;
	}

	private void swap(int fpos, int spos) {
		int temp = heap[fpos];
		heap[fpos] = heap[spos];
		heap[spos] = temp;
	}

	private boolean isLeaf(int pos) {
		if((pos >= size/2) && pos <= size ) {
			return true;
		}
		return false;
	}

	public void maxHeapify(int pos) {
		
	}
}
