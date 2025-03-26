package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class VQ implements JD {

    /* renamed from: o, reason: collision with root package name */
    private final Context f19590o;

    /* renamed from: s, reason: collision with root package name */
    private final C1950Xp f19591s;

    VQ(Context context, C1950Xp c1950Xp) {
        this.f19590o = context;
        this.f19591s = c1950Xp;
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void Q(C4618xo c4618xo) {
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void T0(C60 c60) {
        if (TextUtils.isEmpty(c60.f14101b.f13520b.f26835e)) {
            return;
        }
        this.f19591s.m(this.f19590o, c60.f14100a.f28044a.f16766d);
        this.f19591s.i(this.f19590o, c60.f14101b.f13520b.f26835e);
    }
}
