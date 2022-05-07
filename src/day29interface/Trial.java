package day29interface;

public abstract class Trial {
    //we can use variables without initialization in abstract classes
    int num;
    String name;

    public Trial(int num,String name){
        this.num=num;
        this.name=name;
    }
}
