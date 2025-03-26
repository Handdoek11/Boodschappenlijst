package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.o5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4988o5 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    private int f29487o;

    /* renamed from: s, reason: collision with root package name */
    private Iterator f29488s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ AbstractC4972m5 f29489t;

    private final Iterator a() {
        if (this.f29488s == null) {
            this.f29488s = this.f29489t.f29457w.entrySet().iterator();
        }
        return this.f29488s;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i8 = this.f29487o;
        return (i8 > 0 && i8 <= this.f29489t.f29453s) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        Object[] objArr = this.f29489t.f29452o;
        int i8 = this.f29487o - 1;
        this.f29487o = i8;
        return (C5004q5) objArr[i8];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private C4988o5(AbstractC4972m5 abstractC4972m5) {
        this.f29489t = abstractC4972m5;
        this.f29487o = abstractC4972m5.f29453s;
    }
}
