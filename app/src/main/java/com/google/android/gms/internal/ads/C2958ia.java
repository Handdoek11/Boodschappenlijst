package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ia, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2958ia extends X8 {

    /* renamed from: b, reason: collision with root package name */
    public Long f22991b;

    /* renamed from: c, reason: collision with root package name */
    public Long f22992c;

    public C2958ia(String str) {
        HashMap a8 = X8.a(str);
        if (a8 != null) {
            this.f22991b = (Long) a8.get(0);
            this.f22992c = (Long) a8.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.X8
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f22991b);
        hashMap.put(1, this.f22992c);
        return hashMap;
    }
}
