package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import f3.InterfaceC5781e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Eq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1283Eq implements InterfaceC1718Rb {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0611r0 f14782b;

    /* renamed from: d, reason: collision with root package name */
    final C1211Cq f14784d;

    /* renamed from: a, reason: collision with root package name */
    private final Object f14781a = new Object();

    /* renamed from: e, reason: collision with root package name */
    final HashSet f14785e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    final HashSet f14786f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private boolean f14787g = false;

    /* renamed from: c, reason: collision with root package name */
    private final C1247Dq f14783c = new C1247Dq();

    public C1283Eq(String str, InterfaceC0611r0 interfaceC0611r0) {
        this.f14784d = new C1211Cq(str, interfaceC0611r0);
        this.f14782b = interfaceC0611r0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1718Rb
    public final void B(boolean z7) {
        long a8 = C2.v.c().a();
        if (!z7) {
            this.f14782b.j0(a8);
            this.f14782b.i0(this.f14784d.f14240d);
            return;
        }
        if (a8 - this.f14782b.d() > ((Long) D2.A.c().a(AbstractC3184kf.f23867d1)).longValue()) {
            this.f14784d.f14240d = -1;
        } else {
            this.f14784d.f14240d = this.f14782b.a();
        }
        this.f14787g = true;
    }

    public final int a() {
        int a8;
        synchronized (this.f14781a) {
            a8 = this.f14784d.a();
        }
        return a8;
    }

    public final C4295uq b(InterfaceC5781e interfaceC5781e, String str) {
        return new C4295uq(interfaceC5781e, this, this.f14783c.a(), str);
    }

    public final String c() {
        return this.f14783c.b();
    }

    public final void d(C4295uq c4295uq) {
        synchronized (this.f14781a) {
            this.f14785e.add(c4295uq);
        }
    }

    public final void e() {
        synchronized (this.f14781a) {
            this.f14784d.c();
        }
    }

    public final void f() {
        synchronized (this.f14781a) {
            this.f14784d.d();
        }
    }

    public final void g() {
        synchronized (this.f14781a) {
            this.f14784d.e();
        }
    }

    public final void h() {
        synchronized (this.f14781a) {
            this.f14784d.f();
        }
    }

    public final void i(D2.X1 x12, long j8) {
        synchronized (this.f14781a) {
            this.f14784d.g(x12, j8);
        }
    }

    public final void j() {
        synchronized (this.f14781a) {
            this.f14784d.h();
        }
    }

    public final void k(HashSet hashSet) {
        synchronized (this.f14781a) {
            this.f14785e.addAll(hashSet);
        }
    }

    public final boolean l() {
        return this.f14787g;
    }

    public final Bundle m(Context context, C4004s70 c4004s70) {
        HashSet hashSet = new HashSet();
        synchronized (this.f14781a) {
            hashSet.addAll(this.f14785e);
            this.f14785e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f14784d.b(context, this.f14783c.b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f14786f.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.E.a(it.next());
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C4295uq) it2.next()).a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        c4004s70.b(hashSet);
        return bundle;
    }
}
