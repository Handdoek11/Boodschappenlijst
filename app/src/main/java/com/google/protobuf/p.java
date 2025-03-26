package com.google.protobuf;

import com.google.protobuf.d;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* loaded from: classes2.dex */
class p extends com.google.protobuf.d {

    /* renamed from: y, reason: collision with root package name */
    private static final int[] f33110y;

    /* renamed from: s, reason: collision with root package name */
    private final int f33111s;

    /* renamed from: t, reason: collision with root package name */
    private final com.google.protobuf.d f33112t;

    /* renamed from: u, reason: collision with root package name */
    private final com.google.protobuf.d f33113u;

    /* renamed from: v, reason: collision with root package name */
    private final int f33114v;

    /* renamed from: w, reason: collision with root package name */
    private final int f33115w;

    /* renamed from: x, reason: collision with root package name */
    private int f33116x;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Stack f33117a;

        private b() {
            this.f33117a = new Stack();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.google.protobuf.d b(com.google.protobuf.d dVar, com.google.protobuf.d dVar2) {
            c(dVar);
            c(dVar2);
            com.google.protobuf.d dVar3 = (com.google.protobuf.d) this.f33117a.pop();
            while (!this.f33117a.isEmpty()) {
                dVar3 = new p((com.google.protobuf.d) this.f33117a.pop(), dVar3);
            }
            return dVar3;
        }

        private void c(com.google.protobuf.d dVar) {
            if (dVar.r()) {
                e(dVar);
                return;
            }
            if (dVar instanceof p) {
                p pVar = (p) dVar;
                c(pVar.f33112t);
                c(pVar.f33113u);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + dVar.getClass());
            }
        }

        private int d(int i8) {
            int binarySearch = Arrays.binarySearch(p.f33110y, i8);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void e(com.google.protobuf.d dVar) {
            int d8 = d(dVar.size());
            int i8 = p.f33110y[d8 + 1];
            if (this.f33117a.isEmpty() || ((com.google.protobuf.d) this.f33117a.peek()).size() >= i8) {
                this.f33117a.push(dVar);
                return;
            }
            int i9 = p.f33110y[d8];
            com.google.protobuf.d dVar2 = (com.google.protobuf.d) this.f33117a.pop();
            while (true) {
                if (this.f33117a.isEmpty() || ((com.google.protobuf.d) this.f33117a.peek()).size() >= i9) {
                    break;
                } else {
                    dVar2 = new p((com.google.protobuf.d) this.f33117a.pop(), dVar2);
                }
            }
            p pVar = new p(dVar2, dVar);
            while (!this.f33117a.isEmpty()) {
                if (((com.google.protobuf.d) this.f33117a.peek()).size() >= p.f33110y[d(pVar.size()) + 1]) {
                    break;
                } else {
                    pVar = new p((com.google.protobuf.d) this.f33117a.pop(), pVar);
                }
            }
            this.f33117a.push(pVar);
        }
    }

    private static class c implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        private final Stack f33118o;

        /* renamed from: s, reason: collision with root package name */
        private k f33119s;

        private k a(com.google.protobuf.d dVar) {
            while (dVar instanceof p) {
                p pVar = (p) dVar;
                this.f33118o.push(pVar);
                dVar = pVar.f33112t;
            }
            return (k) dVar;
        }

