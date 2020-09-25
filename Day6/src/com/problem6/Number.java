package com.problem6;

public class Number implements Runnable{
	int number;
	int temp;
public Number(int number)
{
	this.number = number;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread started");
		for(temp = 0;temp<10;temp++)
		{
			System.out.println(number+" * "+temp+" ="+number*temp);
		}
		System.out.println("Threda ended");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
