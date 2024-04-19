package com.ligangit.design.patterns.proxy;
/**
 * 代理模式
 * @apiNote 增加代码冗余，增加复杂度，代码类的数据也增加了，加了代理之后请求速度肯定会变慢，所以具体是否需要使用代理模式需要权衡
 * @author ligang
 * @date 2024/4/19
 */
public class Proxy {

    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject();
        proxySubject.request();
    }

}

interface Subject{
    void request();
}

class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("访问真实主题方法。。。。。");
    }
}

class ProxySubject implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest() {
        System.out.println("访问真实主题之前的预处理。。。。。");
    }
    public void postRequest() {
        System.out.println("访问真实主题之后的后续处理。。。。。");
    }
}