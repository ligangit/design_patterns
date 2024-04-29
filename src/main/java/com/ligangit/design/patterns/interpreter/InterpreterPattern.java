package com.ligangit.design.patterns.interpreter;

/**
 * 解释器模式
 *
 * @author ligang
 * @date 2024/4/29
 */
public class InterpreterPattern {
    public static void main(String[] args) {

    }
}

/**
 * 抽象表达式类
 *
 * @author ligang
 * @date 2024/4/29
 */
interface AbstractExpression {

    /**
     * 解释方法
     * @param info
     */
    void interpret(String info);

}

/**
 * 终结符表达式类
 * @author ligang
 * @date 2024/4/29
 */
class TirminalExpression implements AbstractExpression {

    @Override
    public void interpret(String info) {
        // 对终结符表达式的处理
    }
}

/**
 * 非终结符表达式类
 * @author ligang
 * @date 2024/4/29
 */
class NonTirminalExpression implements AbstractExpression {

    private AbstractExpression exp1;
    private AbstractExpression exp2;

    @Override
    public void interpret(String info) {
        // 对非终结符表达式的处理
    }
}

/**
 * 环境类
 * @author ligang
 * @date 2024/4/29
 */
class Context {
    public Context() {
        // 数据初始化
    }

    public void operation(String info) {
        // 调用相关表达式类的解释方法
    }
}