        private k b() {
            while (!this.f33118o.isEmpty()) {
                k a8 = a(((p) this.f33118o.pop()).f33113u);
                if (!a8.isEmpty()) {
                    return a8;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public k next() {
            k kVar = this.f33119s;
            if (kVar == null) {
                throw new NoSuchElementException();
            }
            this.f33119s = b();
            return kVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33119s != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(com.google.protobuf.d dVar) {
            this.f33118o = new Stack();
            this.f33119s = a(dVar);
        }
    }

    private class d implements d.a {

        /* renamed from: o, reason: collision with root package name */
        private final c f33120o;

        /* renamed from: s, reason: collision with root package name */
        private d.a f33121s;

        /* renamed from: t, reason: collision with root package name */
        int f33122t;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(f());
        }

        @Override // com.google.protobuf.d.a
        public byte f() {
            if (!this.f33121s.hasNext()) {
                this.f33121s = this.f33120o.next().iterator();
            }
            this.f33122t--;
            return this.f33121s.f();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33122t > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private d() {
            c cVar = new c(p.this);
            this.f33120o = cVar;
            this.f33121s = cVar.next().iterator();
            this.f33122t = p.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i8 = 1;
        int i9 = 1;
        while (i8 > 0) {
            arrayList.add(Integer.valueOf(i8));
            int i10 = i9 + i8;
            i9 = i8;
            i8 = i10;
        }
        arrayList.add(Integer.MAX_VALUE);
        f33110y = new int[arrayList.size()];
        int i11 = 0;
        while (true) {
            int[] iArr = f33110y;
            if (i11 >= iArr.length) {
                return;
            }
            iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
            i11++;
        }
    }

    static com.google.protobuf.d R(com.google.protobuf.d dVar, com.google.protobuf.d dVar2) {
        p pVar = dVar instanceof p ? (p) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar.size() + dVar2.size();
            if (size < 128) {
                return S(dVar, dVar2);
            }
            if (pVar != null && pVar.f33113u.size() + dVar2.size() < 128) {
                dVar2 = new p(pVar.f33112t, S(pVar.f33113u, dVar2));
            } else {
                if (pVar == null || pVar.f33112t.q() <= pVar.f33113u.q() || pVar.q() <= dVar2.q()) {
                    return size >= f33110y[Math.max(dVar.q(), dVar2.q()) + 1] ? new p(dVar, dVar2) : new b().b(dVar, dVar2);
                }
                dVar2 = new p(pVar.f33112t, new p(pVar.f33113u, dVar2));
            }
        }
        return dVar2;
    }

    private static k S(com.google.protobuf.d dVar, com.google.protobuf.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.o(bArr, 0, 0, size);
        dVar2.o(bArr, 0, size, size2);
        return new k(bArr);
    }

    private boolean T(com.google.protobuf.d dVar) {
        c cVar = new c(this);
        k kVar = (k) cVar.next();
        c cVar2 = new c(dVar);
        k kVar2 = (k) cVar2.next();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int size = kVar.size() - i8;
            int size2 = kVar2.size() - i9;
            int min = Math.min(size, size2);
            if (!(i8 == 0 ? kVar.O(kVar2, i9, min) : kVar2.O(kVar, i8, min))) {
                return false;
            }
            i10 += min;
            int i11 = this.f33111s;
            if (i10 >= i11) {
                if (i10 == i11) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                kVar = (k) cVar.next();
                i8 = 0;
            } else {
                i8 += min;
            }
            if (min == size2) {
                kVar2 = (k) cVar2.next();
                i9 = 0;
            } else {
                i9 += min;
            }
        }
    }

    @Override // com.google.protobuf.d
    public String I(String str) {
        return new String(H(), str);
    }

    @Override // com.google.protobuf.d
    void N(OutputStream outputStream, int i8, int i9) {
        int i10 = i8 + i9;
        int i11 = this.f33114v;
        if (i10 <= i11) {
            this.f33112t.N(outputStream, i8, i9);
        } else {
            if (i8 >= i11) {
                this.f33113u.N(outputStream, i8 - i11, i9);
                return;
            }
            int i12 = i11 - i8;
            this.f33112t.N(outputStream, i8, i12);
            this.f33113u.N(outputStream, 0, i9 - i12);
        }
    }

    @Override // java.lang.Iterable
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public d.a iterator() {
        return new d();
    }

    public boolean equals(Object obj) {
        int x7;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.d)) {
            return false;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        if (this.f33111s != dVar.size()) {
            return false;
        }
        if (this.f33111s == 0) {
            return true;
        }
        if (this.f33116x == 0 || (x7 = dVar.x()) == 0 || this.f33116x == x7) {
            return T(dVar);
        }
        return false;
    }

    public int hashCode() {
        int i8 = this.f33116x;
        if (i8 == 0) {
            int i9 = this.f33111s;
            i8 = v(i9, 0, i9);
            if (i8 == 0) {
                i8 = 1;
            }
            this.f33116x = i8;
        }
        return i8;
    }

    @Override // com.google.protobuf.d
    protected void p(byte[] bArr, int i8, int i9, int i10) {
        int i11 = i8 + i10;
        int i12 = this.f33114v;
        if (i11 <= i12) {
            this.f33112t.p(bArr, i8, i9, i10);
        } else {
            if (i8 >= i12) {
                this.f33113u.p(bArr, i8 - i12, i9, i10);
                return;
            }
            int i13 = i12 - i8;
            this.f33112t.p(bArr, i8, i9, i13);
            this.f33113u.p(bArr, 0, i9 + i13, i10 - i13);
        }
    }

    @Override // com.google.protobuf.d
    protected int q() {
        return this.f33115w;
    }

    @Override // com.google.protobuf.d
    protected boolean r() {
        return this.f33111s >= f33110y[this.f33115w];
    }

    @Override // com.google.protobuf.d
    public boolean s() {
        int w7 = this.f33112t.w(0, 0, this.f33114v);
        com.google.protobuf.d dVar = this.f33113u;
        return dVar.w(w7, 0, dVar.size()) == 0;
    }

    @Override // com.google.protobuf.d
    public int size() {
        return this.f33111s;
    }

    @Override // com.google.protobuf.d
    protected int v(int i8, int i9, int i10) {
        int i11 = i9 + i10;
        int i12 = this.f33114v;
        if (i11 <= i12) {
            return this.f33112t.v(i8, i9, i10);
        }
        if (i9 >= i12) {
            return this.f33113u.v(i8, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return this.f33113u.v(this.f33112t.v(i8, i9, i13), 0, i10 - i13);
    }

    @Override // com.google.protobuf.d
    protected int w(int i8, int i9, int i10) {
        int i11 = i9 + i10;
        int i12 = this.f33114v;
        if (i11 <= i12) {
            return this.f33112t.w(i8, i9, i10);
        }
        if (i9 >= i12) {
            return this.f33113u.w(i8, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return this.f33113u.w(this.f33112t.w(i8, i9, i13), 0, i10 - i13);
    }

    @Override // com.google.protobuf.d
    protected int x() {
        return this.f33116x;
    }

    private p(com.google.protobuf.d dVar, com.google.protobuf.d dVar2) {
        this.f33116x = 0;
        this.f33112t = dVar;
        this.f33113u = dVar2;
        int size = dVar.size();
        this.f33114v = size;
        this.f33111s = size + dVar2.size();
        this.f33115w = Math.max(dVar.q(), dVar2.q()) + 1;
    }
}
