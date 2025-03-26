package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.yo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4728yo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f28203a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f28204b;

    /* synthetic */ C4728yo0(Map map, Map map2, AbstractC4619xo0 abstractC4619xo0) {
        this.f28203a = map;
        this.f28204b = map2;
    }

    public static C4510wo0 a() {
        return new C4510wo0(null);
    }

    public final Enum b(Object obj) {
        Enum r02 = (Enum) this.f28204b.get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object c(Enum r32) {
        Object obj = this.f28203a.get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }
}
