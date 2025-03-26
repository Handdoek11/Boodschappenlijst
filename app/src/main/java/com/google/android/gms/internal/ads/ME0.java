package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class ME0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17305a;

    /* renamed from: b, reason: collision with root package name */
    public final GG0 f17306b;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f17307c;

    private ME0(CopyOnWriteArrayList copyOnWriteArrayList, int i8, GG0 gg0) {
        this.f17307c = copyOnWriteArrayList;
        this.f17305a = 0;
        this.f17306b = gg0;
    }

    public final ME0 a(int i8, GG0 gg0) {
        return new ME0(this.f17307c, 0, gg0);
    }

    public final void b(Handler handler, NE0 ne0) {
        this.f17307c.add(new KE0(handler, ne0));
    }

    public final void c(NE0 ne0) {
        Iterator it = this.f17307c.iterator();
        while (it.hasNext()) {
            KE0 ke0 = (KE0) it.next();
            if (ke0.f16561a == ne0) {
                this.f17307c.remove(ke0);
            }
        }
    }

    public ME0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
