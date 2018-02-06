// ConsoleApplication1.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include <iostream>

class Shape {
public:
    Shape() {
    }

    void Invalid() {
        std::cout << "Shape::Invalid" << std::endl;
        Draw();
    }

private:
    virtual void  Draw() {
        std::cout << "Shape::Draw"<<std::endl;
    }
};

class Circle : public Shape {
public:
    Circle() {
    }

    void Draw() {
        std::cout << "Circle::Draw" << std::endl;
    }

    void Invalid(bool force) {
        std::cout << "Circle::Invalid bool" << std::endl;
    }
};

int main()
{
    Shape &shape = Circle();
    //这里最终会调用Circle::Draw()，也就是说，C++中private成员函数也可以是虚函数，并且有多态性为
    shape.Invalid();
    
    Circle circle;
    //这里会编译错误，也就是说，C++中，父类和子类之间是没有重载的，子类的任何同名函数都会覆盖父类
    //circle.Invalid();

    return 0;
}

