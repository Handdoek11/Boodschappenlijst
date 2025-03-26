package com.google.android.gms.internal.ads;

import D2.C0521m0;
import D2.InterfaceC0509i0;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import z2.C7066a;
import z2.C7070e;
import z2.C7071f;

/* loaded from: classes.dex */
public final class L60 {

    /* renamed from: a, reason: collision with root package name */
    public final D2.Q1 f16763a;

    /* renamed from: b, reason: collision with root package name */
    public final C1874Vj f16764b;

    /* renamed from: c, reason: collision with root package name */
    public final C4042sX f16765c;

    /* renamed from: d, reason: collision with root package name */
    public final D2.X1 f16766d;

    /* renamed from: e, reason: collision with root package name */
    public final D2.c2 f16767e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16768f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f16769g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f16770h;

    /* renamed from: i, reason: collision with root package name */
    public final C1553Mg f16771i;

    /* renamed from: j, reason: collision with root package name */
    public final D2.i2 f16772j;

    /* renamed from: k, reason: collision with root package name */
    public final int f16773k;

    /* renamed from: l, reason: collision with root package name */
    public final C7066a f16774l;

    /* renamed from: m, reason: collision with root package name */
    public final C7071f f16775m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0509i0 f16776n;

    /* renamed from: o, reason: collision with root package name */
    public final C4547x60 f16777o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f16778p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f16779q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f16780r;

    /* renamed from: s, reason: collision with root package name */
    public final Bundle f16781s;

    /* renamed from: t, reason: collision with root package name */
    public final C0521m0 f16782t;

    /* synthetic */ L60(J60 j60, K60 k60) {
        this.f16767e = j60.f16118b;
        this.f16768f = j60.f16119c;
        this.f16782t = j60.f16137u;
        int i8 = j60.f16117a.f1186o;
        long j8 = j60.f16117a.f1187s;
        Bundle bundle = j60.f16117a.f1188t;
        int i9 = j60.f16117a.f1189u;
        List list = j60.f16117a.f1190v;
        boolean z7 = j60.f16117a.f1191w;
        int i10 = j60.f16117a.f1192x;
        boolean z8 = true;
        if (!j60.f16117a.f1193y && !j60.f16121e) {
            z8 = false;
        }
        this.f16766d = new D2.X1(i8, j8, bundle, i9, list, z7, i10, z8, j60.f16117a.f1194z, j60.f16117a.f1169A, j60.f16117a.f1170B, j60.f16117a.f1171C, j60.f16117a.f1172D, j60.f16117a.f1173E, j60.f16117a.f1174F, j60.f16117a.f1175G, j60.f16117a.f1176H, j60.f16117a.f1177I, j60.f16117a.f1178J, j60.f16117a.f1179K, j60.f16117a.f1180L, j60.f16117a.f1181M, G2.D0.A(j60.f16117a.f1182N), j60.f16117a.f1183O, j60.f16117a.f1184P, j60.f16117a.f1185Q);
        this.f16763a = j60.f16120d != null ? j60.f16120d : j60.f16124h != null ? j60.f16124h.f17392w : null;
        this.f16769g = j60.f16122f;
        this.f16770h = j60.f16123g;
        this.f16771i = j60.f16122f == null ? null : j60.f16124h == null ? new C1553Mg(new C7070e.a().a()) : j60.f16124h;
        this.f16772j = j60.f16125i;
        this.f16773k = j60.f16129m;
        this.f16774l = j60.f16126j;
        this.f16775m = j60.f16127k;
        this.f16776n = j60.f16128l;
        this.f16764b = j60.f16130n;
        this.f16777o = new C4547x60(j60.f16131o, null);
        this.f16778p = j60.f16132p;
        this.f16779q = j60.f16133q;
        this.f16765c = j60.f16134r;
        this.f16780r = j60.f16135s;
        this.f16781s = j60.f16136t;
    }

    public final InterfaceC1625Oh a() {
        C7071f c7071f = this.f16775m;
        if (c7071f == null && this.f16774l == null) {
            return null;
        }
        return c7071f != null ? c7071f.B0() : this.f16774l.B0();
    }

    public final boolean b() {
        return this.f16768f.matches((String) D2.A.c().a(AbstractC3184kf.f23959n3));
    }
}
