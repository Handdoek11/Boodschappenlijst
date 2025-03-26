package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class JM {

    /* renamed from: a, reason: collision with root package name */
    private int f16231a;

    /* renamed from: b, reason: collision with root package name */
    private int f16232b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f16233c;

    /* renamed from: d, reason: collision with root package name */
    private int f16234d;

    public JM(int i8) {
        int i9 = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i9 = highestOneBit + highestOneBit;
        }
        this.f16231a = 0;
        this.f16232b = 0;
        this.f16233c = new long[i9];
        this.f16234d = r3.length - 1;
    }

    public final long a() {
        if (this.f16232b != 0) {
            return this.f16233c[this.f16231a];
        }
        throw new NoSuchElementException();
    }

    public final long b() {
        int i8 = this.f16232b;
        if (i8 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f16233c;
        int i9 = this.f16231a;
        long j8 = jArr[i9];
        this.f16231a = this.f16234d & (i9 + 1);
        this.f16232b = i8 - 1;
        return j8;
    }

    public final void c() {
        this.f16231a = 0;
        this.f16232b = 0;
    }

    public final boolean d() {
        return this.f16232b == 0;
    }
}
