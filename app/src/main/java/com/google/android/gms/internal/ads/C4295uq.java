package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import f3.InterfaceC5781e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.uq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4295uq {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5781e f27106a;

    /* renamed from: b, reason: collision with root package name */
    private final C1283Eq f27107b;

    /* renamed from: e, reason: collision with root package name */
    private final String f27110e;

    /* renamed from: f, reason: collision with root package name */
    private final String f27111f;

    /* renamed from: d, reason: collision with root package name */
    private final Object f27109d = new Object();

    /* renamed from: g, reason: collision with root package name */
    private long f27112g = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f27113h = -1;

    /* renamed from: i, reason: collision with root package name */
    private long f27114i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long f27115j = -1;

    /* renamed from: k, reason: collision with root package name */
    private long f27116k = -1;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedList f27108c = new LinkedList();

    C4295uq(InterfaceC5781e interfaceC5781e, C1283Eq c1283Eq, String str, String str2) {
        this.f27106a = interfaceC5781e;
        this.f27107b = c1283Eq;
        this.f27110e = str;
        this.f27111f = str2;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.f27109d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f27110e);
                bundle.putString("slotid", this.f27111f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f27115j);
                bundle.putLong("tresponse", this.f27116k);
                bundle.putLong("timp", this.f27112g);
                bundle.putLong("tload", this.f27113h);
                bundle.putLong("pcc", this.f27114i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.f27108c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C4186tq) it.next()).b());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final String c() {
        return this.f27110e;
    }

    public final void d() {
        synchronized (this.f27109d) {
            try {
                if (this.f27116k != -1) {
                    C4186tq c4186tq = new C4186tq(this);
                    c4186tq.d();
                    this.f27108c.add(c4186tq);
                    this.f27114i++;
                    this.f27107b.e();
                    this.f27107b.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f27109d) {
            try {
                if (this.f27116k != -1 && !this.f27108c.isEmpty()) {
                    C4186tq c4186tq = (C4186tq) this.f27108c.getLast();
                    if (c4186tq.a() == -1) {
                        c4186tq.c();
                        this.f27107b.d(this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.f27109d) {
            try {
                if (this.f27116k != -1 && this.f27112g == -1) {
                    this.f27112g = this.f27106a.b();
                    this.f27107b.d(this);
                }
                this.f27107b.f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.f27109d) {
            this.f27107b.g();
        }
    }

    public final void h(boolean z7) {
        synchronized (this.f27109d) {
            try {
                if (this.f27116k != -1) {
                    this.f27113h = this.f27106a.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f27109d) {
            this.f27107b.h();
        }
    }

    public final void j(D2.X1 x12) {
        synchronized (this.f27109d) {
            long b8 = this.f27106a.b();
            this.f27115j = b8;
            this.f27107b.i(x12, b8);
        }
    }

    public final void k(long j8) {
        synchronized (this.f27109d) {
            try {
                this.f27116k = j8;
                if (j8 != -1) {
                    this.f27107b.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
