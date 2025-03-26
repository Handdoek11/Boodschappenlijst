package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.u5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5035u5 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    private int f29590o;

    /* renamed from: s, reason: collision with root package name */
    private boolean f29591s;

    /* renamed from: t, reason: collision with root package name */
    private Iterator f29592t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ AbstractC4972m5 f29593u;

    private final Iterator a() {
        if (this.f29592t == null) {
            this.f29592t = this.f29593u.f29454t.entrySet().iterator();
        }
        return this.f29592t;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29590o + 1 < this.f29593u.f29453s || (!this.f29593u.f29454t.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f29591s = true;
        int i8 = this.f29590o + 1;
        this.f29590o = i8;
        return i8 < this.f29593u.f29453s ? (C5004q5) this.f29593u.f29452o[this.f29590o] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f29591s) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f29591s = false;
        this.f29593u.r();
        if (this.f29590o >= this.f29593u.f29453s) {
            a().remove();
            return;
        }
        AbstractC4972m5 abstractC4972m5 = this.f29593u;
        int i8 = this.f29590o;
        this.f29590o = i8 - 1;
        abstractC4972m5.i(i8);
    }

    private C5035u5(AbstractC4972m5 abstractC4972m5) {
        this.f29593u = abstractC4972m5;
        this.f29590o = -1;
    }
}
