/*
 * 模式一：策略模式（Strategy Pattern）
 * 策略模式定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。
 * 
 * 设计原则1：找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起
 * 设计原则2：利用多态，针对超类型编程，而非针对实现编程
 * 设计原则3：多用组合，少用继承
 *
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

/*
* 借由继承，可实现代码复用，节约开发时间
* 我们总是要花许多时间在系统的维护和变化上，比开发花的时间更多
* 应该致力于提高可维护性和可扩展性的复用程度
* */