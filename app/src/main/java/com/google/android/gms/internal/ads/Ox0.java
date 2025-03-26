package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class Ox0 implements Iterator, Closeable, F7 {

    /* renamed from: x, reason: collision with root package name */
    private static final D7 f18085x = new Nx0("eof ");

    /* renamed from: o, reason: collision with root package name */
    protected A7 f18086o;

    /* renamed from: s, reason: collision with root package name */
    protected Px0 f18087s;

    /* renamed from: t, reason: collision with root package name */
    D7 f18088t = null;

    /* renamed from: u, reason: collision with root package name */
    long f18089u = 0;

    /* renamed from: v, reason: collision with root package name */
    long f18090v = 0;

    /* renamed from: w, reason: collision with root package name */
    private final List f18091w = new ArrayList();

    static {
        Vx0.b(Ox0.class);
    }

    public void close() {
    }

    @Override // java.util.Iterator
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final D7 next() {
        D7 a8;
        D7 d72 = this.f18088t;
        if (d72 != null && d72 != f18085x) {
            this.f18088t = null;
            return d72;
        }
        Px0 px0 = this.f18087s;
        if (px0 == null || this.f18089u >= this.f18090v) {
            this.f18088t = f18085x;
            throw new NoSuchElementException();
        }
        try {
            synchronized (px0) {
                this.f18087s.b(this.f18089u);
                a8 = this.f18086o.a(this.f18087s, this);
                this.f18089u = this.f18087s.zzb();
            }
            return a8;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List g() {
        return (this.f18087s == null || this.f18088t == f18085x) ? this.f18091w : new Ux0(this.f18091w, this);
    }

    public final void h(Px0 px0, long j8, A7 a72) {
        this.f18087s = px0;
        this.f18089u = px0.zzb();
        px0.b(px0.zzb() + j8);
        this.f18090v = px0.zzb();
        this.f18086o = a72;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        D7 d72 = this.f18088t;
        if (d72 == f18085x) {
            return false;
        }
        if (d72 != null) {
            return true;
        }
        try {
            this.f18088t = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f18088t = f18085x;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i8 = 0; i8 < this.f18091w.size(); i8++) {
            if (i8 > 0) {
                sb.append(";");
            }
            sb.append(((D7) this.f18091w.get(i8)).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
