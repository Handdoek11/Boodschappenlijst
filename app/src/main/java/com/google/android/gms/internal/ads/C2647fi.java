package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.fi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2647fi implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2756gi f22098a;

    public C2647fi(InterfaceC2756gi interfaceC2756gi) {
        this.f22098a = interfaceC2756gi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final void a(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            H2.p.g("App event with no name parameter.");
        } else {
            this.f22098a.m(str, (String) map.get("info"));
        }
    }
}
