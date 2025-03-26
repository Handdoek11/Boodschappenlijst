package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class Q9 extends X8 {

    /* renamed from: b, reason: collision with root package name */
    public Long f18380b;

    /* renamed from: c, reason: collision with root package name */
    public Long f18381c;

    /* renamed from: d, reason: collision with root package name */
    public Long f18382d;

    public Q9(String str) {
        HashMap a8 = X8.a(str);
        if (a8 != null) {
            this.f18380b = (Long) a8.get(0);
            this.f18381c = (Long) a8.get(1);
            this.f18382d = (Long) a8.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.X8
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f18380b);
        hashMap.put(1, this.f18381c);
        hashMap.put(2, this.f18382d);
        return hashMap;
    }
}
