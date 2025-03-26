package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class U9 extends X8 {

    /* renamed from: b, reason: collision with root package name */
    public long f19311b;

    /* renamed from: c, reason: collision with root package name */
    public long f19312c;

    public U9(String str) {
        this.f19311b = -1L;
        this.f19312c = -1L;
        HashMap a8 = X8.a(str);
        if (a8 != null) {
            this.f19311b = ((Long) a8.get(0)).longValue();
            this.f19312c = ((Long) a8.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.X8
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.f19311b));
        hashMap.put(1, Long.valueOf(this.f19312c));
        return hashMap;
    }
}
