package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class Z8 extends X8 {

    /* renamed from: b, reason: collision with root package name */
    public String f20421b;

    /* renamed from: c, reason: collision with root package name */
    public long f20422c;

    /* renamed from: d, reason: collision with root package name */
    public String f20423d;

    /* renamed from: e, reason: collision with root package name */
    public String f20424e;

    /* renamed from: f, reason: collision with root package name */
    public String f20425f;

    public Z8(String str) {
        this.f20421b = "E";
        this.f20422c = -1L;
        this.f20423d = "E";
        this.f20424e = "E";
        this.f20425f = "E";
        HashMap a8 = X8.a(str);
        if (a8 != null) {
            this.f20421b = a8.get(0) == null ? "E" : (String) a8.get(0);
            this.f20422c = a8.get(1) != null ? ((Long) a8.get(1)).longValue() : -1L;
            this.f20423d = a8.get(2) == null ? "E" : (String) a8.get(2);
            this.f20424e = a8.get(3) == null ? "E" : (String) a8.get(3);
            this.f20425f = a8.get(4) != null ? (String) a8.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.X8
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f20421b);
        hashMap.put(4, this.f20425f);
        hashMap.put(3, this.f20424e);
        hashMap.put(2, this.f20423d);
        hashMap.put(1, Long.valueOf(this.f20422c));
        return hashMap;
    }
}
