package com.google.android.gms.internal.ads;

import M2.AbstractC0656c;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import w2.EnumC6877c;

/* renamed from: com.google.android.gms.internal.ads.n90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3464n90 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    private final RunnableC3791q90 f24885s;

    /* renamed from: t, reason: collision with root package name */
    private String f24886t;

    /* renamed from: v, reason: collision with root package name */
    private String f24888v;

    /* renamed from: w, reason: collision with root package name */
    private A60 f24889w;

    /* renamed from: x, reason: collision with root package name */
    private D2.W0 f24890x;

    /* renamed from: y, reason: collision with root package name */
    private Future f24891y;

    /* renamed from: o, reason: collision with root package name */
    private final List f24884o = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    private int f24892z = 2;

    /* renamed from: u, reason: collision with root package name */
    private EnumC4008s90 f24887u = EnumC4008s90.SCAR_REQUEST_TYPE_UNSPECIFIED;

    RunnableC3464n90(RunnableC3791q90 runnableC3791q90) {
        this.f24885s = runnableC3791q90;
    }

    public final synchronized RunnableC3464n90 a(InterfaceC2160b90 interfaceC2160b90) {
        try {
            if (((Boolean) AbstractC2534eg.f21867c.e()).booleanValue()) {
                List list = this.f24884o;
                interfaceC2160b90.h();
                list.add(interfaceC2160b90);
                Future future = this.f24891y;
                if (future != null) {
                    future.cancel(false);
                }
                this.f24891y = AbstractC1497Kq.f16647d.schedule(this, ((Integer) D2.A.c().a(AbstractC3184kf.H8)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized RunnableC3464n90 b(String str) {
        if (((Boolean) AbstractC2534eg.f21867c.e()).booleanValue() && AbstractC3355m90.e(str)) {
            this.f24886t = str;
        }
        return this;
    }

    public final synchronized RunnableC3464n90 c(D2.W0 w02) {
        if (((Boolean) AbstractC2534eg.f21867c.e()).booleanValue()) {
            this.f24890x = w02;
        }
        return this;
    }

    public final synchronized RunnableC3464n90 d(ArrayList arrayList) {
        try {
            if (((Boolean) AbstractC2534eg.f21867c.e()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(EnumC6877c.BANNER.name())) {
                    this.f24892z = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(EnumC6877c.INTERSTITIAL.name())) {
                    this.f24892z = 4;
                } else if (arrayList.contains("native") || arrayList.contains(EnumC6877c.NATIVE.name())) {
                    this.f24892z = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(EnumC6877c.REWARDED.name())) {
                    this.f24892z = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.f24892z = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(EnumC6877c.REWARDED_INTERSTITIAL.name())) {
                    this.f24892z = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized RunnableC3464n90 e(String str) {
        if (((Boolean) AbstractC2534eg.f21867c.e()).booleanValue()) {
            this.f24888v = str;
        }
        return this;
    }

    public final synchronized RunnableC3464n90 f(Bundle bundle) {
        if (((Boolean) AbstractC2534eg.f21867c.e()).booleanValue()) {
            this.f24887u = AbstractC0656c.a(bundle);
        }
        return this;
    }

    public final synchronized RunnableC3464n90 g(A60 a60) {
        if (((Boolean) AbstractC2534eg.f21867c.e()).booleanValue()) {
            this.f24889w = a60;
        }
        return this;
    }

    public final synchronized void h() {
        try {
            if (((Boolean) AbstractC2534eg.f21867c.e()).booleanValue()) {
                Future future = this.f24891y;
                if (future != null) {
                    future.cancel(false);
                }
                for (InterfaceC2160b90 interfaceC2160b90 : this.f24884o) {
                    int i8 = this.f24892z;
                    if (i8 != 2) {
                        interfaceC2160b90.x(i8);
                    }
                    if (!TextUtils.isEmpty(this.f24886t)) {
                        interfaceC2160b90.n(this.f24886t);
                    }
                    if (!TextUtils.isEmpty(this.f24888v) && !interfaceC2160b90.j()) {
                        interfaceC2160b90.Z(this.f24888v);
                    }
                    A60 a60 = this.f24889w;
                    if (a60 != null) {
                        interfaceC2160b90.a(a60);
                    } else {
                        D2.W0 w02 = this.f24890x;
                        if (w02 != null) {
                            interfaceC2160b90.o(w02);
                        }
                    }
                    interfaceC2160b90.b(this.f24887u);
                    this.f24885s.b(interfaceC2160b90.k());
                }
                this.f24884o.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized RunnableC3464n90 i(int i8) {
        if (((Boolean) AbstractC2534eg.f21867c.e()).booleanValue()) {
            this.f24892z = i8;
        }
        return this;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
