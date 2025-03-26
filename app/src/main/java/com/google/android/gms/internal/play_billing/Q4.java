package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class Q4 {

    /* renamed from: a, reason: collision with root package name */
    Object f29805a;

    /* renamed from: b, reason: collision with root package name */
    T4 f29806b;

    /* renamed from: c, reason: collision with root package name */
    private V4 f29807c = V4.j();

    /* renamed from: d, reason: collision with root package name */
    private boolean f29808d;

    Q4() {
    }

    final void a() {
        this.f29805a = null;
        this.f29806b = null;
        this.f29807c.c(null);
    }

    public final boolean b(Object obj) {
        this.f29808d = true;
        T4 t42 = this.f29806b;
        boolean z7 = t42 != null && t42.a(obj);
        if (z7) {
            this.f29805a = null;
            this.f29806b = null;
            this.f29807c = null;
        }
        return z7;
    }

    protected final void finalize() {
        V4 v42;
        T4 t42 = this.f29806b;
        if (t42 != null && !t42.isDone()) {
            t42.b(new R4("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f29805a))));
        }
        if (this.f29808d || (v42 = this.f29807c) == null) {
            return;
        }
        v42.c(null);
    }
}
