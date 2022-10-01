package t10.task2;

import task2.Chair;

public class VictorianChair implements Chair {
    int age;

    public int getAge(){
        return age;
    }

    VictorianChair(int age){
        this.age = age;
    }
}
