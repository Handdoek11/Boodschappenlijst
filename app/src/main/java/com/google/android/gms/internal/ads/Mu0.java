package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class Mu0 extends Vt0 {

    /* renamed from: o, reason: collision with root package name */
    private final Qu0 f17424o;

    /* renamed from: s, reason: collision with root package name */
    protected Qu0 f17425s;

    protected Mu0(Qu0 qu0) {
        this.f17424o = qu0;
        if (qu0.V()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f17425s = r();
    }

    private Qu0 r() {
        return this.f17424o.K();
    }

    private static void s(Object obj, Object obj2) {
        C4851zv0.a().b(obj.getClass()).e(obj, obj2);
    }

    protected final void A() {
        if (this.f17425s.V()) {
            return;
        }
        B();
    }

    protected void B() {
        Qu0 r8 = r();
        s(r8, this.f17425s);
        this.f17425s = r8;
    }

    @Override // com.google.android.gms.internal.ads.Vt0
    public /* bridge */ /* synthetic */ Vt0 k(byte[] bArr, int i8, int i9, Eu0 eu0) {
        w(bArr, i8, i9, eu0);
        return this;
    }

    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Mu0 clone() {
        Mu0 c8 = z().c();
        c8.f17425s = d();
        return c8;
    }

    public Mu0 v(Qu0 qu0) {
        if (z().equals(qu0)) {
            return this;
        }
        A();
        s(this.f17425s, qu0);
        return this;
    }

    public Mu0 w(byte[] bArr, int i8, int i9, Eu0 eu0) {
        A();
        try {
            C4851zv0.a().b(this.f17425s.getClass()).h(this.f17425s, bArr, i8, i8 + i9, new C2129au0(eu0));
            return this;
        } catch (zzgyg e8) {
            throw e8;
        } catch (IOException e9) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final Qu0 x() {
        Qu0 d8 = d();
        if (d8.P()) {
            return d8;
        }
        throw Vt0.m(d8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3762pv0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Qu0 d() {
        if (!this.f17425s.V()) {
            return this.f17425s;
        }
        this.f17425s.D();
        return this.f17425s;
    }

    public Qu0 z() {
        return this.f17424o;
    }
}
