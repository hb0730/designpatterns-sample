# 单例模式
## 一 定义
   单例模式(Singleton Pattern)：单例模式确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例，这个类称为单例类，它提供全局访问的方法。
   
   单例模式的要点有三个：一是某个类只能有一个实例；二是它必须自行创建这个实例；三是它必须自行向整个系统提供这个实例。单例模式是一种对象创建型模式。单例模式又名单件模式或单态模式。

## 二 实现
**在java语言中，通常有两种方式构建:**
1. **饿汉式**: 指全局的单例实例在类装载时创建
    + [Singleton1](https://github.com/hb0730/designpatterns-sample/tree/master/singleton/src/main/java/com/hb0730/design/patterns/singleton)
2. **懒汉式**: 指全局的单例实例在第一次使用时创建
    + [Singleton2](https://github.com/hb0730/designpatterns-sample/tree/master/singleton/src/main/java/com/hb0730/design/patterns/singleton)
    + [Singleton3](https://github.com/hb0730/designpatterns-sample/tree/master/singleton/src/main/java/com/hb0730/design/patterns/singleton)
3. **枚举类型**
    + [EnumSingleton](https://github.com/hb0730/designpatterns-sample/tree/master/singleton/src/main/java/com/hb0730/design/patterns/singleton)
## jdk应用
 + RunTime
 + NumberFormat
