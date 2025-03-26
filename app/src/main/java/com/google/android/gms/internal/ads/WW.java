package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class WW implements IX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ XW f19804a;

    WW(XW xw) {
        this.f19804a = xw;
    }

    @Override // com.google.android.gms.internal.ads.IX
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        AbstractC4420vy abstractC4420vy = (AbstractC4420vy) obj;
        synchronized (this.f19804a) {
            try {
                XW xw = this.f19804a;
                if (xw.f20063z != null) {
                    xw.f20063z.a();
                }
                this.f19804a.f20063z = abstractC4420vy;
                this.f19804a.f20063z.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.IX
    public final void zza() {
        synchronized (this.f19804a) {
            this.f19804a.f20063z = null;
        }
    }
}
