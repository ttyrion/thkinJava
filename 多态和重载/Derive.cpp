// ConsoleApplication1.cpp : �������̨Ӧ�ó������ڵ㡣
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
    //�������ջ����Circle::Draw()��Ҳ����˵��C++��private��Ա����Ҳ�������麯���������ж�̬��Ϊ
    shape.Invalid();
    
    Circle circle;
    //�����������Ҳ����˵��C++�У����������֮����û�����صģ�������κ�ͬ���������Ḳ�Ǹ���
    //circle.Invalid();

    return 0;
}

