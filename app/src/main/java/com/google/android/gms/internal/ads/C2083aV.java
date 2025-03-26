package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2083aV implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3785q60 f20708a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2300cV f20709b;

    C2083aV(C2300cV c2300cV, C3785q60 c3785q60) {
        this.f20708a = c3785q60;
        this.f20709b = c2300cV;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        synchronized (this.f20709b) {
            try {
                this.f20709b.f21204h.b(th, this.f20708a);
                C3785q60 a8 = this.f20709b.f21204h.a();
                if (this.f20708a.f25821v0) {
                    while (a8 != null) {
                        this.f20709b.e(a8);
                        a8 = this.f20709b.f21204h.a();
                    }
                } else if (a8 != null) {
                    this.f20709b.e(a8);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        InterfaceC4149tV interfaceC4149tV = (InterfaceC4149tV) obj;
        synchronized (this.f20709b) {
            try {
                this.f20709b.f21204h.c(interfaceC4149tV, this.f20708a);
                C3785q60 a8 = this.f20709b.f21204h.a();
                if (a8 != null) {
                    this.f20709b.e(a8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
