# 设计模式学习笔记
-- head first 设计模式
## demo

- 设计模式1：策略模式
 -- demo：鸭子应用
- 设计模式2：观察者模式
 -- demo：气象观测站
- 设计模式3：装饰者模式
 -- demo：星巴兹咖啡


## 设计原则
- 设计原则1：
 -- 找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起
 -- 
 -- 详解：在观察者模式中，会改变的是主题的状态，以及观察者的数目和类型。用这个模式，可以改变依赖于主题状态的对象，不必改变主题。
 -- 
 - 设计原则2：
 -- 利用多态，针对超类型编程，而非针对实现编程
 --
 -- 详解：主题与观察者都使用接口，观察者利用主题的接口向主题注册，而主题利用观察者接口通知观察者。
 --      这样可以让两者之间正常运作，又同时具有松耦合的优点。
 -- 
 - 设计原则3：
 -- 多用组合，少用继承
 --
 -- 详解：观察者利用“组合”将许多观察者组合进主题中。对象之间的这种关系不是通过继承产生的，而是运行时利用组合的方式产生的。
 -- 
 - 设计原则4：
 -- 为了交互对象之间的松耦合而努力
 --
 -- 详解：在观察者模式中，会改变的是主题的状态，以及观察者的数目和类型。用这个模式，可以改变依赖于主题状态的对象，不必改变主题。
 -- 
 - 设计原则5：
 -- 类应该对扩展开放，对修改关闭
