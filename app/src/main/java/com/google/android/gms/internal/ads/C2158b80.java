package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2158b80 {

    /* renamed from: a, reason: collision with root package name */
    private final U70 f20819a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.common.util.concurrent.d f20820b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20821c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20822d = false;

    public C2158b80(final InterfaceC4658y70 interfaceC4658y70, final T70 t70, final U70 u70) {
        this.f20819a = u70;
        this.f20820b = AbstractC2326ck0.f(AbstractC2326ck0.n(t70.a(u70), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.Z70
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f20417a.b(t70, interfaceC4658y70, u70, (I70) obj);
            }
        }, u70.zzb()), Exception.class, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.a80
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f20640a.c(t70, (Exception) obj);
            }
        }, u70.zzb());
    }

    public final synchronized com.google.common.util.concurrent.d a(U70 u70) {
        if (!this.f20822d && !this.f20821c && this.f20819a.zza() != null && u70.zza() != null && this.f20819a.zza().equals(u70.zza())) {
            this.f20821c = true;
            return this.f20820b;
        }
        return null;
    }

    final /* synthetic */ com.google.common.util.concurrent.d b(T70 t70, InterfaceC4658y70 interfaceC4658y70, U70 u70, I70 i70) {
        synchronized (this) {
            try {
                this.f20822d = true;
                t70.b(i70);
                if (this.f20821c) {
                    return AbstractC2326ck0.h(new S70(i70, u70));
                }
                interfaceC4658y70.d(u70.zza(), i70);
                return AbstractC2326ck0.h(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.d c(T70 t70, Exception exc) {
        synchronized (this) {
            this.f20822d = true;
            throw exc;
        }
    }

    public final synchronized void d(Yj0 yj0) {
        AbstractC2326ck0.r(AbstractC2326ck0.n(this.f20820b, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.Y70
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return AbstractC2326ck0.i();
            }
        }, this.f20819a.zzb()), yj0, this.f20819a.zzb());
    }
}
