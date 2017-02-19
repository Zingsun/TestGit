package gitProject;

public class Month {
	public static void main(String[] args) {
		Day day=new Day();
		Thread th=new Thread(day);
		Thread read=new Thread(day);
		Thread thread=new Thread(day);
		//thread.setPriority(Thread.NORM_PRIORITY +5);
		read.start();
		th.start();
		thread.start();
	}
}
