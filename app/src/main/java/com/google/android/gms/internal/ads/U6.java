package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class U6 implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    private G6 f19293A;

    /* renamed from: B, reason: collision with root package name */
    private T6 f19294B;

    /* renamed from: C, reason: collision with root package name */
    private final K6 f19295C;

    /* renamed from: o, reason: collision with root package name */
    private final C2046a7 f19296o;

    /* renamed from: s, reason: collision with root package name */
    private final int f19297s;

    /* renamed from: t, reason: collision with root package name */
    private final String f19298t;

    /* renamed from: u, reason: collision with root package name */
    private final int f19299u;

    /* renamed from: v, reason: collision with root package name */
    private final Object f19300v;

    /* renamed from: w, reason: collision with root package name */
    private final W6 f19301w;

    /* renamed from: x, reason: collision with root package name */
    private Integer f19302x;

    /* renamed from: y, reason: collision with root package name */
    private V6 f19303y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f19304z;

    public U6(int i8, String str, W6 w62) {
        Uri parse;
        String host;
        this.f19296o = C2046a7.f20636c ? new C2046a7() : null;
        this.f19300v = new Object();
        int i9 = 0;
        this.f19304z = false;
        this.f19293A = null;
        this.f19297s = i8;
        this.f19298t = str;
        this.f19301w = w62;
        this.f19295C = new K6();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i9 = host.hashCode();
        }
        this.f19299u = i9;
    }

    public final boolean A() {
        boolean z7;
        synchronized (this.f19300v) {
            z7 = this.f19304z;
        }
        return z7;
    }

    public final boolean B() {
        synchronized (this.f19300v) {
        }
        return false;
    }

    public byte[] C() {
        return null;
    }

    public final K6 D() {
        return this.f19295C;
    }

    public final int a() {
        return this.f19295C.b();
    }

    public final int c() {
        return this.f19299u;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f19302x.intValue() - ((U6) obj).f19302x.intValue();
    }

    public final G6 f() {
        return this.f19293A;
    }

    public final U6 g(G6 g62) {
        this.f19293A = g62;
        return this;
    }

    public final U6 h(V6 v62) {
        this.f19303y = v62;
        return this;
    }

    public final U6 i(int i8) {
        this.f19302x = Integer.valueOf(i8);
        return this;
    }

    protected abstract Y6 k(R6 r62);

    public final String m() {
        int i8 = this.f19297s;
        String str = this.f19298t;
        if (i8 == 0) {
            return str;
        }
        return Integer.toString(1) + "-" + str;
    }

    public final String p() {
        return this.f19298t;
    }

    public Map q() {
        return Collections.emptyMap();
    }

    public final void r(String str) {
        if (C2046a7.f20636c) {
            this.f19296o.a(str, Thread.currentThread().getId());
        }
    }

    public final void s(zzapv zzapvVar) {
        W6 w62;
        synchronized (this.f19300v) {
            w62 = this.f19301w;
        }
        w62.a(zzapvVar);
    }

    protected abstract void t(Object obj);

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f19299u));
        B();
        return "[ ] " + this.f19298t + " " + "0x".concat(valueOf) + " NORMAL " + this.f19302x;
    }

    final void u(String str) {
        V6 v62 = this.f19303y;
        if (v62 != null) {
            v62.b(this);
        }
        if (C2046a7.f20636c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new S6(this, str, id));
            } else {
                this.f19296o.a(str, id);
                this.f19296o.b(toString());
            }
        }
    }

    public final void v() {
        synchronized (this.f19300v) {
            this.f19304z = true;
        }
    }

    final void w() {
        T6 t62;
        synchronized (this.f19300v) {
            t62 = this.f19294B;
        }
        if (t62 != null) {
            t62.a(this);
        }
    }

    final void x(Y6 y62) {
        T6 t62;
        synchronized (this.f19300v) {
            t62 = this.f19294B;
        }
        if (t62 != null) {
            t62.b(this, y62);
        }
    }

    final void y(int i8) {
        V6 v62 = this.f19303y;
        if (v62 != null) {
            v62.c(this, i8);
        }
    }

    final void z(T6 t62) {
        synchronized (this.f19300v) {
            this.f19294B = t62;
        }
    }

    public final int zza() {
        return this.f19297s;
    }
}
