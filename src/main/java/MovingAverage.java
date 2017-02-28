import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
	Queue<Integer> queue;
	
	int winsize=0;
	MovingAverage(int winsize){
		this.winsize = winsize;
		queue = new LinkedList<>();
	}
	
	public static void main(String[] args) {
		MovingAverage m = new MovingAverage(3);
		System.out.println(m.next(10));
		System.out.println(m.next(3));
		System.out.println(m.next(5));
		System.out.println(m.next(7));
	}

	double next(int nr){
		double average = 0;
		double sum =0;
		queue.offer(nr);
		if(queue.size()>winsize) queue.poll();
		for(int i :queue){
			sum+=i;
		}
		
		average = sum/queue.size();
		
		return average;
		
	}
}
