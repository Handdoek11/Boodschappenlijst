package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.sa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4045sa extends X8 {

    /* renamed from: b, reason: collision with root package name */
    public Long f26700b;

    /* renamed from: c, reason: collision with root package name */
    public Long f26701c;

    /* renamed from: d, reason: collision with root package name */
    public Long f26702d;

    /* renamed from: e, reason: collision with root package name */
    public Long f26703e;

    /* renamed from: f, reason: collision with root package name */
    public Long f26704f;

    public C4045sa(String str) {
        HashMap a8 = X8.a(str);
        if (a8 != null) {
            this.f26700b = (Long) a8.get(0);
            this.f26701c = (Long) a8.get(1);
            this.f26702d = (Long) a8.get(2);
            this.f26703e = (Long) a8.get(3);
            this.f26704f = (Long) a8.get(4);
        }
    }

    @Override // com.google.android.gms.internal.ads.X8
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f26700b);
        hashMap.put(1, this.f26701c);
        hashMap.put(2, this.f26702d);
        hashMap.put(3, this.f26703e);
        hashMap.put(4, this.f26704f);
        return hashMap;
    }
}
