package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Dr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1248Dr {

    /* renamed from: o, reason: collision with root package name */
    private static final AtomicInteger f14571o = new AtomicInteger(0);

    /* renamed from: s, reason: collision with root package name */
    private static final AtomicInteger f14572s = new AtomicInteger(0);

    public static int O() {
        return f14571o.get();
    }

    public static int Q() {
        return f14572s.get();
    }

    protected static AtomicInteger u() {
        return f14571o;
    }

    protected static AtomicInteger v() {
        return f14572s;
    }

    public abstract void A(int i8);

    public abstract void B(int i8);

    public abstract void C(InterfaceC1212Cr interfaceC1212Cr);

    public abstract void D(int i8);

    public abstract void E(int i8);

    public abstract void F(boolean z7);

    public abstract void G(Integer num);

    public abstract void H(boolean z7);

    public abstract void I(int i8);

    public abstract void J(Surface surface, boolean z7);

    public abstract void K(float f8, boolean z7);

    public abstract void L();

    public abstract boolean M();

    public abstract int N();

    public abstract int P();

    public abstract long R();

    public abstract long S();

    public abstract long T();

    public abstract long U();

    public abstract long V();

    public abstract long r();

    public abstract long s();

    public abstract Integer t();

    public abstract void w(Uri[] uriArr, String str);

    public abstract void x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z7);

    public abstract void y();

    public abstract void z(long j8);
}
