package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.xf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4601xf0 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    private Object f27894o;

    /* renamed from: s, reason: collision with root package name */
    private int f27895s = 2;

    protected AbstractC4601xf0() {
    }

    protected final Object a() {
        this.f27895s = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC1762Sf0.l(this.f27895s != 4);
        int i8 = this.f27895s;
        int i9 = i8 - 1;
        if (i8 == 0) {
            throw null;
        }
        if (i9 == 0) {
            return true;
        }
        if (i9 != 2) {
            this.f27895s = 4;
            this.f27894o = zza();
            if (this.f27895s != 3) {
                this.f27895s = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f27895s = 2;
        Object obj = this.f27894o;
        this.f27894o = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected abstract Object zza();
}
