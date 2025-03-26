package com.google.android.gms.internal.wearable;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.wearable.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5242e1 {

    /* renamed from: a, reason: collision with root package name */
    final Unsafe f30122a;

    AbstractC5242e1(Unsafe unsafe) {
        this.f30122a = unsafe;
    }

    public abstract double a(Object obj, long j8);

    public abstract float b(Object obj, long j8);

    public abstract void c(Object obj, long j8, boolean z7);

    public abstract void d(Object obj, long j8, byte b8);

    public abstract void e(Object obj, long j8, double d8);

    public abstract void f(Object obj, long j8, float f8);

    public abstract boolean g(Object obj, long j8);
}
