package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.play_billing.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5176q2 implements Iterable, Serializable {

    /* renamed from: s, reason: collision with root package name */
    public static final AbstractC5176q2 f29971s = new C5164o2(R2.f29810b);

    /* renamed from: o, reason: collision with root package name */
    private int f29972o = 0;

    static {
        int i8 = AbstractC5098d2.f29889a;
    }

    AbstractC5176q2() {
    }

    static int o(int i8, int i9, int i10) {
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

    public static AbstractC5176q2 q(byte[] bArr, int i8, int i9) {
        o(i8, i8 + i9, bArr.length);
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        return new C5164o2(bArr2);
    }

    public abstract byte b(int i8);

    abstract byte c(int i8);

    public abstract int d();

    protected abstract int e(int i8, int i9, int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i8 = this.f29972o;
        if (i8 == 0) {
            int d8 = d();
            i8 = e(d8, 0, d8);
            if (i8 == 0) {
                i8 = 1;
            }
            this.f29972o = i8;
        }
        return i8;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C5134j2(this);
    }

    public abstract AbstractC5176q2 j(int i8, int i9);

    abstract void n(AbstractC5128i2 abstractC5128i2);

    protected final int p() {
        return this.f29972o;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? AbstractC5212w3.a(this) : AbstractC5212w3.a(j(0, 47)).concat("..."));
    }
}
