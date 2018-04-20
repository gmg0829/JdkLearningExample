/**
 * 
 */
package com.gmg.clone;

/** 
* @ClassName: CloneDemo 
* @Description: TODO
* @author gmg 
* @date 2017年9月21日 下午1:21:54  
*/
public class CloneTest1
{

    public static void main(String[] args) throws CloneNotSupportedException
    {
        Student student1 = new Student();
        student1.setName("ZhangSan");
        student1.setAge(20);

        Student student2 = new Student();
        student2 = (Student) student1.clone();

        System.out.println("拷贝得到的信息");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println("-------------");

        // 修改第二个对象的信息
        student2.setName("LiSi");
        student2.setAge(25);

        System.out.println("修改第二个对象的属性为lisi,25后：");
        System.out.println("第一个对象：");
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println("第二个对象：");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println("-------------");
        
        // 说明两个引用student1和student2指向的是不同的对象

    }
}

class Student implements Cloneable
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        // 注意此处要把protected改为public

        Object object = super.clone();

        return object;
    }
}