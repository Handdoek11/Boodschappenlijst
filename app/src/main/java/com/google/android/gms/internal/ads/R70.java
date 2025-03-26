package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class R70 implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ U70 f18609a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ V70 f18610b;

    R70(V70 v70, U70 u70) {
        this.f18609a = u70;
        this.f18610b = v70;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        synchronized (this.f18610b) {
            this.f18610b.f19554e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        synchronized (this.f18610b) {
            try {
                this.f18610b.f19554e = null;
                this.f18610b.f19553d.addFirst(this.f18609a);
                V70 v70 = this.f18610b;
                if (v70.f19555f == 1) {
                    v70.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
