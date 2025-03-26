package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class Yx0 {

    /* renamed from: a, reason: collision with root package name */
    final LinkedHashMap f20361a;

    Yx0(int i8) {
        this.f20361a = AbstractC2137ay0.b(i8);
    }

    final Yx0 a(Object obj, InterfaceC3441my0 interfaceC3441my0) {
        AbstractC3332ly0.a(obj, "key");
        AbstractC3332ly0.a(interfaceC3441my0, "provider");
        this.f20361a.put(obj, interfaceC3441my0);
        return this;
    }
}
