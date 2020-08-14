package org.augustus.design.strategy;

public abstract class Duck {

    protected FlyStrategy flyStrategy;

    protected RunStrategy runStrategy;

    public Duck(FlyStrategy flyStrategy, RunStrategy runStrategy) {
        this.flyStrategy = flyStrategy;
        this.runStrategy = runStrategy;
    }

    protected void fly() {
        flyStrategy.fly();
    }

    protected void run() {
        runStrategy.run();
    }

    public Duck setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
        return this;
    }

    public Duck setRunStrategy(RunStrategy runStrategy) {
        this.runStrategy = runStrategy;
        return this;
    }
}
