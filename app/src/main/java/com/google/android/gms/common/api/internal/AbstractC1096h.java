package com.google.android.gms.common.api.internal;

import A3.C0377k;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.common.api.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1096h {

    /* renamed from: a, reason: collision with root package name */
    private final C1105d[] f13328a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f13329b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13330c;

    /* renamed from: com.google.android.gms.common.api.internal.h$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private X2.j f13331a;

        /* renamed from: c, reason: collision with root package name */
        private C1105d[] f13333c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f13332b = true;

        /* renamed from: d, reason: collision with root package name */
        private int f13334d = 0;

        /* synthetic */ a(X2.C c8) {
        }

        public AbstractC1096h a() {
            Z2.r.b(this.f13331a != null, "execute parameter required");
            return new B(this, this.f13333c, this.f13332b, this.f13334d);
        }

        public a b(X2.j jVar) {
            this.f13331a = jVar;
            return this;
        }

        public a c(boolean z7) {
            this.f13332b = z7;
            return this;
        }

        public a d(C1105d... c1105dArr) {
            this.f13333c = c1105dArr;
            return this;
        }

        public a e(int i8) {
            this.f13334d = i8;
            return this;
        }
    }

    protected AbstractC1096h(C1105d[] c1105dArr, boolean z7, int i8) {
        this.f13328a = c1105dArr;
        boolean z8 = false;
        if (c1105dArr != null && z7) {
            z8 = true;
        }
        this.f13329b = z8;
        this.f13330c = i8;
    }

    public static a a() {
        return new a(null);
    }

    protected abstract void b(a.b bVar, C0377k c0377k);

    public boolean c() {
        return this.f13329b;
    }

    public final int d() {
        return this.f13330c;
    }

    public final C1105d[] e() {
        return this.f13328a;
    }
}
