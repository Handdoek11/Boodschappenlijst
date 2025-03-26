package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1182Bx implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f14044a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1218Cx f14045b;

    C1182Bx(C1218Cx c1218Cx, String str) {
        this.f14044a = str;
        this.f14045b = c1218Cx;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        C1218Cx c1218Cx = this.f14045b;
        c1218Cx.f14297y.a(c1218Cx.f14296x.d(c1218Cx.f14294v, c1218Cx.f14295w, false, this.f14044a, null, c1218Cx.N()));
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        C1218Cx c1218Cx = this.f14045b;
        c1218Cx.f14297y.a(c1218Cx.f14296x.d(c1218Cx.f14294v, c1218Cx.f14295w, false, this.f14044a, (String) obj, c1218Cx.N()));
    }
}
