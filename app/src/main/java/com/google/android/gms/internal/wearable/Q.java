package com.google.android.gms.internal.wearable;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class Q implements Iterable, Serializable {

    /* renamed from: s, reason: collision with root package name */
    public static final Q f30081s = new O(AbstractC5269s0.f30213b);

    /* renamed from: o, reason: collision with root package name */
    private int f30082o = 0;

    static {
        int i8 = E.f30048a;
    }

    Q() {
    }

    static int p(int i8, int i9, int i10) {
        int i11 = i9 - i8;
        if ((i8 | i9 | i11 | (i10 - i9)) >= 0) {
            return i11;
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i8 + " < 0");
        }
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i8 + ", " + i9);
        }
        throw new IndexOutOfBoundsException("End index: " + i9 + " >= " + i10);
    }

    public static Q r(byte[] bArr, int i8, int i9) {
        p(i8, i8 + i9, bArr.length);
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        return new O(bArr2);
    }

    public abstract byte b(int i8);

    abstract byte c(int i8);

    public abstract int d();

    protected abstract void e(byte[] bArr, int i8, int i9, int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i8 = this.f30082o;
        if (i8 == 0) {
            int d8 = d();
            i8 = j(d8, 0, d8);
            if (i8 == 0) {
                i8 = 1;
            }
            this.f30082o = i8;
        }
        return i8;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new J(this);
    }

    protected abstract int j(int i8, int i9, int i10);

    public abstract Q n(int i8, int i9);

    abstract void o(I i8);

    protected final int q() {
        return this.f30082o;
    }

    public final byte[] s() {
        int d8 = d();
        if (d8 == 0) {
            return AbstractC5269s0.f30213b;
        }
        byte[] bArr = new byte[d8];
        e(bArr, 0, 0, d8);
        return bArr;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? X0.a(this) : X0.a(n(0, 47)).concat("..."));
    }
}
