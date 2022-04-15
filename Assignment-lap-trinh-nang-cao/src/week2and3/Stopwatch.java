package week2and3;

import java.util.Scanner;

public class Stopwatch {
	
	private long startTime;
	private long endTime;
	
	public Stopwatch() {
		this.startTime = System.currentTimeMillis();
	}
	
	public long getStartTime() {
		return startTime;
	}


	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}


	public long getEndTime() {
		return endTime;
	}


	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public void start() {
		this.startTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime() {
		return this.endTime - this.startTime;
	}
	
	public void end() {
		this.endTime = System.currentTimeMillis();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stopwatch stopWatch = new Stopwatch();
		System.out.println("Enter 1 to start: ");
		sc.nextInt();
		stopWatch.start();
		System.out.println(stopWatch.getStartTime());
		System.out.println("....");
		System.out.println("Enter 2 to end: ");
		sc.nextInt();
		stopWatch.end();
		System.out.println(stopWatch.getEndTime());

		System.out.println("Elapsed time is: " + stopWatch.getElapsedTime() + "ms");
	}
	
}
