package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4463wJ {

    /* renamed from: a, reason: collision with root package name */
    private final C2508eM f27478a;

    /* renamed from: b, reason: collision with root package name */
    private final C4030sL f27479b;

    /* renamed from: c, reason: collision with root package name */
    private final C1993Yx f27480c;

    /* renamed from: d, reason: collision with root package name */
    private final PI f27481d;

    public C4463wJ(C2508eM c2508eM, C4030sL c4030sL, C1993Yx c1993Yx, PI pi) {
        this.f27478a = c2508eM;
        this.f27479b = c4030sL;
        this.f27480c = c1993Yx;
        this.f27481d = pi;
    }

    public final View a() {
        InterfaceC4410vt a8 = this.f27478a.a(D2.c2.C0(), null, null);
        a8.M().setVisibility(8);
        a8.Z0("/sendMessageToSdk", new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.qJ
            @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
            public final void a(Object obj, Map map) {
                this.f25893a.b((InterfaceC4410vt) obj, map);
            }
        });
        a8.Z0("/adMuted", new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.rJ
            @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
            public final void a(Object obj, Map map) {
                this.f26158a.c((InterfaceC4410vt) obj, map);
            }
        });
        this.f27479b.m(new WeakReference(a8), "/loadHtml", new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.sJ
            @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
            public final void a(Object obj, final Map map) {
                InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
                InterfaceC3759pu L7 = interfaceC4410vt.L();
                final C4463wJ c4463wJ = this.f26631a;
                L7.i0(new InterfaceC3541nu() { // from class: com.google.android.gms.internal.ads.vJ
                    @Override // com.google.android.gms.internal.ads.InterfaceC3541nu
                    public final void a(boolean z7, int i8, String str, String str2) {
                        c4463wJ.d(map, z7, i8, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    interfaceC4410vt.loadData(str, "text/html", "UTF-8");
                } else {
                    interfaceC4410vt.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.f27479b.m(new WeakReference(a8), "/showOverlay", new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.tJ
            @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
            public final void a(Object obj, Map map) {
                this.f26868a.e((InterfaceC4410vt) obj, map);
            }
        });
        this.f27479b.m(new WeakReference(a8), "/hideOverlay", new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.uJ
            @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
            public final void a(Object obj, Map map) {
                this.f27023a.f((InterfaceC4410vt) obj, map);
            }
        });
        return a8.M();
    }

    final /* synthetic */ void b(InterfaceC4410vt interfaceC4410vt, Map map) {
        this.f27479b.j("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(InterfaceC4410vt interfaceC4410vt, Map map) {
        this.f27481d.e();
    }

    final /* synthetic */ void d(Map map, boolean z7, int i8, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f27479b.j("sendMessageToNativeJs", hashMap);
    }

    final /* synthetic */ void e(InterfaceC4410vt interfaceC4410vt, Map map) {
        H2.p.f("Showing native ads overlay.");
        interfaceC4410vt.M().setVisibility(0);
        this.f27480c.d(true);
    }

    final /* synthetic */ void f(InterfaceC4410vt interfaceC4410vt, Map map) {
        H2.p.f("Hiding native ads overlay.");
        interfaceC4410vt.M().setVisibility(8);
        this.f27480c.d(false);
    }
}
