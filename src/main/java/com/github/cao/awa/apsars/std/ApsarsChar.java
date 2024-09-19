package com.github.cao.awa.apsars.std;

@DoNotRefPrimary
public final class ApsarsChar {
    public char delegate;

    @TryInline
    public boolean isMoreThan(short comparingTarget) {
        return this.delegate > comparingTarget;
    }

    @TryInline
    public boolean isMoreThan(int comparingTarget) {
        return this.delegate > comparingTarget;
    }

    @TryInline
    public boolean isMoreThan(long comparingTarget) {
        return this.delegate > comparingTarget;
    }

    @TryInline
    public boolean isMoreThan(float comparingTarget) {
        return this.delegate > comparingTarget;
    }

    @TryInline
    public boolean isMoreThan(double comparingTarget) {
        return this.delegate > comparingTarget;
    }

    @TryInline
    public boolean isMoreThan(byte comparingTarget) {
        return this.delegate > comparingTarget;
    }

    @TryInline
    public boolean isMoreThan(char comparingTarget) {
        return this.delegate > comparingTarget;
    }

    @TryInline
    public boolean isLessThan(short comparingTarget) {
        return this.delegate < comparingTarget;
    }

    @TryInline
    public boolean isLessThan(int comparingTarget) {
        return this.delegate < comparingTarget;
    }

    @TryInline
    public boolean isLessThan(long comparingTarget) {
        return this.delegate < comparingTarget;
    }

    @TryInline
    public boolean isLessThan(float comparingTarget) {
        return this.delegate < comparingTarget;
    }

    @TryInline
    public boolean isLessThan(double comparingTarget) {
        return this.delegate < comparingTarget;
    }

    @TryInline
    public boolean isLessThan(byte comparingTarget) {
        return this.delegate < comparingTarget;
    }

    @TryInline
    public boolean isLessThan(char comparingTarget) {
        return this.delegate < comparingTarget;
    }

    @TryInline
    public boolean isEquals(short comparingTarget) {
        return this.delegate == comparingTarget;
    }

    @TryInline
    public boolean isEquals(int comparingTarget) {
        return this.delegate == comparingTarget;
    }

    @TryInline
    public boolean isEquals(long comparingTarget) {
        return this.delegate == comparingTarget;
    }

    @TryInline
    public boolean isEquals(float comparingTarget) {
        return this.delegate == comparingTarget;
    }

    @TryInline
    public boolean isEquals(double comparingTarget) {
        return this.delegate == comparingTarget;
    }

    @TryInline
    public boolean isEquals(byte comparingTarget) {
        return this.delegate == comparingTarget;
    }

    @TryInline
    public boolean isEquals(char comparingTarget) {
        return this.delegate == comparingTarget;
    }
}