package com.google.protobuf;

/* loaded from: classes2.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    static final int f33130a = c(1, 3);

    /* renamed from: b, reason: collision with root package name */
    static final int f33131b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    static final int f33132c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    static final int f33133d = c(3, 2);

    public static int a(int i8) {
        return i8 >>> 3;
    }

    static int b(int i8) {
        return i8 & 7;
    }

    static int c(int i8, int i9) {
        return (i8 << 3) | i9;
    }
}
