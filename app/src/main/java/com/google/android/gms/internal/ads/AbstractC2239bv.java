package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.bv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2239bv implements InterfaceC1143Au {

    /* renamed from: b, reason: collision with root package name */
    protected C4737yt f21000b;

    /* renamed from: c, reason: collision with root package name */
    protected C4737yt f21001c;

    /* renamed from: d, reason: collision with root package name */
    private C4737yt f21002d;

    /* renamed from: e, reason: collision with root package name */
    private C4737yt f21003e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f21004f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f21005g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21006h;

    public AbstractC2239bv() {
        ByteBuffer byteBuffer = InterfaceC1143Au.f13686a;
        this.f21004f = byteBuffer;
        this.f21005g = byteBuffer;
        C4737yt c4737yt = C4737yt.f28216e;
        this.f21002d = c4737yt;
        this.f21003e = c4737yt;
        this.f21000b = c4737yt;
        this.f21001c = c4737yt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public final void a() {
        this.f21005g = InterfaceC1143Au.f13686a;
        this.f21006h = false;
        this.f21000b = this.f21002d;
        this.f21001c = this.f21003e;
        j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public final void c() {
        a();
        this.f21004f = InterfaceC1143Au.f13686a;
        C4737yt c4737yt = C4737yt.f28216e;
        this.f21002d = c4737yt;
        this.f21003e = c4737yt;
        this.f21000b = c4737yt;
        this.f21001c = c4737yt;
        l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public final void d() {
        this.f21006h = true;
        k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public boolean e() {
        return this.f21006h && this.f21005g == InterfaceC1143Au.f13686a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public final C4737yt f(C4737yt c4737yt) {
        this.f21002d = c4737yt;
        this.f21003e = h(c4737yt);
        return g() ? this.f21003e : C4737yt.f28216e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public boolean g() {
        return this.f21003e != C4737yt.f28216e;
    }

    protected abstract C4737yt h(C4737yt c4737yt);

    protected final ByteBuffer i(int i8) {
        if (this.f21004f.capacity() < i8) {
            this.f21004f = ByteBuffer.allocateDirect(i8).order(ByteOrder.nativeOrder());
        } else {
            this.f21004f.clear();
        }
        ByteBuffer byteBuffer = this.f21004f;
        this.f21005g = byteBuffer;
        return byteBuffer;
    }

    protected void j() {
    }

    protected void k() {
    }

    protected void l() {
    }

    protected final boolean m() {
        return this.f21005g.hasRemaining();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.f21005g;
        this.f21005g = InterfaceC1143Au.f13686a;
        return byteBuffer;
    }
}
