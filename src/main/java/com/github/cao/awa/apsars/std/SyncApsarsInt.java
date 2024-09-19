package com.github.cao.awa.apsars.std;

@DoNotRefPrimary
public final class SyncApsarsInt {
    private int delegate;

    public synchronized int delegate() {
        return this.delegate;
    }

    public synchronized int delegate(int updatingValue) {
        this.delegate = updatingValue;
        return this.delegate;
    }

    public boolean isMoreThan(int comparingTarget) {
        return this.delegate > comparingTarget;
    }

    public boolean isMoreThan(long comparingTarget) {
        return this.delegate > comparingTarget;
    }
}