package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.aU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2082aU {

    /* renamed from: a, reason: collision with root package name */
    private long[] f20704a = new long[10];

    /* renamed from: b, reason: collision with root package name */
    private Object[] f20705b = new Object[10];

    /* renamed from: c, reason: collision with root package name */
    private int f20706c;

    /* renamed from: d, reason: collision with root package name */
    private int f20707d;

    public C2082aU(int i8) {
    }

    private final Object f() {
        AbstractC3796qC.f(this.f20707d > 0);
        Object[] objArr = this.f20705b;
        int i8 = this.f20706c;
        Object obj = objArr[i8];
        objArr[i8] = null;
        this.f20706c = (i8 + 1) % objArr.length;
        this.f20707d--;
        return obj;
    }

    public final synchronized int a() {
        return this.f20707d;
    }

    public final synchronized Object b() {
        if (this.f20707d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized Object c(long j8) {
        Object obj;
        obj = null;
        while (this.f20707d > 0 && j8 - this.f20704a[this.f20706c] >= 0) {
            obj = f();
        }
        return obj;
    }

    public final synchronized void d(long j8, Object obj) {
        try {
            if (this.f20707d > 0) {
                if (j8 <= this.f20704a[((this.f20706c + r0) - 1) % this.f20705b.length]) {
                    e();
                }
            }
            int length = this.f20705b.length;
            if (this.f20707d >= length) {
                int i8 = length + length;
                long[] jArr = new long[i8];
                Object[] objArr = new Object[i8];
                int i9 = this.f20706c;
                int i10 = length - i9;
                System.arraycopy(this.f20704a, i9, jArr, 0, i10);
                System.arraycopy(this.f20705b, this.f20706c, objArr, 0, i10);
                int i11 = this.f20706c;
                if (i11 > 0) {
                    System.arraycopy(this.f20704a, 0, jArr, i10, i11);
                    System.arraycopy(this.f20705b, 0, objArr, i10, this.f20706c);
                }
                this.f20704a = jArr;
                this.f20705b = objArr;
                this.f20706c = 0;
            }
            int i12 = this.f20706c;
            int i13 = this.f20707d;
            Object[] objArr2 = this.f20705b;
            int length2 = (i12 + i13) % objArr2.length;
            this.f20704a[length2] = j8;
            objArr2[length2] = obj;
            this.f20707d = i13 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        this.f20706c = 0;
        this.f20707d = 0;
        Arrays.fill(this.f20705b, (Object) null);
    }
}
