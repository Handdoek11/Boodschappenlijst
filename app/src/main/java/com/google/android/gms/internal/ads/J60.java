package com.google.android.gms.internal.ads;

import D2.C0521m0;
import D2.InterfaceC0509i0;
import android.os.Bundle;
import java.util.ArrayList;
import z2.C7066a;
import z2.C7071f;

/* loaded from: classes.dex */
public final class J60 {

    /* renamed from: a, reason: collision with root package name */
    private D2.X1 f16117a;

    /* renamed from: b, reason: collision with root package name */
    private D2.c2 f16118b;

    /* renamed from: c, reason: collision with root package name */
    private String f16119c;

    /* renamed from: d, reason: collision with root package name */
    private D2.Q1 f16120d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16121e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f16122f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f16123g;

    /* renamed from: h, reason: collision with root package name */
    private C1553Mg f16124h;

    /* renamed from: i, reason: collision with root package name */
    private D2.i2 f16125i;

    /* renamed from: j, reason: collision with root package name */
    private C7066a f16126j;

    /* renamed from: k, reason: collision with root package name */
    private C7071f f16127k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC0509i0 f16128l;

    /* renamed from: n, reason: collision with root package name */
    private C1874Vj f16130n;

    /* renamed from: r, reason: collision with root package name */
    private C4042sX f16134r;

    /* renamed from: t, reason: collision with root package name */
    private Bundle f16136t;

    /* renamed from: u, reason: collision with root package name */
    private C0521m0 f16137u;

    /* renamed from: m, reason: collision with root package name */
    private int f16129m = 1;

    /* renamed from: o, reason: collision with root package name */
    private final C4329v60 f16131o = new C4329v60();

    /* renamed from: p, reason: collision with root package name */
    private boolean f16132p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f16133q = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f16135s = false;

    public final D2.X1 B() {
        return this.f16117a;
    }

    public final D2.c2 D() {
        return this.f16118b;
    }

    public final C4329v60 L() {
        return this.f16131o;
    }

    public final J60 M(L60 l60) {
        this.f16131o.a(l60.f16777o.f27749a);
        this.f16117a = l60.f16766d;
        this.f16118b = l60.f16767e;
        this.f16137u = l60.f16782t;
        this.f16119c = l60.f16768f;
        this.f16120d = l60.f16763a;
        this.f16122f = l60.f16769g;
        this.f16123g = l60.f16770h;
        this.f16124h = l60.f16771i;
        this.f16125i = l60.f16772j;
        N(l60.f16774l);
        g(l60.f16775m);
        this.f16132p = l60.f16778p;
        this.f16133q = l60.f16779q;
        this.f16134r = l60.f16765c;
        this.f16135s = l60.f16780r;
        this.f16136t = l60.f16781s;
        return this;
    }

    public final J60 N(C7066a c7066a) {
        this.f16126j = c7066a;
        if (c7066a != null) {
            this.f16121e = c7066a.A0();
        }
        return this;
    }

    public final J60 O(D2.c2 c2Var) {
        this.f16118b = c2Var;
        return this;
    }

    public final J60 P(String str) {
        this.f16119c = str;
        return this;
    }

    public final J60 Q(D2.i2 i2Var) {
        this.f16125i = i2Var;
        return this;
    }

    public final J60 R(C4042sX c4042sX) {
        this.f16134r = c4042sX;
        return this;
    }

    public final J60 S(C1874Vj c1874Vj) {
        this.f16130n = c1874Vj;
        this.f16120d = new D2.Q1(false, true, false);
        return this;
    }

    public final J60 T(boolean z7) {
        this.f16132p = z7;
        return this;
    }

    public final J60 U(boolean z7) {
        this.f16133q = z7;
        return this;
    }

    public final J60 V(boolean z7) {
        this.f16135s = true;
        return this;
    }

    public final J60 a(Bundle bundle) {
        this.f16136t = bundle;
        return this;
    }

    public final J60 b(boolean z7) {
        this.f16121e = z7;
        return this;
    }

    public final J60 c(int i8) {
        this.f16129m = i8;
        return this;
    }

    public final J60 d(C1553Mg c1553Mg) {
        this.f16124h = c1553Mg;
        return this;
    }

    public final J60 e(ArrayList arrayList) {
        this.f16122f = arrayList;
        return this;
    }

    public final J60 f(ArrayList arrayList) {
        this.f16123g = arrayList;
        return this;
    }

    public final J60 g(C7071f c7071f) {
        this.f16127k = c7071f;
        if (c7071f != null) {
            this.f16121e = c7071f.a();
            this.f16128l = c7071f.A0();
        }
        return this;
    }

    public final J60 h(D2.X1 x12) {
        this.f16117a = x12;
        return this;
    }

    public final J60 i(D2.Q1 q12) {
        this.f16120d = q12;
        return this;
    }

    public final L60 j() {
        Z2.r.m(this.f16119c, "ad unit must not be null");
        Z2.r.m(this.f16118b, "ad size must not be null");
        Z2.r.m(this.f16117a, "ad request must not be null");
        return new L60(this, null);
    }

    public final String l() {
        return this.f16119c;
    }

    public final boolean s() {
        return this.f16132p;
    }

    public final boolean t() {
        return this.f16133q;
    }

    public final J60 v(C0521m0 c0521m0) {
        this.f16137u = c0521m0;
        return this;
    }
}
