package com.xjtu.cp;
public class Fibonacci {
   public static void main(String[] args) {
       //在main函数用循环打印1~200的Fibonacci数列
        for(int i=1;i<=200;i++){
            System.out.println("Fibonacci.f("+i+")=="+Fibonacci.of(i));
        }
    }

    //递归实现斐波那契数列
    //f(1)=1,f(2)=1
   // f(n) = f(n-1)+f(n-2)
    public static int of(int i){
        if(i==1||i==2){
            return 1;
        }
        else{
            return of(i-1)+of(i-2);
        }
    }

    
}