# 简单工厂
## 定义
   简单工厂模式(Simple Factory Pattern)：又称为静态工厂方法(Static Factory Method)模式，它属于类创建型模式。在简单工厂模式中，可以根据参数的不同返回不同类的实例。简单工厂模式专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。
## 实例
   创建一个可以绘制不同形状的绘图工具，可以绘制圆形，正方形，三角形，每个图形都会有一个draw()方法用于绘图.
   + `rectangle`
   + `circle`
   + `triangle` 每个类都有各自的`draw()`方法，当需要画某种图形的时候就可以
   测试test:
   ```java
// 画矩形时：
Rectangle r = new Rectangle();
r.draw();
// 画圆形时：
Circle c = new Circle();
c.draw();
// 画三角形时：
Triangle t = new Triangle();
t.draw();
```
## 适合场景
   + 需要创建的对象较少。
   + 客户端不关心对象的创建过程。
## jdk应用
   + java.text.DateFormat
   + KeyGenerator.getInstance("DESede");
