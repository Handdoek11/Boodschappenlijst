package com.google.android.gms.measurement.internal;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
final class I5 {

    /* renamed from: a, reason: collision with root package name */
    private String f30555a;

    /* renamed from: b, reason: collision with root package name */
    private Map f30556b;

    /* renamed from: c, reason: collision with root package name */
    private w3.C f30557c;

    I5(String str, w3.C c8) {
        this.f30555a = str;
        this.f30557c = c8;
    }

    public final w3.C a() {
        return this.f30557c;
    }

    public final String b() {
        return this.f30555a;
    }

    public final Map c() {
        Map map = this.f30556b;
        return map == null ? Collections.emptyMap() : map;
    }

    I5(String str, Map map, w3.C c8) {
        this.f30555a = str;
        this.f30556b = map;
        this.f30557c = c8;
    }
}
