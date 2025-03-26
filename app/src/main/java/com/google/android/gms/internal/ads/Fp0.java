package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Fp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f15208a;

    /* renamed from: d, reason: collision with root package name */
    private Gp0 f15211d;

    /* renamed from: b, reason: collision with root package name */
    private Map f15209b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final List f15210c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private Qo0 f15212e = Qo0.f18535b;

    /* synthetic */ Fp0(Class cls, Hp0 hp0) {
        this.f15208a = cls;
    }

    private final Fp0 e(Object obj, Sk0 sk0, C4736ys0 c4736ys0, boolean z7) {
        byte[] c8;
        if (this.f15209b == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (obj == null) {
            throw new NullPointerException("`fullPrimitive` must not be null");
        }
        if (c4736ys0.k0() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int ordinal = c4736ys0.f0().ordinal();
        if (ordinal == 1) {
            c8 = AbstractC3532np0.b(c4736ys0.b0()).c();
        } else if (ordinal == 2) {
            c8 = AbstractC3532np0.a(c4736ys0.b0()).c();
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            c8 = AbstractC3532np0.a(c4736ys0.b0()).c();
        } else {
            c8 = Nk0.f17583a;
        }
        Gp0 gp0 = new Gp0(obj, Tt0.b(c8), c4736ys0.k0(), c4736ys0.f0(), c4736ys0.b0(), c4736ys0.c0().g0(), sk0, null);
        Map map = this.f15209b;
        List list = this.f15210c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(gp0);
        List list2 = (List) map.put(gp0.f15440b, DesugarCollections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(gp0);
            map.put(gp0.f15440b, DesugarCollections.unmodifiableList(arrayList2));
        }
        list.add(gp0);
        if (z7) {
            if (this.f15211d != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f15211d = gp0;
        }
        return this;
    }

    public final Fp0 a(Object obj, Sk0 sk0, C4736ys0 c4736ys0) {
        e(obj, sk0, c4736ys0, false);
        return this;
    }

    public final Fp0 b(Object obj, Sk0 sk0, C4736ys0 c4736ys0) {
        e(obj, sk0, c4736ys0, true);
        return this;
    }

    public final Fp0 c(Qo0 qo0) {
        if (this.f15209b == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.f15212e = qo0;
        return this;
    }

    public final Ip0 d() {
        Map map = this.f15209b;
        if (map == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        Ip0 ip0 = new Ip0(map, this.f15210c, this.f15211d, this.f15212e, this.f15208a, null);
        this.f15209b = null;
        return ip0;
    }
}
