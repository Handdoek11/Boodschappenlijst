package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class K3 implements Serializable, Iterable {

    /* renamed from: s, reason: collision with root package name */
    public static final K3 f28931s = new V3(AbstractC5026t4.f29580b);

    /* renamed from: t, reason: collision with root package name */
    private static final R3 f28932t = new U3();

    /* renamed from: o, reason: collision with root package name */
    private int f28933o = 0;

    static {
        new M3();
    }

    K3() {
    }

    static /* synthetic */ int d(byte b8) {
        return b8 & 255;
    }

    static int e(int i8, int i9, int i10) {
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

    public static K3 n(String str) {
        return new V3(str.getBytes(AbstractC5026t4.f29579a));
    }

    public static K3 o(byte[] bArr) {
        return p(bArr, 0, bArr.length);
    }

    public static K3 p(byte[] bArr, int i8, int i9) {
        e(i8, i8 + i9, bArr.length);
        return new V3(f28932t.C(bArr, i8, i9));
    }

    static T3 v(int i8) {
        return new T3(i8);
    }

    public abstract byte b(int i8);

    protected final int c() {
        return this.f28933o;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i8 = this.f28933o;
        if (i8 == 0) {
            int s8 = s();
            i8 = t(s8, 0, s8);
            if (i8 == 0) {
                i8 = 1;
            }
            this.f28933o = i8;
        }
        return i8;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return new N3(this);
    }

    public abstract K3 j(int i8, int i9);

    abstract void q(L3 l32);

    abstract byte r(int i8);

    public abstract int s();

    protected abstract int t(int i8, int i9, int i10);

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(s());
        if (s() <= 50) {
            str = AbstractC5059x5.a(this);
        } else {
            str = AbstractC5059x5.a(j(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, valueOf, str);
    }
}
