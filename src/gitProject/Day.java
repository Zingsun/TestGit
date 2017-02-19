package gitProject;

public class Day implements Runnable{
	public static int tikets=100;
	String key=new String("key");
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized(key){
				if(tikets>0){
					System.out.println("第"+Thread.currentThread().getName()+"个车站这在卖第"+(101-tikets)+"张车票");
					--tikets;
					
				}else{
					break;
				}
			}
		}
		
	}
	
}
