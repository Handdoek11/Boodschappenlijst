package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0883g implements Iterable, Serializable {

    /* renamed from: s, reason: collision with root package name */
    public static final AbstractC0883g f9378s = new i(AbstractC0899x.f9593c);

    /* renamed from: t, reason: collision with root package name */
    private static final f f9379t;

    /* renamed from: u, reason: collision with root package name */
    private static final Comparator f9380u;

    /* renamed from: o, reason: collision with root package name */
    private int f9381o = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.g$a */
    class a extends c {

        /* renamed from: o, reason: collision with root package name */
        private int f9382o = 0;

        /* renamed from: s, reason: collision with root package name */
        private final int f9383s;

        a() {
            this.f9383s = AbstractC0883g.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0883g.InterfaceC0157g
        public byte f() {
            int i8 = this.f9382o;
            if (i8 >= this.f9383s) {
                throw new NoSuchElementException();
            }
            this.f9382o = i8 + 1;
            return AbstractC0883g.this.p(i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9382o < this.f9383s;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$b */
    static class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC0883g abstractC0883g, AbstractC0883g abstractC0883g2) {
            InterfaceC0157g r8 = abstractC0883g.r();
            InterfaceC0157g r9 = abstractC0883g2.r();
            while (r8.hasNext() && r9.hasNext()) {
                int compare = Integer.compare(AbstractC0883g.w(r8.f()), AbstractC0883g.w(r9.f()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(abstractC0883g.size(), abstractC0883g2.size());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$c */
    static abstract class c implements InterfaceC0157g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(f());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$d */
    private static final class d implements f {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0883g.f
        public byte[] a(byte[] bArr, int i8, int i9) {
            return Arrays.copyOfRange(bArr, i8, i9 + i8);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$e */
    private static final class e extends i {

        /* renamed from: w, reason: collision with root package name */
        private final int f9385w;

        /* renamed from: x, reason: collision with root package name */
        private final int f9386x;

        e(byte[] bArr, int i8, int i9) {
            super(bArr);
            AbstractC0883g.e(i8, i8 + i9, bArr.length);
            this.f9385w = i8;
            this.f9386x = i9;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0883g.i
        protected int L() {
            return this.f9385w;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0883g.i, androidx.datastore.preferences.protobuf.AbstractC0883g
        public byte c(int i8) {
            AbstractC0883g.d(i8, size());
            return this.f9387v[this.f9385w + i8];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0883g.i, androidx.datastore.preferences.protobuf.AbstractC0883g
        byte p(int i8) {
            return this.f9387v[this.f9385w + i8];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0883g.i, androidx.datastore.preferences.protobuf.AbstractC0883g
        public int size() {
            return this.f9386x;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$f */
    private interface f {
        byte[] a(byte[] bArr, int i8, int i9);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC0157g extends Iterator {
        byte f();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$h */
    static abstract class h extends AbstractC0883g {
        h() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.r();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$i */
    private static class i extends h {

        /* renamed from: v, reason: collision with root package name */
        protected final byte[] f9387v;

        i(byte[] bArr) {
            bArr.getClass();
            this.f9387v = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0883g
        final void I(AbstractC0882f abstractC0882f) {
            abstractC0882f.a(this.f9387v, L(), size());
        }

        final boolean J(AbstractC0883g abstractC0883g, int i8, int i9) {
            if (i9 > abstractC0883g.size()) {
                throw new IllegalArgumentException("Length too large: " + i9 + size());
            }
            int i10 = i8 + i9;
            if (i10 > abstractC0883g.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i8 + ", " + i9 + ", " + abstractC0883g.size());
            }
            if (!(abstractC0883g instanceof i)) {
                return abstractC0883g.v(i8, i10).equals(v(0, i9));
            }
            i iVar = (i) abstractC0883g;
            byte[] bArr = this.f9387v;
            byte[] bArr2 = iVar.f9387v;
            int L7 = L() + i9;
            int L8 = L();
            int L9 = iVar.L() + i8;
            while (L8 < L7) {
                if (bArr[L8] != bArr2[L9]) {
                    return false;
                }
                L8++;
                L9++;
            }
            return true;
        }

        protected int L() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0883g
        public byte c(int i8) {
            return this.f9387v[i8];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0883g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC0883g) || size() != ((AbstractC0883g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int t7 = t();
            int t8 = iVar.t();
            if (t7 == 0 || t8 == 0 || t7 == t8) {
                return J(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0883g
        byte p(int i8) {
            return this.f9387v[i8];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0883g
        public final boolean q() {
            int L7 = L();
            return n0.n(this.f9387v, L7, size() + L7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0883g
        protected final int s(int i8, int i9, int i10) {
            return AbstractC0899x.i(i8, this.f9387v, L() + i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0883g
        public int size() {
            return this.f9387v.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0883g
        public final AbstractC0883g v(int i8, int i9) {
            int e8 = AbstractC0883g.e(i8, i9, size());
            return e8 == 0 ? AbstractC0883g.f9378s : new e(this.f9387v, L() + i8, e8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0883g
        protected final String y(Charset charset) {
            return new String(this.f9387v, L(), size(), charset);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$j */
    private static final class j implements f {
        private j() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0883g.f
        public byte[] a(byte[] bArr, int i8, int i9) {
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            return bArr2;
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f9379t = AbstractC0880d.c() ? new j(aVar) : new d(aVar);
        f9380u = new b();
    }

    AbstractC0883g() {
    }

    static AbstractC0883g F(byte[] bArr) {
        return new i(bArr);
    }

    static AbstractC0883g H(byte[] bArr, int i8, int i9) {
        return new e(bArr, i8, i9);
    }

    static void d(int i8, int i9) {
        if (((i9 - (i8 + 1)) | i8) < 0) {
            if (i8 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + i9);
        }
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

    public static AbstractC0883g j(byte[] bArr) {
        return n(bArr, 0, bArr.length);
    }

    public static AbstractC0883g n(byte[] bArr, int i8, int i9) {
        e(i8, i8 + i9, bArr.length);
        return new i(f9379t.a(bArr, i8, i9));
    }

    public static AbstractC0883g o(String str) {
        return new i(str.getBytes(AbstractC0899x.f9591a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int w(byte b8) {
        return b8 & 255;
    }

    public final String C() {
        return x(AbstractC0899x.f9591a);
    }

    abstract void I(AbstractC0882f abstractC0882f);

    public abstract byte c(int i8);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i8 = this.f9381o;
        if (i8 == 0) {
            int size = size();
            i8 = s(size, 0, size);
            if (i8 == 0) {
                i8 = 1;
            }
            this.f9381o = i8;
        }
        return i8;
    }

    abstract byte p(int i8);

    public abstract boolean q();

    public InterfaceC0157g r() {
        return new a();
    }

    protected abstract int s(int i8, int i9, int i10);

    public abstract int size();

    protected final int t() {
        return this.f9381o;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract AbstractC0883g v(int i8, int i9);

    public final String x(Charset charset) {
        return size() == 0 ? "" : y(charset);
    }

    protected abstract String y(Charset charset);
}
