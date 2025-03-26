package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Cy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1219Cy {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1436Iz f14299a;

    /* renamed from: b, reason: collision with root package name */
    private final View f14300b;

    /* renamed from: c, reason: collision with root package name */
    private final C3893r60 f14301c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4410vt f14302d;

    public C1219Cy(View view, InterfaceC4410vt interfaceC4410vt, InterfaceC1436Iz interfaceC1436Iz, C3893r60 c3893r60) {
        this.f14300b = view;
        this.f14302d = interfaceC4410vt;
        this.f14299a = interfaceC1436Iz;
        this.f14301c = c3893r60;
    }

    public final View a() {
        return this.f14300b;
    }

    public final InterfaceC4410vt b() {
        return this.f14302d;
    }

    public final InterfaceC1436Iz c() {
        return this.f14299a;
    }

    public XC d(Set set) {
        return new XC(set);
    }

    public final C3893r60 e() {
        return this.f14301c;
    }
}
