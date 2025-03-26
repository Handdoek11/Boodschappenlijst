package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2697g60 implements IX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC2806h60 f22233a;

    C2697g60(BinderC2806h60 binderC2806h60) {
        this.f22233a = binderC2806h60;
    }

    @Override // com.google.android.gms.internal.ads.IX
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        IL il = (IL) obj;
        synchronized (this.f22233a) {
            try {
                this.f22233a.f22489z = il;
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23674F3)).booleanValue()) {
                    il.k().f14643a = this.f22233a.f22484u;
                }
                this.f22233a.f22489z.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.IX
    public final void zza() {
        synchronized (this.f22233a) {
            this.f22233a.f22489z = null;
        }
    }
}
