package com.sjms.bridge;

public abstract class Bridge {
    private Sourceable source;

    public void method(){
        System.out.println("这是在Bridge中打印的。。。source.method()方法前");
        source.method();
        System.out.println("这是Bridge中打印的。。。 source.method()方法后");
    }


    public void setSource(Sourceable source) {
        this.source = source;
    }

    public Sourceable getSource() {
        return source;
    }
}
