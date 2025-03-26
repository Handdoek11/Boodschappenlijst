package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.dV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2409dV {

    /* renamed from: c, reason: collision with root package name */
    private final C4611xk0 f21568c;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC4149tV f21571f;

    /* renamed from: h, reason: collision with root package name */
    private final String f21573h;

    /* renamed from: i, reason: collision with root package name */
    private final int f21574i;

    /* renamed from: j, reason: collision with root package name */
    private final C4040sV f21575j;

    /* renamed from: k, reason: collision with root package name */
    private C3785q60 f21576k;

    /* renamed from: a, reason: collision with root package name */
    private final Map f21566a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f21567b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f21569d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f21570e = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private int f21572g = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21577l = false;

    C2409dV(C60 c60, C4040sV c4040sV, C4611xk0 c4611xk0) {
        this.f21574i = c60.f14101b.f13520b.f26848r;
        this.f21575j = c4040sV;
        this.f21568c = c4611xk0;
        this.f21573h = C4694yV.d(c60);
        List list = c60.f14101b.f13519a;
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f21566a.put((C3785q60) list.get(i8), Integer.valueOf(i8));
        }
        this.f21567b.addAll(list);
    }

    private final synchronized void e() {
        this.f21575j.i(this.f21576k);
        InterfaceC4149tV interfaceC4149tV = this.f21571f;
        if (interfaceC4149tV != null) {
            this.f21568c.e(interfaceC4149tV);
        } else {
            this.f21568c.h(new zzegu(3, this.f21573h));
        }
    }

    private final synchronized boolean f(boolean z7) {
        try {
            for (C3785q60 c3785q60 : this.f21567b) {
                Integer num = (Integer) this.f21566a.get(c3785q60);
                int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z7 || !this.f21570e.contains(c3785q60.f25817t0)) {
                    int i8 = this.f21572g;
                    if (intValue < i8) {
                        return true;
                    }
                    if (intValue > i8) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean g() {
        try {
            Iterator it = this.f21569d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.f21566a.get((C3785q60) it.next());
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.f21572g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean h() {
        if (!f(true)) {
            if (!g()) {
                return false;
            }
        }
        return true;
    }

    private final synchronized boolean i() {
        if (this.f21577l) {
            return false;
        }
        if (!this.f21567b.isEmpty() && ((C3785q60) this.f21567b.get(0)).f25821v0 && !this.f21569d.isEmpty()) {
            return false;
        }
        if (!d()) {
            List list = this.f21569d;
            if (list.size() < this.f21574i) {
                if (f(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    final synchronized C3785q60 a() {
        try {
            if (i()) {
                for (int i8 = 0; i8 < this.f21567b.size(); i8++) {
                    C3785q60 c3785q60 = (C3785q60) this.f21567b.get(i8);
                    String str = c3785q60.f25817t0;
                    if (!this.f21570e.contains(str)) {
                        if (c3785q60.f25821v0) {
                            this.f21577l = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.f21570e.add(str);
                        }
                        this.f21569d.add(c3785q60);
                        return (C3785q60) this.f21567b.remove(i8);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void b(Throwable th, C3785q60 c3785q60) {
        this.f21577l = false;
        this.f21569d.remove(c3785q60);
        this.f21570e.remove(c3785q60.f25817t0);
        if (d() || h()) {
            return;
        }
        e();
    }

    final synchronized void c(InterfaceC4149tV interfaceC4149tV, C3785q60 c3785q60) {
        this.f21577l = false;
        this.f21569d.remove(c3785q60);
        if (d()) {
            interfaceC4149tV.r();
            return;
        }
        Integer num = (Integer) this.f21566a.get(c3785q60);
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (intValue > this.f21572g) {
            this.f21575j.m(c3785q60);
            return;
        }
        if (this.f21571f != null) {
            this.f21575j.m(this.f21576k);
        }
        this.f21572g = intValue;
        this.f21571f = interfaceC4149tV;
        this.f21576k = c3785q60;
        if (h()) {
            return;
        }
        e();
    }

    final synchronized boolean d() {
        return this.f21568c.isDone();
    }
}
