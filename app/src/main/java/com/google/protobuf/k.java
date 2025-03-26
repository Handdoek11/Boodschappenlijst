package com.google.protobuf;

import com.google.protobuf.d;
import java.io.OutputStream;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
class k extends d {

    /* renamed from: s, reason: collision with root package name */
    protected final byte[] f33105s;

    /* renamed from: t, reason: collision with root package name */
    private int f33106t = 0;

    private class b implements d.a {

        /* renamed from: o, reason: collision with root package name */
        private int f33107o;

        /* renamed from: s, reason: collision with root package name */
        private final int f33108s;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(f());
        }

        @Override // com.google.protobuf.d.a
        public byte f() {
            try {
                byte[] bArr = k.this.f33105s;
                int i8 = this.f33107o;
                this.f33107o = i8 + 1;
                return bArr[i8];
            } catch (ArrayIndexOutOfBoundsException e8) {
                throw new NoSuchElementException(e8.getMessage());
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33107o < this.f33108s;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            this.f33107o = 0;
            this.f33108s = k.this.size();
        }
    }

    k(byte[] bArr) {
        this.f33105s = bArr;
    }

    static int Q(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    @Override // com.google.protobuf.d
    public String I(String str) {
        return new String(this.f33105s, P(), size(), str);
    }

    @Override // com.google.protobuf.d
    void N(OutputStream outputStream, int i8, int i9) {
        outputStream.write(this.f33105s, P() + i8, i9);
    }

    boolean O(k kVar, int i8, int i9) {
        if (i9 > kVar.size()) {
            throw new IllegalArgumentException("Length too large: " + i9 + size());
        }
        if (i8 + i9 > kVar.size()) {
            throw new IllegalArgumentException("Ran off end of other: " + i8 + ", " + i9 + ", " + kVar.size());
        }
        byte[] bArr = this.f33105s;
        byte[] bArr2 = kVar.f33105s;
        int P7 = P() + i9;
        int P8 = P();
        int P9 = kVar.P() + i8;
        while (P8 < P7) {
            if (bArr[P8] != bArr2[P9]) {
                return false;
            }
            P8++;
            P9++;
        }
        return true;
    }

    protected int P() {
        return 0;
    }

    @Override // java.lang.Iterable
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public d.a iterator() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof k) {
            return O((k) obj, 0, size());
        }
        if (obj instanceof p) {
            return obj.equals(this);
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + obj.getClass());
    }

    public int hashCode() {
        int i8 = this.f33106t;
        if (i8 == 0) {
            int size = size();
            i8 = v(size, 0, size);
            if (i8 == 0) {
                i8 = 1;
            }
            this.f33106t = i8;
        }
        return i8;
    }

    @Override // com.google.protobuf.d
    protected void p(byte[] bArr, int i8, int i9, int i10) {
        System.arraycopy(this.f33105s, i8, bArr, i9, i10);
    }

    @Override // com.google.protobuf.d
    protected int q() {
        return 0;
    }

    @Override // com.google.protobuf.d
    protected boolean r() {
        return true;
    }

    @Override // com.google.protobuf.d
    public boolean s() {
        int P7 = P();
        return r.f(this.f33105s, P7, size() + P7);
    }

    @Override // com.google.protobuf.d
    public int size() {
        return this.f33105s.length;
    }

    @Override // com.google.protobuf.d
    protected int v(int i8, int i9, int i10) {
        return Q(i8, this.f33105s, P() + i9, i10);
    }

    @Override // com.google.protobuf.d
    protected int w(int i8, int i9, int i10) {
        int P7 = P() + i9;
        return r.g(i8, this.f33105s, P7, i10 + P7);
    }

    @Override // com.google.protobuf.d
    protected int x() {
        return this.f33106t;
    }
}
