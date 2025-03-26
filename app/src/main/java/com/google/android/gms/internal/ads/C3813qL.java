package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3813qL implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f25900a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25901b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1662Pi f25902c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4030sL f25903d;

    /* synthetic */ C3813qL(C4030sL c4030sL, WeakReference weakReference, String str, InterfaceC1662Pi interfaceC1662Pi, AbstractC3921rL abstractC3921rL) {
        this.f25903d = c4030sL;
        this.f25900a = weakReference;
        this.f25901b = str;
        this.f25902c = interfaceC1662Pi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final void a(Object obj, Map map) {
        Object obj2 = this.f25900a.get();
        if (obj2 == null) {
            this.f25903d.n(this.f25901b, this);
        } else {
            this.f25902c.a(obj2, map);
        }
    }
}
