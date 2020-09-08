package com.training;

public class Factorial {
	long calc(int n) {
		if(n<0) return 0;
		if(n==0 || n==1) return 1;
		long r=1;
		for(int i=n;i>=2;i--) r*=i;
		return r;
	}
}
