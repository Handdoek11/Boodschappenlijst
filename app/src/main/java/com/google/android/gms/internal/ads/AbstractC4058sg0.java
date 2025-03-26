package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.sg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4058sg0 extends AbstractC4825zi0 {

    /* renamed from: o, reason: collision with root package name */
    private Object f26723o;

    /* renamed from: s, reason: collision with root package name */
    private int f26724s = 2;

    protected AbstractC4058sg0() {
    }

    protected final Object a() {
        this.f26724s = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC1762Sf0.l(this.f26724s != 4);
        int i8 = this.f26724s;
        int i9 = i8 - 1;
        if (i8 == 0) {
            throw null;
        }
        if (i9 == 0) {
            return true;
        }
        if (i9 != 2) {
            this.f26724s = 4;
            this.f26723o = zza();
            if (this.f26724s != 3) {
                this.f26724s = 1;
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
        this.f26724s = 2;
        Object obj = this.f26723o;
        this.f26723o = null;
        return obj;
    }

    protected abstract Object zza();
}
