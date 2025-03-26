package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3240l60 implements IX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC3458n60 f24274a;

    C3240l60(BinderC3458n60 binderC3458n60) {
        this.f24274a = binderC3458n60;
    }

    @Override // com.google.android.gms.internal.ads.IX
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        IL il = (IL) obj;
        synchronized (this.f24274a) {
            try {
                this.f24274a.f24881u = il;
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23674F3)).booleanValue()) {
                    il.k().f14643a = this.f24274a.f24880t;
                }
                this.f24274a.f24881u.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.IX
    public final void zza() {
        synchronized (this.f24274a) {
            this.f24274a.f24881u = null;
        }
    }
}
