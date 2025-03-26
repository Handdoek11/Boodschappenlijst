package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Ip0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f16002a;

    /* renamed from: b, reason: collision with root package name */
    private final Gp0 f16003b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f16004c;

    /* renamed from: d, reason: collision with root package name */
    private final Qo0 f16005d;

    /* synthetic */ Ip0(Map map, List list, Gp0 gp0, Qo0 qo0, Class cls, Hp0 hp0) {
        this.f16002a = map;
        this.f16003b = gp0;
        this.f16004c = cls;
        this.f16005d = qo0;
    }

    public static Fp0 b(Class cls) {
        return new Fp0(cls, null);
    }

    public final Qo0 a() {
        return this.f16005d;
    }

    public final Gp0 c() {
        return this.f16003b;
    }

    public final Class d() {
        return this.f16004c;
    }

    public final Collection e() {
        return this.f16002a.values();
    }

    public final List f(byte[] bArr) {
        List list = (List) this.f16002a.get(Tt0.b(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean g() {
        return !this.f16005d.a().isEmpty();
    }
}
