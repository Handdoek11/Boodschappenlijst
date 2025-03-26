package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.As, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1141As implements W2.e {

    /* renamed from: o, reason: collision with root package name */
    protected final Context f13680o;

    /* renamed from: s, reason: collision with root package name */
    protected final String f13681s;

    /* renamed from: t, reason: collision with root package name */
    protected final WeakReference f13682t;

    public AbstractC1141As(InterfaceC1567Mr interfaceC1567Mr) {
        Context context = interfaceC1567Mr.getContext();
        this.f13680o = context;
        this.f13681s = C2.v.t().H(context, interfaceC1567Mr.l().f2914o);
        this.f13682t = new WeakReference(interfaceC1567Mr);
    }

    static /* bridge */ /* synthetic */ void a(AbstractC1141As abstractC1141As, String str, Map map) {
        InterfaceC1567Mr interfaceC1567Mr = (InterfaceC1567Mr) abstractC1141As.f13682t.get();
        if (interfaceC1567Mr != null) {
            interfaceC1567Mr.D0("onPrecacheEvent", map);
        }
    }

    public abstract void b();

    public final void c(String str, String str2, String str3, String str4) {
        H2.g.f2925b.post(new RunnableC4844zs(this, str, str2, str3, str4));
    }

    @Override // W2.e
    public void d() {
    }

    protected final void e(String str, String str2, int i8) {
        H2.g.f2925b.post(new RunnableC4626xs(this, str, str2, i8));
    }

    public final void g(String str, String str2, long j8) {
        H2.g.f2925b.post(new RunnableC4735ys(this, str, str2, j8));
    }

    public final void h(String str, String str2, int i8, int i9, long j8, long j9, boolean z7, int i10, int i11) {
        H2.g.f2925b.post(new RunnableC4517ws(this, str, str2, i8, i9, j8, j9, z7, i10, i11));
    }

    public final void j(String str, String str2, long j8, long j9, boolean z7, long j10, long j11, long j12, int i8, int i9) {
        H2.g.f2925b.post(new RunnableC4299us(this, str, str2, j8, j9, j10, j11, j12, z7, i8, i9));
    }

    protected void k(int i8) {
    }

    protected void l(int i8) {
    }

    protected void m(int i8) {
    }

    protected void n(int i8) {
    }

    public abstract boolean p(String str);

    public boolean r(String str, String[] strArr) {
        return p(str);
    }

    public boolean s(String str, String[] strArr, C3972rs c3972rs) {
        return p(str);
    }
}
