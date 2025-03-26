package com.google.android.gms.internal.ads;

import f3.InterfaceC5781e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class KN implements T80 {

    /* renamed from: s, reason: collision with root package name */
    private final BN f16580s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC5781e f16581t;

    /* renamed from: o, reason: collision with root package name */
    private final Map f16579o = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    private final Map f16582u = new HashMap();

    public KN(BN bn, Set set, InterfaceC5781e interfaceC5781e) {
        this.f16580s = bn;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            JN jn = (JN) it.next();
            this.f16582u.put(jn.f16237c, jn);
        }
        this.f16581t = interfaceC5781e;
    }

    private final void a(M80 m80, boolean z7) {
        JN jn = (JN) this.f16582u.get(m80);
        if (jn == null) {
            return;
        }
        String str = true != z7 ? "f." : "s.";
        Map map = this.f16579o;
        M80 m802 = jn.f16236b;
        if (map.containsKey(m802)) {
            long b8 = this.f16581t.b() - ((Long) this.f16579o.get(m802)).longValue();
            this.f16580s.b().put("label.".concat(jn.f16235a), str + b8);
        }
    }

    @Override // com.google.android.gms.internal.ads.T80
    public final void g(M80 m80, String str, Throwable th) {
        if (this.f16579o.containsKey(m80)) {
            long b8 = this.f16581t.b() - ((Long) this.f16579o.get(m80)).longValue();
            BN bn = this.f16580s;
            String valueOf = String.valueOf(str);
            bn.b().put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(b8))));
        }
        if (this.f16582u.containsKey(m80)) {
            a(m80, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.T80
    public final void m(M80 m80, String str) {
    }

    @Override // com.google.android.gms.internal.ads.T80
    public final void t(M80 m80, String str) {
        if (this.f16579o.containsKey(m80)) {
            long b8 = this.f16581t.b() - ((Long) this.f16579o.get(m80)).longValue();
            BN bn = this.f16580s;
            String valueOf = String.valueOf(str);
            bn.b().put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(b8))));
        }
        if (this.f16582u.containsKey(m80)) {
            a(m80, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.T80
    public final void w(M80 m80, String str) {
        this.f16579o.put(m80, Long.valueOf(this.f16581t.b()));
    }
}
