package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Wi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1907Wi implements InterfaceC1662Pi {

    /* renamed from: d, reason: collision with root package name */
    static final Map f19831d = f3.f.d(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a, reason: collision with root package name */
    private final C2.b f19832a;

    /* renamed from: b, reason: collision with root package name */
    private final C1982Ym f19833b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2657fn f19834c;

    public C1907Wi(C2.b bVar, C1982Ym c1982Ym, InterfaceC2657fn interfaceC2657fn) {
        this.f19832a = bVar;
        this.f19833b = c1982Ym;
        this.f19834c = interfaceC2657fn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        int intValue = ((Integer) f19831d.get((String) map.get("a"))).intValue();
        int i8 = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                C2.b bVar = this.f19832a;
                if (!bVar.c()) {
                    bVar.b(null);
                    return;
                }
                if (intValue == 1) {
                    this.f19833b.i(map);
                    return;
                }
                if (intValue == 3) {
                    new C2223bn(interfaceC4410vt, map).i();
                    return;
                }
                if (intValue == 4) {
                    new C1877Vm(interfaceC4410vt, map).j();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.f19833b.h(true);
                        return;
                    } else if (intValue != 7) {
                        H2.p.f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f19834c.a();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (interfaceC4410vt == null) {
            H2.p.g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i8 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i8 = parseBoolean ? -1 : 14;
        }
        interfaceC4410vt.c0(i8);
    }
}
