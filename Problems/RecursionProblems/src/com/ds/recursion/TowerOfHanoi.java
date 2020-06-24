package com.ds.recursion;

public class TowerOfHanoi {

	public static void towerOfHanoi(int n, char s, char h, char d) {
		if(n == 1)
		{
			System.out.println("Move 1st Disk from  " +s +" to "+ d);
			return;
		}
        if(n == 0)
            return;
		towerOfHanoi(n-1, s, d, h);
		System.out.println("Move "+ n + "th disk from  " + s + " to " + d);
		towerOfHanoi(n-1, h, s, d);

		
	}
		
	public static void main(String[] args) {
		
		towerOfHanoi(3, 's', 'h', 'd');

	}

}
