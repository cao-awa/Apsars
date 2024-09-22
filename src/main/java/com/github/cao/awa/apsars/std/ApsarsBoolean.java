package com.github.cao.awa.apsars.std;

@DoNotRefPrimary
public final class ApsarsBoolean {
    public boolean delegate;

    @TryInline
    public boolean isMoreThan(short comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isMoreThan(int comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isMoreThan(long comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isMoreThan(float comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isMoreThan(double comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isMoreThan(byte comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isMoreThan(char comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isMoreThan(boolean comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isLessThan(short comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isLessThan(int comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isLessThan(long comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isLessThan(float comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isLessThan(double comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isLessThan(byte comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isLessThan(char comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isLessThan(boolean comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isEquals(short comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isEquals(int comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isEquals(long comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isEquals(float comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isEquals(double comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isEquals(byte comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isEquals(char comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isEquals(boolean comparingTarget) {
        return comparingTarget && this.delegate;
    }
}