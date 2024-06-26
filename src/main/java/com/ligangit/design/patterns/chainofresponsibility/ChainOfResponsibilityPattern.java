package com.ligangit.design.patterns.chainofresponsibility;

/**
 * 责任链模式
 * @author ligang
 * @date 2024/4/29
 */
public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        // 组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        // 提交请求
        handler1.handleRequest("two");
    }
}

/**
 * 抽象处理者角色
 * @author ligang
 * @date 2024/4/29
 */
abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    /**
     * 处理请求的方法
     *
     * @param request
     */
    public abstract void handleRequest(String request);

}

/**
 * 具体处理者角色1
 * @author ligang
 * @date 2024/4/29
 */
class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("one")) {
            System.out.println("具体处理者1负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}

/**
 * 具体处理者角色2
 * @author ligang
 * @date 2024/4/29
 */
class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("two")) {
            System.out.println("具体处理者2负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}