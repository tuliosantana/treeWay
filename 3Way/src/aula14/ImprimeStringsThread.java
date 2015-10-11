package aula14;

public class ImprimeStringsThread implements Runnable{
	
	Thread thread;
	
	String str1, str2;
	
	public ImprimeStringsThread( String str1, String str2) {
		
		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this);
		thread.start();
	}
	
	public void run(){
		DuasStrings.print(str1, str2);
	}
}
