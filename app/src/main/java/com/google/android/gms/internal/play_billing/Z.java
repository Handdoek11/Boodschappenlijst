package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class Z extends AbstractC5078a0 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f29854a;

    /* renamed from: b, reason: collision with root package name */
    int f29855b;

    /* renamed from: c, reason: collision with root package name */
    boolean f29856c;

    Z(int i8) {
        N.a(i8, "initialCapacity");
        this.f29854a = new Object[i8];
        this.f29855b = 0;
    }

    private final void d(int i8) {
        int length = this.f29854a.length;
        int a8 = AbstractC5078a0.a(length, this.f29855b + i8);
        if (a8 > length || this.f29856c) {
            this.f29854a = Arrays.copyOf(this.f29854a, a8);
            this.f29856c = false;
        }
    }

    public final Z b(Object obj) {
        obj.getClass();
        d(1);
        Object[] objArr = this.f29854a;
        int i8 = this.f29855b;
        this.f29855b = i8 + 1;
        objArr[i8] = obj;
        return this;
    }

    final void c(Object[] objArr, int i8) {
        AbstractC5209w0.b(objArr, i8);
        d(i8);
        System.arraycopy(objArr, 0, this.f29854a, this.f29855b, i8);
        this.f29855b += i8;
    }
}
