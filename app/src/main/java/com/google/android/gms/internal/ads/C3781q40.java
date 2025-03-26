package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q40, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3781q40 implements IX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC3889r40 f25711a;

    C3781q40(BinderC3889r40 binderC3889r40) {
        this.f25711a = binderC3889r40;
    }

    @Override // com.google.android.gms.internal.ads.IX
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        C3767py c3767py = (C3767py) obj;
        synchronized (this.f25711a) {
            try {
                C3767py c3767py2 = this.f25711a.f26071B;
                if (c3767py2 != null) {
                    c3767py2.a();
                }
                BinderC3889r40 binderC3889r40 = this.f25711a;
                binderC3889r40.f26071B = c3767py;
                c3767py.j(binderC3889r40);
                BinderC3889r40 binderC3889r402 = this.f25711a;
                binderC3889r402.f26077w.i(new BinderC3876qy(c3767py, binderC3889r402, binderC3889r402.f26077w, binderC3889r402.f26079y));
                c3767py.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.IX
    public final void zza() {
        synchronized (this.f25711a) {
            this.f25711a.f26071B = null;
        }
    }
}
