package com.ligangit.design.patterns.state;

/**
 * 状态模式
 * @author ligang
 * @date 2024/4/29
 */
public class StatePatternClient {
    public static void main(String[] args) {
        // 创建环境
        Context context = new Context();
        // 处理请求
        context.handle();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}

/**
 * 环境类
 * @author ligang
 * @date 2024/4/29
 */
class Context {
    private State state;

    /**
     * 定义环境类的初始状态
     */
    public Context() {
        this.state = new ConcreteStateA();
    }

    /**
     * 读取状态
     * @return
     */
    public State getState() {
        return state;
    }

    /**
     * 设置新状态
     * @param state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * 对请求做处理
     */
    public void handle() {
        state.handle(this);
    }
}

/**
 * 抽象状态类
 * @author ligang
 * @date 2024/4/29
 */
abstract class State{
    public abstract void handle(Context context);
}

/**
 * 具体状态A类
 * @author ligang
 * @date 2024/4/29
 */
class ConcreteStateA extends State{


    @Override
    public void handle(Context context) {
        System.out.println("当前状态是A.");
        context.setState(new ConcreteStateB());
    }
}

/**
 * 具体状态B类
 * @author ligang
 * @date 2024/4/29
 */
class ConcreteStateB extends State{


    @Override
    public void handle(Context context) {
        System.out.println("当前状态是B.");
        context.setState(new ConcreteStateA());
    }
}