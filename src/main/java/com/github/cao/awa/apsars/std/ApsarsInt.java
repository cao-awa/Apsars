package com.github.cao.awa.apsars.std;

@DoNotRefPrimary
public final class ApsarsInt {
    public int delegate;

    @TryInline
    public boolean isMoreThan(final short comparingTarget) {
        return this.delegate > comparingTarget;
    }

    @TryInline
    public boolean isMoreThan(final int comparingTarget) {
        return this.delegate > comparingTarget;
    }

    @TryInline
    public boolean isMoreThan(final long comparingTarget) {
        return this.delegate > comparingTarget;
    }

    @TryInline
    public boolean isMoreThan(final float comparingTarget) {
        return this.delegate > comparingTarget;
    }

    @TryInline
    public boolean isMoreThan(final double comparingTarget) {
        return this.delegate > comparingTarget;
    }

    @TryInline
    public boolean isMoreThan(final byte comparingTarget) {
        return this.delegate > comparingTarget;
    }

    @TryInline
    public boolean isMoreThan(final char comparingTarget) {
        return this.delegate > comparingTarget;
    }

    @TryInline
    public boolean isMoreThan(final boolean comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isLessThan(final short comparingTarget) {
        return this.delegate < comparingTarget;
    }

    @TryInline
    public boolean isLessThan(final int comparingTarget) {
        return this.delegate < comparingTarget;
    }

    @TryInline
    public boolean isLessThan(final long comparingTarget) {
        return this.delegate < comparingTarget;
    }

    @TryInline
    public boolean isLessThan(final float comparingTarget) {
        return this.delegate < comparingTarget;
    }

    @TryInline
    public boolean isLessThan(final double comparingTarget) {
        return this.delegate < comparingTarget;
    }

    @TryInline
    public boolean isLessThan(final byte comparingTarget) {
        return this.delegate < comparingTarget;
    }

    @TryInline
    public boolean isLessThan(final char comparingTarget) {
        return this.delegate < comparingTarget;
    }

    @TryInline
    public boolean isLessThan(final boolean comparingTarget) {
        return false;
    }

    @TryInline
    public boolean isEquals(final short comparingTarget) {
        return this.delegate == comparingTarget;
    }

    @TryInline
    public boolean isEquals(final int comparingTarget) {
        return this.delegate == comparingTarget;
    }

    @TryInline
    public boolean isEquals(final long comparingTarget) {
        return this.delegate == comparingTarget;
    }

    @TryInline
    public boolean isEquals(final float comparingTarget) {
        return this.delegate == comparingTarget;
    }

    @TryInline
    public boolean isEquals(final double comparingTarget) {
        return this.delegate == comparingTarget;
    }

    @TryInline
    public boolean isEquals(final byte comparingTarget) {
        return this.delegate == comparingTarget;
    }

    @TryInline
    public boolean isEquals(final char comparingTarget) {
        return this.delegate == comparingTarget;
    }

    @TryInline
    public boolean isEquals(final boolean comparingTarget) {
        return false;
    }
}