package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.api.internal.C1092d;

/* renamed from: com.google.android.gms.common.api.internal.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1095g {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1094f f13318a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1097i f13319b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f13320c;

    /* renamed from: com.google.android.gms.common.api.internal.g$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private X2.j f13321a;

        /* renamed from: b, reason: collision with root package name */
        private X2.j f13322b;

        /* renamed from: d, reason: collision with root package name */
        private C1092d f13324d;

        /* renamed from: e, reason: collision with root package name */
        private C1105d[] f13325e;

        /* renamed from: g, reason: collision with root package name */
        private int f13327g;

        /* renamed from: c, reason: collision with root package name */
        private Runnable f13323c = new Runnable() { // from class: X2.v
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* renamed from: f, reason: collision with root package name */
        private boolean f13326f = true;

        /* synthetic */ a(X2.w wVar) {
        }

        public C1095g a() {
            Z2.r.b(this.f13321a != null, "Must set register function");
            Z2.r.b(this.f13322b != null, "Must set unregister function");
            Z2.r.b(this.f13324d != null, "Must set holder");
            return new C1095g(new z(this, this.f13324d, this.f13325e, this.f13326f, this.f13327g), new A(this, (C1092d.a) Z2.r.m(this.f13324d.b(), "Key must not be null")), this.f13323c, null);
        }

        public a b(X2.j jVar) {
            this.f13321a = jVar;
            return this;
        }

        public a c(boolean z7) {
            this.f13326f = z7;
            return this;
        }

        public a d(C1105d... c1105dArr) {
            this.f13325e = c1105dArr;
            return this;
        }

        public a e(int i8) {
            this.f13327g = i8;
            return this;
        }

        public a f(X2.j jVar) {
            this.f13322b = jVar;
            return this;
        }

        public a g(C1092d c1092d) {
            this.f13324d = c1092d;
            return this;
        }
    }

    /* synthetic */ C1095g(AbstractC1094f abstractC1094f, AbstractC1097i abstractC1097i, Runnable runnable, X2.x xVar) {
        this.f13318a = abstractC1094f;
        this.f13319b = abstractC1097i;
        this.f13320c = runnable;
    }

    public static a a() {
        return new a(null);
    }
}
