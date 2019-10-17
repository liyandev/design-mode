/*
 * 利用多态，针对超类型编程
 * */

interface FlyBehavior{
    public void fly();

}

class FlyWithWings implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("fly with wings");
    }
}

class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly no way");
    }
}

interface QuackBehavior{
    public void quack();
}

class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack");
    }
}

class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}

class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("mutequack");
    }
}


abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb ;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void peformQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("all ducks float, even decoys");
    }

    public abstract void display();

    public void peformFly(){
        flyBehavior.fly();
    }

}

class MallarDuck extends Duck {
    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("i'm a real mullard duck");
    }
}

class MuteDuck extends Duck {
    public MuteDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    public void display(){
        System.out.println("i'm muteduck");
    }
}

public class Main{
    public static void main(String[] args) {
        Duck m = new MallarDuck();
        m.display();
        m.peformQuack();
        m.peformFly();

        Duck t = new MuteDuck();
        t.display();
        t.peformQuack();
        t.peformFly();
        System.out.println("now i'm changing fly way ~");
        t.setFlyBehavior(new FlyWithWings());
        t.peformFly();
        System.out.println("now i'm changing quack way ~");
        t.setQuackBehavior(new Squeak());
        t.peformQuack();
    }
}