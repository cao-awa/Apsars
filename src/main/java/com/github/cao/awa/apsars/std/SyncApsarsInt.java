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

    public boolean isMoreThan(short comparingTarget) {
        return this.delegate > comparingTarget;
    }

    public boolean isMoreThan(int comparingTarget) {
        return this.delegate > comparingTarget;
    }

    public boolean isMoreThan(long comparingTarget) {
        return this.delegate > comparingTarget;
    }

    public boolean isMoreThan(float comparingTarget) {
        return this.delegate > comparingTarget;
    }

    public boolean isMoreThan(double comparingTarget) {
        return this.delegate > comparingTarget;
    }

    public boolean isMoreThan(byte comparingTarget) {
        return this.delegate > comparingTarget;
    }

    public boolean isMoreThan(char comparingTarget) {
        return this.delegate > comparingTarget;
    }

    public boolean isMoreThan(boolean comparingTarget) {
        return false;
    }

    public boolean isLessThan(short comparingTarget) {
        return this.delegate < comparingTarget;
    }

    public boolean isLessThan(int comparingTarget) {
        return this.delegate < comparingTarget;
    }

    public boolean isLessThan(long comparingTarget) {
        return this.delegate < comparingTarget;
    }

    public boolean isLessThan(float comparingTarget) {
        return this.delegate < comparingTarget;
    }

    public boolean isLessThan(double comparingTarget) {
        return this.delegate < comparingTarget;
    }

    public boolean isLessThan(byte comparingTarget) {
        return this.delegate < comparingTarget;
    }

    public boolean isLessThan(char comparingTarget) {
        return this.delegate < comparingTarget;
    }

    public boolean isLessThan(boolean comparingTarget) {
        return false;
    }

    public boolean isEquals(short comparingTarget) {
        return this.delegate == comparingTarget;
    }

    public boolean isEquals(int comparingTarget) {
        return this.delegate == comparingTarget;
    }

    public boolean isEquals(long comparingTarget) {
        return this.delegate == comparingTarget;
    }

    public boolean isEquals(float comparingTarget) {
        return this.delegate == comparingTarget;
    }

    public boolean isEquals(double comparingTarget) {
        return this.delegate == comparingTarget;
    }

    public boolean isEquals(byte comparingTarget) {
        return this.delegate == comparingTarget;
    }

    public boolean isEquals(char comparingTarget) {
        return this.delegate == comparingTarget;
    }

    public boolean isEquals(boolean comparingTarget) {
        return false;
    }
}