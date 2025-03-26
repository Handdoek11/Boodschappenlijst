package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import f3.InterfaceC5781e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.sV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4040sV {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5781e f26672a;

    /* renamed from: b, reason: collision with root package name */
    private final C4258uV f26673b;

    /* renamed from: c, reason: collision with root package name */
    private final C2959ia0 f26674c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashMap f26675d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final boolean f26676e = ((Boolean) D2.A.c().a(AbstractC3184kf.f23685G6)).booleanValue();

    /* renamed from: f, reason: collision with root package name */
    private final BT f26677f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f26678g;

    /* renamed from: h, reason: collision with root package name */
    private long f26679h;

    /* renamed from: i, reason: collision with root package name */
    private long f26680i;

    public C4040sV(InterfaceC5781e interfaceC5781e, C4258uV c4258uV, BT bt, C2959ia0 c2959ia0) {
        this.f26672a = interfaceC5781e;
        this.f26673b = c4258uV;
        this.f26677f = bt;
        this.f26674c = c2959ia0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean q(C3785q60 c3785q60) {
        C3931rV c3931rV = (C3931rV) this.f26675d.get(c3785q60);
        if (c3931rV == null) {
            return false;
        }
        return c3931rV.f26183c == 8;
    }

    public final synchronized long a() {
        return this.f26679h;
    }

    final synchronized com.google.common.util.concurrent.d f(C60 c60, C3785q60 c3785q60, com.google.common.util.concurrent.d dVar, C2306ca0 c2306ca0) {
        C4111t60 c4111t60 = c60.f14101b.f13520b;
        long b8 = this.f26672a.b();
        String str = c3785q60.f25822w;
        if (str != null) {
            this.f26675d.put(c3785q60, new C3931rV(str, c3785q60.f25789f0, 9, 0L, null));
            AbstractC2326ck0.r(dVar, new C3823qV(this, b8, c4111t60, c3785q60, str, c2306ca0, c60), AbstractC1497Kq.f16650g);
        }
        return dVar;
    }

    public final synchronized String g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f26675d.entrySet().iterator();
            while (it.hasNext()) {
                C3931rV c3931rV = (C3931rV) ((Map.Entry) it.next()).getValue();
                if (c3931rV.f26183c != Integer.MAX_VALUE) {
                    arrayList.add(c3931rV.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void i(C3785q60 c3785q60) {
        try {
            this.f26679h = this.f26672a.b() - this.f26680i;
            if (c3785q60 != null) {
                this.f26677f.e(c3785q60);
            }
            this.f26678g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j() {
        this.f26679h = this.f26672a.b() - this.f26680i;
    }

    public final synchronized void k(List list) {
        this.f26680i = this.f26672a.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3785q60 c3785q60 = (C3785q60) it.next();
            if (!TextUtils.isEmpty(c3785q60.f25822w)) {
                this.f26675d.put(c3785q60, new C3931rV(c3785q60.f25822w, c3785q60.f25789f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void l() {
        this.f26680i = this.f26672a.b();
    }

    public final synchronized void m(C3785q60 c3785q60) {
        C3931rV c3931rV = (C3931rV) this.f26675d.get(c3785q60);
        if (c3931rV == null || this.f26678g) {
            return;
        }
        c3931rV.f26183c = 8;
    }
}
