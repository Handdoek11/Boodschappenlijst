package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.bv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2240bv0 extends InputStream {

    /* renamed from: o, reason: collision with root package name */
    private Iterator f21007o;

    /* renamed from: s, reason: collision with root package name */
    private ByteBuffer f21008s;

    /* renamed from: t, reason: collision with root package name */
    private int f21009t = 0;

    /* renamed from: u, reason: collision with root package name */
    private int f21010u;

    /* renamed from: v, reason: collision with root package name */
    private int f21011v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f21012w;

    /* renamed from: x, reason: collision with root package name */
    private byte[] f21013x;

    /* renamed from: y, reason: collision with root package name */
    private int f21014y;

    /* renamed from: z, reason: collision with root package name */
    private long f21015z;

    C2240bv0(Iterable iterable) {
        this.f21007o = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f21009t++;
        }
        this.f21010u = -1;
        if (e()) {
            return;
        }
        this.f21008s = AbstractC2131av0.f20784c;
        this.f21010u = 0;
        this.f21011v = 0;
        this.f21015z = 0L;
    }

    private final void d(int i8) {
        int i9 = this.f21011v + i8;
        this.f21011v = i9;
        if (i9 == this.f21008s.limit()) {
            e();
        }
    }

    private final boolean e() {
        this.f21010u++;
        if (!this.f21007o.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f21007o.next();
        this.f21008s = byteBuffer;
        this.f21011v = byteBuffer.position();
        if (this.f21008s.hasArray()) {
            this.f21012w = true;
            this.f21013x = this.f21008s.array();
            this.f21014y = this.f21008s.arrayOffset();
        } else {
            this.f21012w = false;
            this.f21015z = Vv0.m(this.f21008s);
            this.f21013x = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f21010u == this.f21009t) {
            return -1;
        }
        if (this.f21012w) {
            int i8 = this.f21013x[this.f21011v + this.f21014y] & 255;
            d(1);
            return i8;
        }
        int i9 = Vv0.i(this.f21011v + this.f21015z) & 255;
        d(1);
        return i9;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i8, int i9) {
        if (this.f21010u == this.f21009t) {
            return -1;
        }
        int limit = this.f21008s.limit();
        int i10 = this.f21011v;
        int i11 = limit - i10;
        if (i9 > i11) {
            i9 = i11;
        }
        if (this.f21012w) {
            System.arraycopy(this.f21013x, i10 + this.f21014y, bArr, i8, i9);
            d(i9);
        } else {
            int position = this.f21008s.position();
            this.f21008s.position(this.f21011v);
            this.f21008s.get(bArr, i8, i9);
            this.f21008s.position(position);
            d(i9);
        }
        return i9;
    }
}
