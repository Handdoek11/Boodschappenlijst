package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Oz0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f18094a;

    /* renamed from: b, reason: collision with root package name */
    public C3901rA0 f18095b;

    /* renamed from: c, reason: collision with root package name */
    public int f18096c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18097d;

    /* renamed from: e, reason: collision with root package name */
    public int f18098e;

    public Oz0(C3901rA0 c3901rA0) {
        this.f18095b = c3901rA0;
    }

    public final void a(int i8) {
        this.f18094a = 1 == ((this.f18094a ? 1 : 0) | i8);
        this.f18096c += i8;
    }

    public final void b(C3901rA0 c3901rA0) {
        this.f18094a |= this.f18095b != c3901rA0;
        this.f18095b = c3901rA0;
    }

    public final void c(int i8) {
        if (this.f18097d && this.f18098e != 5) {
            AbstractC3796qC.d(i8 == 5);
            return;
        }
        this.f18094a = true;
        this.f18097d = true;
        this.f18098e = i8;
    }
}
