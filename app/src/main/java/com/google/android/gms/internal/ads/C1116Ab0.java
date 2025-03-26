package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Ab0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1116Ab0 implements InterfaceC4157tb0 {

    /* renamed from: d, reason: collision with root package name */
    private static C1116Ab0 f13592d;

    /* renamed from: a, reason: collision with root package name */
    private float f13593a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private C3613ob0 f13594b;

    /* renamed from: c, reason: collision with root package name */
    private C4048sb0 f13595c;

    public C1116Ab0(C3722pb0 c3722pb0, C3504nb0 c3504nb0) {
    }

    public static C1116Ab0 c() {
        if (f13592d == null) {
            f13592d = new C1116Ab0(new C3722pb0(), new C3504nb0());
        }
        return f13592d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4157tb0
    public final void a(boolean z7) {
        if (z7) {
            C2310cc0.d().i();
        } else {
            C2310cc0.d().h();
        }
    }

    public final float b() {
        return this.f13593a;
    }

    public final void d(Context context) {
        this.f13594b = new C3613ob0(new Handler(), context, new C3395mb0(), this);
    }

    public final void e(float f8) {
        this.f13593a = f8;
        if (this.f13595c == null) {
            this.f13595c = C4048sb0.a();
        }
        Iterator it = this.f13595c.b().iterator();
        while (it.hasNext()) {
            ((C2200bb0) it.next()).g().l(f8);
        }
    }

    public final void f() {
        C3939rb0.i().e(this);
        C3939rb0.i().f();
        C2310cc0.d().i();
        this.f13594b.a();
    }

    public final void g() {
        C2310cc0.d().j();
        C3939rb0.i().g();
        this.f13594b.b();
    }
}
