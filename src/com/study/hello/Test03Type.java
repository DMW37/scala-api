package com.study.hello;

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
public class Test03Type {
    public static void main(String[] args) {
        /**
         * Byte 8 位带符号整数
         * Short 16 位带符号整数
         * Int 32 位带符号整数
         * Long 64 位带符号整数
         * Char 16 位无符号 Unicode 字符
         * String Char 类型的序列（字符串）
         * Float 32 位单精度浮点数
         * Double 64 位双精度浮点数
         * Boolean 1 位，true 或 false
         */

        /**
         * Any 所有类型的父类，它有两个子类 AnyVal 与 AnyRef。
         * AnyVal 所有数值类型的父类。
         * AnyRef 所有引用类型的父类。
         * Unit 表示空，Unit 是 AnyVal 的子类，它只有一个实例 () ，类似于 Java 的 void。
         * Null
         * AnyRef 的子类，所有引用类型的子类，它的实例是 null ，可以将 null 赋值给任何引用类型。Null 并不能
         * 实例化，只是用来处理异常和错误的。
         * Option
         * 平时不建议使用 Null 而是改用 Option，在一些方法中最后要返回一个值，但这个返回值有时为空，有时不
         * 为空，就可以将这个返回值类型设置为 Option。Option 中有 Some 子类用来封装有值的返回；用 None 来
         * 处理没有值的返回。Option 属于 Scala 的引用类型。
         * Nothing
         * 所有类型的子类，不能直接创建该类型实例，一般配合异常使用。某个方法抛出异常时，返回的就是
         * Nothing 类型，因为 Nothing 是所有类的子类，那么它可以赋值为任何类型。
         */
    }
}
