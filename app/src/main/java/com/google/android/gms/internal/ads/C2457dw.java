package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.gms.internal.ads.dw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2457dw implements InterfaceC1143Au {

    /* renamed from: b, reason: collision with root package name */
    private int f21687b;

    /* renamed from: c, reason: collision with root package name */
    private float f21688c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f21689d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private C4737yt f21690e;

    /* renamed from: f, reason: collision with root package name */
    private C4737yt f21691f;

    /* renamed from: g, reason: collision with root package name */
    private C4737yt f21692g;

    /* renamed from: h, reason: collision with root package name */
    private C4737yt f21693h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21694i;

    /* renamed from: j, reason: collision with root package name */
    private C1216Cv f21695j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f21696k;

    /* renamed from: l, reason: collision with root package name */
    private ShortBuffer f21697l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f21698m;

    /* renamed from: n, reason: collision with root package name */
    private long f21699n;

    /* renamed from: o, reason: collision with root package name */
    private long f21700o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f21701p;

    public C2457dw() {
        C4737yt c4737yt = C4737yt.f28216e;
        this.f21690e = c4737yt;
        this.f21691f = c4737yt;
        this.f21692g = c4737yt;
        this.f21693h = c4737yt;
        ByteBuffer byteBuffer = InterfaceC1143Au.f13686a;
        this.f21696k = byteBuffer;
        this.f21697l = byteBuffer.asShortBuffer();
        this.f21698m = byteBuffer;
        this.f21687b = -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public final void a() {
        if (g()) {
            C4737yt c4737yt = this.f21690e;
            this.f21692g = c4737yt;
            C4737yt c4737yt2 = this.f21691f;
            this.f21693h = c4737yt2;
            if (this.f21694i) {
                this.f21695j = new C1216Cv(c4737yt.f28217a, c4737yt.f28218b, this.f21688c, this.f21689d, c4737yt2.f28217a);
            } else {
                C1216Cv c1216Cv = this.f21695j;
                if (c1216Cv != null) {
                    c1216Cv.c();
                }
            }
        }
        this.f21698m = InterfaceC1143Au.f13686a;
        this.f21699n = 0L;
        this.f21700o = 0L;
        this.f21701p = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C1216Cv c1216Cv = this.f21695j;
            c1216Cv.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f21699n += remaining;
            c1216Cv.f(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public final void c() {
        this.f21688c = 1.0f;
        this.f21689d = 1.0f;
        C4737yt c4737yt = C4737yt.f28216e;
        this.f21690e = c4737yt;
        this.f21691f = c4737yt;
        this.f21692g = c4737yt;
        this.f21693h = c4737yt;
        ByteBuffer byteBuffer = InterfaceC1143Au.f13686a;
        this.f21696k = byteBuffer;
        this.f21697l = byteBuffer.asShortBuffer();
        this.f21698m = byteBuffer;
        this.f21687b = -1;
        this.f21694i = false;
        this.f21695j = null;
        this.f21699n = 0L;
        this.f21700o = 0L;
        this.f21701p = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public final void d() {
        C1216Cv c1216Cv = this.f21695j;
        if (c1216Cv != null) {
            c1216Cv.e();
        }
        this.f21701p = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public final boolean e() {
        if (!this.f21701p) {
            return false;
        }
        C1216Cv c1216Cv = this.f21695j;
        return c1216Cv == null || c1216Cv.a() == 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public final C4737yt f(C4737yt c4737yt) {
        if (c4737yt.f28219c != 2) {
            throw new zzcg("Unhandled input format:", c4737yt);
        }
        int i8 = this.f21687b;
        if (i8 == -1) {
            i8 = c4737yt.f28217a;
        }
        this.f21690e = c4737yt;
        C4737yt c4737yt2 = new C4737yt(i8, c4737yt.f28218b, 2);
        this.f21691f = c4737yt2;
        this.f21694i = true;
        return c4737yt2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public final boolean g() {
        if (this.f21691f.f28217a == -1) {
            return false;
        }
        if (Math.abs(this.f21688c - 1.0f) >= 1.0E-4f || Math.abs(this.f21689d - 1.0f) >= 1.0E-4f) {
            return true;
        }
        return this.f21691f.f28217a != this.f21690e.f28217a;
    }

    public final long h(long j8) {
        long j9 = this.f21700o;
        if (j9 < 1024) {
            return (long) (this.f21688c * j8);
        }
        long j10 = this.f21699n;
        this.f21695j.getClass();
        long b8 = j10 - r3.b();
        int i8 = this.f21693h.f28217a;
        int i9 = this.f21692g.f28217a;
        return i8 == i9 ? AbstractC2301cW.M(j8, b8, j9, RoundingMode.DOWN) : AbstractC2301cW.M(j8, b8 * i8, j9 * i9, RoundingMode.DOWN);
    }

    public final void i(float f8) {
        if (this.f21689d != f8) {
            this.f21689d = f8;
            this.f21694i = true;
        }
    }

    public final void j(float f8) {
        if (this.f21688c != f8) {
            this.f21688c = f8;
            this.f21694i = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public final ByteBuffer zzb() {
        int a8;
        C1216Cv c1216Cv = this.f21695j;
        if (c1216Cv != null && (a8 = c1216Cv.a()) > 0) {
            if (this.f21696k.capacity() < a8) {
                ByteBuffer order = ByteBuffer.allocateDirect(a8).order(ByteOrder.nativeOrder());
                this.f21696k = order;
                this.f21697l = order.asShortBuffer();
            } else {
                this.f21696k.clear();
                this.f21697l.clear();
            }
            c1216Cv.d(this.f21697l);
            this.f21700o += a8;
            this.f21696k.limit(a8);
            this.f21698m = this.f21696k;
        }
        ByteBuffer byteBuffer = this.f21698m;
        this.f21698m = InterfaceC1143Au.f13686a;
        return byteBuffer;
    }
}
