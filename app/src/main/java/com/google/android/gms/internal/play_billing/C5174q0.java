package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.play_billing.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5174q0 implements InterfaceC5219y0 {

    /* renamed from: o, reason: collision with root package name */
    private final Iterator f29968o;

    /* renamed from: s, reason: collision with root package name */
    private boolean f29969s;

    /* renamed from: t, reason: collision with root package name */
    private Object f29970t;

    public C5174q0(Iterator it) {
        it.getClass();
        this.f29968o = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29969s || this.f29968o.hasNext();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5219y0, java.util.Iterator
    public final Object next() {
        if (!this.f29969s) {
            return this.f29968o.next();
        }
        Object obj = this.f29970t;
        this.f29969s = false;
        this.f29970t = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f29969s) {
            throw new IllegalStateException("Can't remove after you've peeked at next");
        }
        this.f29968o.remove();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5219y0
    public final Object zza() {
        if (!this.f29969s) {
            this.f29970t = this.f29968o.next();
            this.f29969s = true;
        }
        return this.f29970t;
    }
}
