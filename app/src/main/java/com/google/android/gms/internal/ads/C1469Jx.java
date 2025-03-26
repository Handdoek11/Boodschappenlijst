package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Jx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1469Jx {

    /* renamed from: a, reason: collision with root package name */
    private final String f16464a;

    /* renamed from: b, reason: collision with root package name */
    private final C3523nl f16465b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f16466c;

    /* renamed from: d, reason: collision with root package name */
    private C1643Ox f16467d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1662Pi f16468e = new C1326Fx(this);

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1662Pi f16469f = new C1434Ix(this);

    public C1469Jx(String str, C3523nl c3523nl, Executor executor) {
        this.f16464a = str;
        this.f16465b = c3523nl;
        this.f16466c = executor;
    }

    static /* bridge */ /* synthetic */ boolean g(C1469Jx c1469Jx, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(c1469Jx.f16464a);
    }

    public final void c(C1643Ox c1643Ox) {
        this.f16465b.b("/updateActiveView", this.f16468e);
        this.f16465b.b("/untrackActiveViewUnit", this.f16469f);
        this.f16467d = c1643Ox;
    }

    public final void d(InterfaceC4410vt interfaceC4410vt) {
        interfaceC4410vt.Z0("/updateActiveView", this.f16468e);
        interfaceC4410vt.Z0("/untrackActiveViewUnit", this.f16469f);
    }

    public final void e() {
        this.f16465b.c("/updateActiveView", this.f16468e);
        this.f16465b.c("/untrackActiveViewUnit", this.f16469f);
    }

    public final void f(InterfaceC4410vt interfaceC4410vt) {
        interfaceC4410vt.G0("/updateActiveView", this.f16468e);
        interfaceC4410vt.G0("/untrackActiveViewUnit", this.f16469f);
    }
}
