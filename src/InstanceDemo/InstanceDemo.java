package InstanceDemo;

public class InstanceDemo {
    int a = 10;
    int b = 20;
    public void demo(){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        InstanceDemo obj = new InstanceDemo();
        obj.demo();
        }
    }

