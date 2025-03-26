package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* renamed from: com.google.android.gms.internal.ads.qV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3823qV implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f25931a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4111t60 f25932b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3785q60 f25933c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f25934d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2306ca0 f25935e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C60 f25936f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4040sV f25937g;

    C3823qV(C4040sV c4040sV, long j8, C4111t60 c4111t60, C3785q60 c3785q60, String str, C2306ca0 c2306ca0, C60 c60) {
        this.f25931a = j8;
        this.f25932b = c4111t60;
        this.f25933c = c3785q60;
        this.f25934d = str;
        this.f25935e = c2306ca0;
        this.f25936f = c60;
        this.f25937g = c4040sV;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[PHI: r7
  0x0062: PHI (r7v1 int) = (r7v0 int), (r7v3 int), (r7v3 int), (r7v3 int) binds: [B:16:0x002f, B:21:0x004a, B:23:0x004e, B:25:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.Yj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Throwable r17) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3823qV.a(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void c(Object obj) {
        long b8 = this.f25937g.f26672a.b() - this.f25931a;
        synchronized (this.f25937g) {
            try {
                C4040sV c4040sV = this.f25937g;
                if (c4040sV.f26676e) {
                    c4040sV.f26673b.a(this.f25932b, this.f25933c, 0, null, b8);
                }
                C4040sV c4040sV2 = this.f25937g;
                if (c4040sV2.f26678g) {
                    return;
                }
                if (c4040sV2.q(this.f25933c)) {
                    ((C3931rV) this.f25937g.f26675d.get(this.f25933c)).f26184d = b8;
                } else {
                    LinkedHashMap linkedHashMap = this.f25937g.f26675d;
                    C3785q60 c3785q60 = this.f25933c;
                    linkedHashMap.put(c3785q60, new C3931rV(this.f25934d, c3785q60.f25789f0, 0, b8, null));
                }
                this.f25937g.f26677f.g(this.f25933c, b8, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
