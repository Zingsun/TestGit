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
					System.out.println("��"+Thread.currentThread().getName()+"����վ��������"+(101-tikets)+"�ų�Ʊ");
					--tikets;
					
				}else{
					break;
				}
			}
		}
		
	}
	
}
