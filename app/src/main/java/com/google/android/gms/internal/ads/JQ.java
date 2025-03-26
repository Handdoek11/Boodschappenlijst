package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzba;

/* loaded from: classes.dex */
final class JQ implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f16245a;

    JQ(Context context) {
        this.f16245a = context;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        if (((Boolean) AbstractC2426dg.f21633h.e()).booleanValue() && (th instanceof zzba)) {
            AbstractC1829Ue.e(this.f16245a);
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        if (((Boolean) AbstractC2426dg.f21635j.e()).booleanValue()) {
            AbstractC1829Ue.e(this.f16245a);
        }
    }
}
