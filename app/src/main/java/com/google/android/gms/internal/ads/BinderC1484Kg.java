package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import i3.BinderC5853b;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.Kg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1484Kg extends AbstractBinderC1903Wg {

    /* renamed from: o, reason: collision with root package name */
    private final Drawable f16612o;

    /* renamed from: s, reason: collision with root package name */
    private final Uri f16613s;

    /* renamed from: t, reason: collision with root package name */
    private final double f16614t;

    /* renamed from: u, reason: collision with root package name */
    private final int f16615u;

    /* renamed from: v, reason: collision with root package name */
    private final int f16616v;

    public BinderC1484Kg(Drawable drawable, Uri uri, double d8, int i8, int i9) {
        this.f16612o = drawable;
        this.f16613s = uri;
        this.f16614t = d8;
        this.f16615u = i8;
        this.f16616v = i9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1938Xg
    public final int a() {
        return this.f16616v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1938Xg
    public final Uri b() {
        return this.f16613s;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1938Xg
    public final InterfaceC5852a c() {
        return BinderC5853b.p2(this.f16612o);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1938Xg
    public final int d() {
        return this.f16615u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1938Xg
    public final double zzb() {
        return this.f16614t;
    }
}
