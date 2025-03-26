package com.google.firebase.analytics.connector.internal;

import e4.InterfaceC5746a;
import java.util.HashSet;
import java.util.Set;
import v3.C6835a;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    Set f32713a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC5746a.b f32714b;

    /* renamed from: c, reason: collision with root package name */
    private C6835a f32715c;

    /* renamed from: d, reason: collision with root package name */
    private c f32716d;

    public d(C6835a c6835a, InterfaceC5746a.b bVar) {
        this.f32714b = bVar;
        this.f32715c = c6835a;
        c cVar = new c(this);
        this.f32716d = cVar;
        this.f32715c.q(cVar);
        this.f32713a = new HashSet();
    }
}
