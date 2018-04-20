/**
 * 
 */
package com.gmg.clone;

/** 
* @ClassName: CloneTest3 
* @Description: TODO
* @author gmg 
* @date 2017年9月21日 下午1:27:29  
*/

public class CloneTest3
{
    public static void main(String[] args) throws Exception
    {
        Teacher1 teacher = new Teacher1();
        teacher.setName("Teacher Zhang");
        teacher.setAge(40);

        Student3 student1 = new Student3();
        student1.setName("ZhangSan");
        student1.setAge(20);
        student1.setTeacher(teacher);

        Student3 student2 = (Student3) student1.clone();
        System.out.println("拷贝得到的信息");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getTeacher().getName());
        System.out.println(student2.getTeacher().getAge());
        System.out.println("-------------");

        // 修改老师的信息
        teacher.setName("Teacher Zhang has changed");
        System.out.println(student1.getTeacher().getName());
        System.out.println(student2.getTeacher().getName());

        // 两个引用student1和student2指向不同的两个对象
        // 但是两个引用student1和student2中的两个teacher引用指向的是同一个对象
        // 所以说明是浅拷贝

        // 改为深复制之后，对teacher对象的修改只能影响第一个对象
    }
}

class Teacher1 implements Cloneable
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
        return super.clone();
    }

}

class Student3 implements Cloneable
{
    private String name;
    private int age;
    private Teacher1 teacher;

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

    public Teacher1 getTeacher()
    {
        return teacher;
    }

    public void setTeacher(Teacher1 teacher)
    {
        this.teacher = teacher;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        // 浅复制时：
        // Object object = super.clone();
        // return object;

        // 改为深复制：
        Student3 student = (Student3) super.clone();
        // 本来是浅复制，现在将Teacher对象复制一份并重新set进来
        student.setTeacher((Teacher1) student.getTeacher().clone());
        return student;
    }

}