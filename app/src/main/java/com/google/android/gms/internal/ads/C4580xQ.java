package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* renamed from: com.google.android.gms.internal.ads.xQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4580xQ implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4689yQ f27857a;

    C4580xQ(C4689yQ c4689yQ) {
        this.f27857a = c4689yQ;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23854b6)).booleanValue()) {
            Matcher matcher = C4689yQ.f28111h.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f27857a.f28116e.i(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        C60 c60 = (C60) obj;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23854b6)).booleanValue()) {
            this.f27857a.f28116e.i(c60.f14101b.f13520b.f26836f);
            this.f27857a.f28116e.j(c60.f14101b.f13520b.f26837g);
        }
    }
}
