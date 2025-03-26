package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5301c2 {

    /* renamed from: A, reason: collision with root package name */
    private Long f30848A;

    /* renamed from: B, reason: collision with root package name */
    private Long f30849B;

    /* renamed from: C, reason: collision with root package name */
    private long f30850C;

    /* renamed from: D, reason: collision with root package name */
    private String f30851D;

    /* renamed from: E, reason: collision with root package name */
    private int f30852E;

    /* renamed from: F, reason: collision with root package name */
    private int f30853F;

    /* renamed from: G, reason: collision with root package name */
    private long f30854G;

    /* renamed from: H, reason: collision with root package name */
    private String f30855H;

    /* renamed from: I, reason: collision with root package name */
    private byte[] f30856I;

    /* renamed from: J, reason: collision with root package name */
    private long f30857J;

    /* renamed from: K, reason: collision with root package name */
    private long f30858K;

    /* renamed from: L, reason: collision with root package name */
    private long f30859L;

    /* renamed from: M, reason: collision with root package name */
    private long f30860M;

    /* renamed from: N, reason: collision with root package name */
    private long f30861N;

    /* renamed from: O, reason: collision with root package name */
    private long f30862O;

    /* renamed from: P, reason: collision with root package name */
    private String f30863P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f30864Q;

    /* renamed from: R, reason: collision with root package name */
    private long f30865R;

    /* renamed from: S, reason: collision with root package name */
    private long f30866S;

    /* renamed from: a, reason: collision with root package name */
    private final S2 f30867a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30868b;

    /* renamed from: c, reason: collision with root package name */
    private String f30869c;

    /* renamed from: d, reason: collision with root package name */
    private String f30870d;

    /* renamed from: e, reason: collision with root package name */
    private String f30871e;

    /* renamed from: f, reason: collision with root package name */
    private String f30872f;

    /* renamed from: g, reason: collision with root package name */
    private long f30873g;

    /* renamed from: h, reason: collision with root package name */
    private long f30874h;

    /* renamed from: i, reason: collision with root package name */
    private long f30875i;

    /* renamed from: j, reason: collision with root package name */
    private String f30876j;

    /* renamed from: k, reason: collision with root package name */
    private long f30877k;

    /* renamed from: l, reason: collision with root package name */
    private String f30878l;

    /* renamed from: m, reason: collision with root package name */
    private long f30879m;

    /* renamed from: n, reason: collision with root package name */
    private long f30880n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f30881o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f30882p;

    /* renamed from: q, reason: collision with root package name */
    private String f30883q;

    /* renamed from: r, reason: collision with root package name */
    private Boolean f30884r;

    /* renamed from: s, reason: collision with root package name */
    private long f30885s;

    /* renamed from: t, reason: collision with root package name */
    private List f30886t;

    /* renamed from: u, reason: collision with root package name */
    private String f30887u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f30888v;

    /* renamed from: w, reason: collision with root package name */
    private long f30889w;

    /* renamed from: x, reason: collision with root package name */
    private long f30890x;

    /* renamed from: y, reason: collision with root package name */
    private int f30891y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f30892z;

    C5301c2(S2 s22, String str) {
        Z2.r.l(s22);
        Z2.r.f(str);
        this.f30867a = s22;
        this.f30868b = str;
        s22.j().l();
    }

    public final boolean A() {
        this.f30867a.j().l();
        return this.f30881o;
    }

    public final void A0(long j8) {
        Z2.r.a(j8 >= 0);
        this.f30867a.j().l();
        this.f30864Q |= this.f30873g != j8;
        this.f30873g = j8;
    }

    public final boolean B() {
        this.f30867a.j().l();
        return this.f30864Q;
    }

    public final long B0() {
        this.f30867a.j().l();
        return this.f30854G;
    }

    public final boolean C() {
        this.f30867a.j().l();
        return this.f30888v;
    }

    public final void C0(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30874h != j8;
        this.f30874h = j8;
    }

    public final boolean D() {
        this.f30867a.j().l();
        return this.f30892z;
    }

    public final long D0() {
        this.f30867a.j().l();
        return this.f30875i;
    }

    public final byte[] E() {
        this.f30867a.j().l();
        return this.f30856I;
    }

    public final void E0(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30890x != j8;
        this.f30890x = j8;
    }

    public final int F() {
        this.f30867a.j().l();
        return this.f30853F;
    }

    public final long F0() {
        this.f30867a.j().l();
        return this.f30873g;
    }

    public final void G(int i8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30853F != i8;
        this.f30853F = i8;
    }

    public final void G0(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30889w != j8;
        this.f30889w = j8;
    }

    public final void H(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30877k != j8;
        this.f30877k = j8;
    }

    public final long H0() {
        this.f30867a.j().l();
        return this.f30874h;
    }

    public final void I(Long l8) {
        this.f30867a.j().l();
        this.f30864Q |= !Objects.equals(this.f30849B, l8);
        this.f30849B = l8;
    }

    public final long I0() {
        this.f30867a.j().l();
        return this.f30890x;
    }

    public final void J(String str) {
        this.f30867a.j().l();
        this.f30864Q |= !Objects.equals(this.f30869c, str);
        this.f30869c = str;
    }

    public final long J0() {
        this.f30867a.j().l();
        return this.f30889w;
    }

    public final void K(boolean z7) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30881o != z7;
        this.f30881o = z7;
    }

    public final Boolean K0() {
        this.f30867a.j().l();
        return this.f30884r;
    }

    public final int L() {
        this.f30867a.j().l();
        return this.f30852E;
    }

    public final Long L0() {
        this.f30867a.j().l();
        return this.f30848A;
    }

    public final void M(int i8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30852E != i8;
        this.f30852E = i8;
    }

    public final Long M0() {
        this.f30867a.j().l();
        return this.f30849B;
    }

    public final void N(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30850C != j8;
        this.f30850C = j8;
    }

    public final void O(String str) {
        this.f30867a.j().l();
        this.f30864Q |= !Objects.equals(this.f30878l, str);
        this.f30878l = str;
    }

    public final void P(boolean z7) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30888v != z7;
        this.f30888v = z7;
    }

    public final long Q() {
        this.f30867a.j().l();
        return 0L;
    }

    public final void R(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30865R != j8;
        this.f30865R = j8;
    }

    public final void S(String str) {
        this.f30867a.j().l();
        this.f30864Q |= !Objects.equals(this.f30876j, str);
        this.f30876j = str;
    }

    public final void T(boolean z7) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30892z != z7;
        this.f30892z = z7;
    }

    public final long U() {
        this.f30867a.j().l();
        return this.f30877k;
    }

    public final void V(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30860M != j8;
        this.f30860M = j8;
    }

    public final void W(String str) {
        this.f30867a.j().l();
        this.f30864Q |= !Objects.equals(this.f30872f, str);
        this.f30872f = str;
    }

    public final long X() {
        this.f30867a.j().l();
        return this.f30850C;
    }

    public final void Y(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30861N != j8;
        this.f30861N = j8;
    }

    public final void Z(String str) {
        this.f30867a.j().l();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f30864Q |= !Objects.equals(this.f30870d, str);
        this.f30870d = str;
    }

    public final int a() {
        this.f30867a.j().l();
        return this.f30891y;
    }

    public final long a0() {
        this.f30867a.j().l();
        return this.f30865R;
    }

    public final void b(int i8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30891y != i8;
        this.f30891y = i8;
    }

    public final void b0(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30859L != j8;
        this.f30859L = j8;
    }

    public final void c(long j8) {
        this.f30867a.j().l();
        long j9 = this.f30873g + j8;
        if (j9 > 2147483647L) {
            this.f30867a.h().J().b("Bundle index overflow. appId", C5378n2.t(this.f30868b));
            j9 = j8 - 1;
        }
        long j10 = this.f30854G + 1;
        if (j10 > 2147483647L) {
            this.f30867a.h().J().b("Delivery index overflow. appId", C5378n2.t(this.f30868b));
            j10 = 0;
        }
        this.f30864Q = true;
        this.f30873g = j9;
        this.f30854G = j10;
    }

    public final void c0(String str) {
        this.f30867a.j().l();
        this.f30864Q |= !Objects.equals(this.f30863P, str);
        this.f30863P = str;
    }

    public final void d(Boolean bool) {
        this.f30867a.j().l();
        this.f30864Q |= !Objects.equals(this.f30884r, bool);
        this.f30884r = bool;
    }

    public final long d0() {
        this.f30867a.j().l();
        return this.f30860M;
    }

    public final void e(Long l8) {
        this.f30867a.j().l();
        this.f30864Q |= !Objects.equals(this.f30848A, l8);
        this.f30848A = l8;
    }

    public final void e0(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30858K != j8;
        this.f30858K = j8;
    }

    public final void f(String str) {
        this.f30867a.j().l();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f30864Q |= !Objects.equals(this.f30883q, str);
        this.f30883q = str;
    }

    public final void f0(String str) {
        this.f30867a.j().l();
        this.f30864Q |= !Objects.equals(this.f30871e, str);
        this.f30871e = str;
    }

    public final void g(List list) {
        this.f30867a.j().l();
        if (Objects.equals(this.f30886t, list)) {
            return;
        }
        this.f30864Q = true;
        this.f30886t = list != null ? new ArrayList(list) : null;
    }

    public final long g0() {
        this.f30867a.j().l();
        return this.f30861N;
    }

    public final void h(boolean z7) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30882p != z7;
        this.f30882p = z7;
    }

    public final void h0(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30862O != j8;
        this.f30862O = j8;
    }

    public final void i(byte[] bArr) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30856I != bArr;
        this.f30856I = bArr;
    }

    public final void i0(String str) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30855H != str;
        this.f30855H = str;
    }

    public final String j() {
        this.f30867a.j().l();
        return this.f30883q;
    }

    public final long j0() {
        this.f30867a.j().l();
        return this.f30859L;
    }

    public final String k() {
        this.f30867a.j().l();
        String str = this.f30863P;
        c0(null);
        return str;
    }

    public final void k0(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30857J != j8;
        this.f30857J = j8;
    }

    public final String l() {
        this.f30867a.j().l();
        return this.f30868b;
    }

    public final void l0(String str) {
        this.f30867a.j().l();
        this.f30864Q |= !Objects.equals(this.f30887u, str);
        this.f30887u = str;
    }

    public final String m() {
        this.f30867a.j().l();
        return this.f30869c;
    }

    public final long m0() {
        this.f30867a.j().l();
        return this.f30858K;
    }

    public final String n() {
        this.f30867a.j().l();
        return this.f30878l;
    }

    public final void n0(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30880n != j8;
        this.f30880n = j8;
    }

    public final String o() {
        this.f30867a.j().l();
        return this.f30876j;
    }

    public final void o0(String str) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30851D != str;
        this.f30851D = str;
    }

    public final String p() {
        this.f30867a.j().l();
        return this.f30872f;
    }

    public final long p0() {
        this.f30867a.j().l();
        return this.f30862O;
    }

    public final String q() {
        this.f30867a.j().l();
        return this.f30870d;
    }

    public final void q0(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30885s != j8;
        this.f30885s = j8;
    }

    public final String r() {
        this.f30867a.j().l();
        return this.f30863P;
    }

    public final long r0() {
        this.f30867a.j().l();
        return this.f30857J;
    }

    public final String s() {
        this.f30867a.j().l();
        return this.f30871e;
    }

    public final void s0(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30866S != j8;
        this.f30866S = j8;
    }

    public final String t() {
        this.f30867a.j().l();
        return this.f30855H;
    }

    public final long t0() {
        this.f30867a.j().l();
        return this.f30880n;
    }

    public final String u() {
        this.f30867a.j().l();
        return this.f30887u;
    }

    public final void u0(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30879m != j8;
        this.f30879m = j8;
    }

    public final String v() {
        this.f30867a.j().l();
        return this.f30851D;
    }

    public final long v0() {
        this.f30867a.j().l();
        return this.f30885s;
    }

    public final List w() {
        this.f30867a.j().l();
        return this.f30886t;
    }

    public final void w0(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30854G != j8;
        this.f30854G = j8;
    }

    public final void x() {
        this.f30867a.j().l();
        this.f30864Q = false;
    }

    public final long x0() {
        this.f30867a.j().l();
        return this.f30866S;
    }

    public final void y() {
        this.f30867a.j().l();
        long j8 = this.f30873g + 1;
        if (j8 > 2147483647L) {
            this.f30867a.h().J().b("Bundle index overflow. appId", C5378n2.t(this.f30868b));
            j8 = 0;
        }
        this.f30864Q = true;
        this.f30873g = j8;
    }

    public final void y0(long j8) {
        this.f30867a.j().l();
        this.f30864Q |= this.f30875i != j8;
        this.f30875i = j8;
    }

    public final boolean z() {
        this.f30867a.j().l();
        return this.f30882p;
    }

    public final long z0() {
        this.f30867a.j().l();
        return this.f30879m;
    }
}
