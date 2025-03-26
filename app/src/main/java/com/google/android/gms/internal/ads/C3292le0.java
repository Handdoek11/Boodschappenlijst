package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.le0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3292le0 extends AbstractC3738pj0 {

    /* renamed from: y, reason: collision with root package name */
    Object f24358y;

    C3292le0(Object obj, Runnable runnable) {
        this.f24358y = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    public final String c() {
        Object obj = this.f24358y;
        return obj == null ? "" : obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    protected final void d() {
        this.f24358y = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    public final boolean e(Object obj) {
        return super.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    public final boolean h(Throwable th) {
        return super.h(th);
    }
}
