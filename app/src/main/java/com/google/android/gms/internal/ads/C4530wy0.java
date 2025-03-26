package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.wy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4530wy0 extends AbstractC2676fw0 {

    /* renamed from: b, reason: collision with root package name */
    public D f27693b;

    /* renamed from: c, reason: collision with root package name */
    public final Lx0 f27694c = new Lx0();

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f27695d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27696e;

    /* renamed from: f, reason: collision with root package name */
    public long f27697f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f27698g;

    /* renamed from: h, reason: collision with root package name */
    private final int f27699h;

    static {
        AbstractC2591f8.b("media3.decoder");
    }

    public C4530wy0(int i8, int i9) {
        this.f27699h = i8;
    }

    private final ByteBuffer m(int i8) {
        int i9 = this.f27699h;
        if (i9 == 1) {
            return ByteBuffer.allocate(i8);
        }
        if (i9 == 2) {
            return ByteBuffer.allocateDirect(i8);
        }
        ByteBuffer byteBuffer = this.f27695d;
        throw new zzhg(byteBuffer == null ? 0 : byteBuffer.capacity(), i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2676fw0
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f27695d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f27698g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f27696e = false;
    }

    public final void j(int i8) {
        ByteBuffer byteBuffer = this.f27695d;
        if (byteBuffer == null) {
            this.f27695d = m(i8);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i9 = i8 + position;
        if (capacity >= i9) {
            this.f27695d = byteBuffer;
            return;
        }
        ByteBuffer m8 = m(i9);
        m8.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m8.put(byteBuffer);
        }
        this.f27695d = m8;
    }

    public final void k() {
        ByteBuffer byteBuffer = this.f27695d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f27698g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean l() {
        return d(1073741824);
    }
}
