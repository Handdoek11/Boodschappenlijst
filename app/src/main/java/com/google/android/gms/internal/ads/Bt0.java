package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class Bt0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Bt0 f13912b = new Bt0(new Ct0());

    /* renamed from: c, reason: collision with root package name */
    public static final Bt0 f13913c = new Bt0(new Gt0());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4847zt0 f13914a;

    static {
        new Bt0(new It0());
        new Bt0(new Ht0());
        new Bt0(new Dt0());
        new Bt0(new Ft0());
        new Bt0(new Et0());
    }

    public Bt0(Jt0 jt0) {
        this.f13914a = !AbstractC4292uo0.b() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new C4520wt0(jt0, null) : new C4629xt0(jt0, null) : new C4738yt0(jt0, null);
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        return this.f13914a.n(str);
    }
}
