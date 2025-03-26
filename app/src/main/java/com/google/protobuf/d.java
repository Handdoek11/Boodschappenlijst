package com.google.protobuf;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class d implements Iterable {

    /* renamed from: o, reason: collision with root package name */
    public static final d f33078o = new k(new byte[0]);

    public interface a extends Iterator {
        byte f();
    }

    d() {
    }

    public static d C(InputStream inputStream, int i8) {
        return F(inputStream, i8, i8);
    }

    public static d F(InputStream inputStream, int i8, int i9) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            d y7 = y(inputStream, i8);
            if (y7 == null) {
                return d(arrayList);
            }
            arrayList.add(y7);
            i8 = Math.min(i8 * 2, i9);
        }
    }

    private static d b(Iterator it, int i8) {
        if (i8 == 1) {
            return (d) it.next();
        }
        int i9 = i8 >>> 1;
        return b(it, i9).c(b(it, i8 - i9));
    }

    public static d d(Iterable iterable) {
        Collection collection;
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            collection = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                collection.add((d) it.next());
            }
        }
        return collection.isEmpty() ? f33078o : b(collection.iterator(), collection.size());
    }

    public static d e(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static d j(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        return new k(bArr2);
    }

    public static d n(String str) {
        try {
            return new k(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e8) {
            throw new RuntimeException("UTF-8 not supported?", e8);
        }
    }

    public static b t() {
        return new b(128);
    }

    private static d y(InputStream inputStream, int i8) {
        byte[] bArr = new byte[i8];
        int i9 = 0;
        while (i9 < i8) {
            int read = inputStream.read(bArr, i9, i8 - i9);
            if (read == -1) {
                break;
            }
            i9 += read;
        }
        if (i9 == 0) {
            return null;
        }
        return j(bArr, 0, i9);
    }

    public byte[] H() {
        int size = size();
        if (size == 0) {
            return h.f33101a;
        }
        byte[] bArr = new byte[size];
        p(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String I(String str);

    public String J() {
        try {
            return I("UTF-8");
        } catch (UnsupportedEncodingException e8) {
            throw new RuntimeException("UTF-8 not supported?", e8);
        }
    }

    void L(OutputStream outputStream, int i8, int i9) {
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("Source offset < 0: " + i8);
        }
        if (i9 < 0) {
            throw new IndexOutOfBoundsException("Length < 0: " + i9);
        }
        int i10 = i8 + i9;
        if (i10 <= size()) {
            if (i9 > 0) {
                N(outputStream, i8, i9);
            }
        } else {
            throw new IndexOutOfBoundsException("Source end offset exceeded: " + i10);
        }
    }

    abstract void N(OutputStream outputStream, int i8, int i9);

    public d c(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (size + size2 < 2147483647L) {
            return p.R(this, dVar);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size + "+" + size2);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void o(byte[] bArr, int i8, int i9, int i10) {
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("Source offset < 0: " + i8);
        }
        if (i9 < 0) {
            throw new IndexOutOfBoundsException("Target offset < 0: " + i9);
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Length < 0: " + i10);
        }
        int i11 = i8 + i10;
        if (i11 > size()) {
            throw new IndexOutOfBoundsException("Source end offset < 0: " + i11);
        }
        int i12 = i9 + i10;
        if (i12 <= bArr.length) {
            if (i10 > 0) {
                p(bArr, i8, i9, i10);
            }
        } else {
            throw new IndexOutOfBoundsException("Target end offset < 0: " + i12);
        }
    }

    protected abstract void p(byte[] bArr, int i8, int i9, int i10);

    protected abstract int q();

    protected abstract boolean r();

    public abstract boolean s();

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    protected abstract int v(int i8, int i9, int i10);

    protected abstract int w(int i8, int i9, int i10);

    protected abstract int x();

    public static final class b extends OutputStream {

        /* renamed from: w, reason: collision with root package name */
        private static final byte[] f33079w = new byte[0];

        /* renamed from: o, reason: collision with root package name */
        private final int f33080o;

        /* renamed from: s, reason: collision with root package name */
        private final ArrayList f33081s;

        /* renamed from: t, reason: collision with root package name */
        private int f33082t;

        /* renamed from: u, reason: collision with root package name */
        private byte[] f33083u;

        /* renamed from: v, reason: collision with root package name */
        private int f33084v;

        b(int i8) {
            if (i8 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f33080o = i8;
            this.f33081s = new ArrayList();
            this.f33083u = new byte[i8];
        }

        private byte[] d(byte[] bArr, int i8) {
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i8));
            return bArr2;
        }

        private void e(int i8) {
            this.f33081s.add(new k(this.f33083u));
            int length = this.f33082t + this.f33083u.length;
            this.f33082t = length;
            this.f33083u = new byte[Math.max(this.f33080o, Math.max(i8, length >>> 1))];
            this.f33084v = 0;
        }

        private void f() {
            int i8 = this.f33084v;
            byte[] bArr = this.f33083u;
            if (i8 >= bArr.length) {
                this.f33081s.add(new k(this.f33083u));
                this.f33083u = f33079w;
            } else if (i8 > 0) {
                this.f33081s.add(new k(d(bArr, i8)));
            }
            this.f33082t += this.f33084v;
            this.f33084v = 0;
        }

        public synchronized int g() {
            return this.f33082t + this.f33084v;
        }

        public synchronized d h() {
            f();
            return d.d(this.f33081s);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(g()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i8) {
            try {
                if (this.f33084v == this.f33083u.length) {
                    e(1);
                }
                byte[] bArr = this.f33083u;
                int i9 = this.f33084v;
                this.f33084v = i9 + 1;
                bArr[i9] = (byte) i8;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i8, int i9) {
            try {
                byte[] bArr2 = this.f33083u;
                int length = bArr2.length;
                int i10 = this.f33084v;
                if (i9 <= length - i10) {
                    System.arraycopy(bArr, i8, bArr2, i10, i9);
                    this.f33084v += i9;
                } else {
                    int length2 = bArr2.length - i10;
                    System.arraycopy(bArr, i8, bArr2, i10, length2);
                    int i11 = i9 - length2;
                    e(i11);
                    System.arraycopy(bArr, i8 + length2, this.f33083u, 0, i11);
                    this.f33084v = i11;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
