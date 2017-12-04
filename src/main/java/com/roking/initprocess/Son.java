package com.roking.initprocess;

/**
 * Title:</br>
 * <p/>
 * Description:  很容易迷惑的一段代码，
 *  java在初始化类时 会优先初始化父类，
 *  调用父类的构造方法时，会调用子类中重写的processWhenInit方法，
 *  这时子类中的成员变量str1 尚未被分配内存空间，所以str1为null
 *  调用子类方法processWhenInit 对str1 进行赋值“son processWhenInit str1”
 *  这时再对子类进行初始化，将子类的成员变量str1 进行赋值："this is son str1" 所以str1 打印出来是 "this is son str1"
 *
 *  str2 作为静态变量，在类加载时，就进行了初始化，所以首先 str2 被赋值"this is son str2"
 *  再进行上述父类初始化 将str2的值更新为："son processWhenInit str2 "
 *
 *  </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/12/4.
 */
public class Son extends Father{
    public String str1="this is son str1";
    public static String str2="this is son str2";

    @Override
    void processWhenInit() {
        str1="son processWhenInit str1 ";
        str2="son processWhenInit str2 ";
    }

    public static void main(String[] args) {
        Son son=new Son();
        System.out.println(son.str1);
        System.out.println(str2);
    }
}
