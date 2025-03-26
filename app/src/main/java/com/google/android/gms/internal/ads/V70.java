package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class V70 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4658y70 f19550a;

    /* renamed from: b, reason: collision with root package name */
    private final T70 f19551b;

    /* renamed from: c, reason: collision with root package name */
    private final C4222u70 f19552c;

    /* renamed from: e, reason: collision with root package name */
    private C2158b80 f19554e;

    /* renamed from: f, reason: collision with root package name */
    private int f19555f = 1;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque f19553d = new ArrayDeque();

    public V70(InterfaceC4658y70 interfaceC4658y70, C4222u70 c4222u70, T70 t70) {
        this.f19550a = interfaceC4658y70;
        this.f19552c = c4222u70;
        this.f19551b = t70;
        c4222u70.b(new Q70(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void h() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23881e6)).booleanValue() && !C2.v.s().j().g().h()) {
            this.f19553d.clear();
            return;
        }
        if (i()) {
            while (!this.f19553d.isEmpty()) {
                U70 u70 = (U70) this.f19553d.pollFirst();
                if (u70 == null || (u70.zza() != null && this.f19550a.a(u70.zza()))) {
                    C2158b80 c2158b80 = new C2158b80(this.f19550a, this.f19551b, u70);
                    this.f19554e = c2158b80;
                    c2158b80.d(new R70(this, u70));
                    return;
                }
            }
        }
    }

    private final synchronized boolean i() {
        return this.f19554e == null;
    }

    public final synchronized com.google.common.util.concurrent.d a(U70 u70) {
        this.f19555f = 2;
        if (i()) {
            return null;
        }
        return this.f19554e.a(u70);
    }

    public final synchronized void e(U70 u70) {
        this.f19553d.add(u70);
    }

    final /* synthetic */ void f() {
        synchronized (this) {
            this.f19555f = 1;
            h();
        }
    }
}
