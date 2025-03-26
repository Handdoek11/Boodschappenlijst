package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* renamed from: com.google.android.gms.internal.ads.rr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3970rr extends TextureView implements InterfaceC1672Pr {

    /* renamed from: o, reason: collision with root package name */
    protected final C1356Gr f26224o;

    /* renamed from: s, reason: collision with root package name */
    protected final C1707Qr f26225s;

    public AbstractC3970rr(Context context) {
        super(context);
        this.f26224o = new C1356Gr();
        this.f26225s = new C1707Qr(context, this);
    }

    public void a(int i8) {
    }

    public void b(int i8) {
    }

    public void c(String str, String[] strArr, Integer num) {
        r(str);
    }

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract long i();

    public abstract long j();

    public abstract long k();

    public abstract void l();

    public abstract String m();

    public abstract void n();

    public abstract void o();

    public abstract void p(int i8);

    public abstract void q(InterfaceC3862qr interfaceC3862qr);

    public abstract void r(String str);

    public abstract void s();

    public abstract void t(float f8, float f9);

    public Integer v() {
        return null;
    }

    public void w(int i8) {
    }

    public void x(int i8) {
    }

    public void y(int i8) {
    }
}
