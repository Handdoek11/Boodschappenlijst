package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.nu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3542nu0 implements Iterable, Serializable {

    /* renamed from: s, reason: collision with root package name */
    public static final AbstractC3542nu0 f25048s = new C3215ku0(AbstractC2131av0.f20783b);

    /* renamed from: o, reason: collision with root package name */
    private int f25049o = 0;

    static {
        int i8 = Zt0.f20574a;
    }

    AbstractC3542nu0() {
    }

    public static C3324lu0 C() {
        return new C3324lu0(128);
    }

    public static AbstractC3542nu0 F(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f25048s : e(iterable.iterator(), size);
    }

    public static AbstractC3542nu0 H(byte[] bArr, int i8, int i9) {
        w(i8, i8 + i9, bArr.length);
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        return new C3215ku0(bArr2);
    }

    public static AbstractC3542nu0 I(String str) {
        return new C3215ku0(str.getBytes(AbstractC2131av0.f20782a));
    }

    static void J(int i8, int i9) {
        if (((i9 - (i8 + 1)) | i8) < 0) {
            if (i8 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + i9);
        }
    }

    private static AbstractC3542nu0 e(Iterator it, int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i8)));
        }
        if (i8 == 1) {
            return (AbstractC3542nu0) it.next();
        }
        int i9 = i8 >>> 1;
        AbstractC3542nu0 e8 = e(it, i9);
        AbstractC3542nu0 e9 = e(it, i8 - i9);
        if (Integer.MAX_VALUE - e8.j() >= e9.j()) {
            return Hv0.O(e8, e9);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + e8.j() + "+" + e9.j());
    }

    static int w(int i8, int i9, int i10) {
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

    public final void L(byte[] bArr, int i8, int i9, int i10) {
        w(0, i10, j());
        w(i9, i9 + i10, bArr.length);
        if (i10 > 0) {
            n(bArr, 0, i9, i10);
        }
    }

    public final byte[] b() {
        int j8 = j();
        if (j8 == 0) {
            return AbstractC2131av0.f20783b;
        }
        byte[] bArr = new byte[j8];
        n(bArr, 0, 0, j8);
        return bArr;
    }

    public abstract byte c(int i8);

    abstract byte d(int i8);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i8 = this.f25049o;
        if (i8 == 0) {
            int j8 = j();
            i8 = q(j8, 0, j8);
            if (i8 == 0) {
                i8 = 1;
            }
            this.f25049o = i8;
        }
        return i8;
    }

    public abstract int j();

    protected abstract void n(byte[] bArr, int i8, int i9, int i10);

    protected abstract int o();

    protected abstract boolean p();

    protected abstract int q(int i8, int i9, int i10);

    public abstract AbstractC3542nu0 r(int i8, int i9);

    public abstract AbstractC4086su0 s();

    public abstract ByteBuffer t();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(j()), j() <= 50 ? Nv0.a(this) : Nv0.a(r(0, 47)).concat("..."));
    }

    abstract void v(AbstractC2563eu0 abstractC2563eu0);

    protected final int x() {
        return this.f25049o;
    }

    @Override // java.lang.Iterable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public InterfaceC2997iu0 iterator() {
        return new C2672fu0(this);
    }
}
