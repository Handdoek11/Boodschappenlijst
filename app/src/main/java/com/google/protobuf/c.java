package com.google.protobuf;

import com.google.protobuf.d;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
class c extends k {

    /* renamed from: u, reason: collision with root package name */
    private final int f33073u;

    /* renamed from: v, reason: collision with root package name */
    private final int f33074v;

    private class b implements d.a {

        /* renamed from: o, reason: collision with root package name */
        private int f33075o;

        /* renamed from: s, reason: collision with root package name */
        private final int f33076s;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(f());
        }

        @Override // com.google.protobuf.d.a
        public byte f() {
            int i8 = this.f33075o;
            if (i8 >= this.f33076s) {
                throw new NoSuchElementException();
            }
            byte[] bArr = c.this.f33105s;
            this.f33075o = i8 + 1;
            return bArr[i8];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33075o < this.f33076s;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            int P7 = c.this.P();
            this.f33075o = P7;
            this.f33076s = P7 + c.this.size();
        }
    }

    c(byte[] bArr, int i8, int i9) {
        super(bArr);
        if (i8 < 0) {
            throw new IllegalArgumentException("Offset too small: " + i8);
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("Length too small: " + i8);
        }
        if (i8 + i9 <= bArr.length) {
            this.f33073u = i8;
            this.f33074v = i9;
            return;
        }
        throw new IllegalArgumentException("Offset+Length too large: " + i8 + "+" + i9);
    }

    @Override // com.google.protobuf.k
    protected int P() {
        return this.f33073u;
    }

    @Override // com.google.protobuf.k, java.lang.Iterable
    /* renamed from: R */
    public d.a iterator() {
        return new b();
    }

    @Override // com.google.protobuf.k, com.google.protobuf.d
    protected void p(byte[] bArr, int i8, int i9, int i10) {
        System.arraycopy(this.f33105s, P() + i8, bArr, i9, i10);
    }

    @Override // com.google.protobuf.k, com.google.protobuf.d
    public int size() {
        return this.f33074v;
    }
}
