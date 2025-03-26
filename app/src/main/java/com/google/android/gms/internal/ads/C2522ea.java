package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ea, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2522ea extends X8 {

    /* renamed from: b, reason: collision with root package name */
    public Long f21832b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f21833c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f21834d;

    public C2522ea(String str) {
        HashMap a8 = X8.a(str);
        if (a8 != null) {
            this.f21832b = (Long) a8.get(0);
            this.f21833c = (Boolean) a8.get(1);
            this.f21834d = (Boolean) a8.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.X8
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f21832b);
        hashMap.put(1, this.f21833c);
        hashMap.put(2, this.f21834d);
        return hashMap;
    }
}
