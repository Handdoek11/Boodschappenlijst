package com.google.android.material.carousel;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final float f31612a;

    /* renamed from: b, reason: collision with root package name */
    private final List f31613b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31614c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31615d;

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final float f31616a;

        /* renamed from: b, reason: collision with root package name */
        private final float f31617b;

        /* renamed from: d, reason: collision with root package name */
        private c f31619d;

        /* renamed from: e, reason: collision with root package name */
        private c f31620e;

        /* renamed from: c, reason: collision with root package name */
        private final List f31618c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private int f31621f = -1;

        /* renamed from: g, reason: collision with root package name */
        private int f31622g = -1;

        /* renamed from: h, reason: collision with root package name */
        private float f31623h = 0.0f;

        /* renamed from: i, reason: collision with root package name */
        private int f31624i = -1;

        b(float f8, float f9) {
            this.f31616a = f8;
            this.f31617b = f9;
        }

        private static float j(float f8, float f9, int i8, int i9) {
            return (f8 - (i8 * f9)) + (i9 * f9);
        }

        b a(float f8, float f9, float f10) {
            return d(f8, f9, f10, false, true);
        }

        b b(float f8, float f9, float f10) {
            return c(f8, f9, f10, false);
        }

        b c(float f8, float f9, float f10, boolean z7) {
            return d(f8, f9, f10, z7, false);
        }

        b d(float f8, float f9, float f10, boolean z7, boolean z8) {
            float f11;
            float f12 = f10 / 2.0f;
            float f13 = f8 - f12;
            float f14 = f12 + f8;
            float f15 = this.f31617b;
            if (f14 > f15) {
                f11 = Math.abs(f14 - Math.max(f14 - f10, f15));
            } else {
                f11 = 0.0f;
                if (f13 < 0.0f) {
                    f11 = Math.abs(f13 - Math.min(f13 + f10, 0.0f));
                }
            }
            return e(f8, f9, f10, z7, z8, f11);
        }

        b e(float f8, float f9, float f10, boolean z7, boolean z8, float f11) {
            return f(f8, f9, f10, z7, z8, f11, 0.0f, 0.0f);
        }

        b f(float f8, float f9, float f10, boolean z7, boolean z8, float f11, float f12, float f13) {
            if (f10 <= 0.0f) {
                return this;
            }
            if (z8) {
                if (z7) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i8 = this.f31624i;
                if (i8 != -1 && i8 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f31624i = this.f31618c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f8, f9, f10, z8, f11, f12, f13);
            if (z7) {
                if (this.f31619d == null) {
                    this.f31619d = cVar;
                    this.f31621f = this.f31618c.size();
                }
                if (this.f31622g != -1 && this.f31618c.size() - this.f31622g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f10 != this.f31619d.f31628d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f31620e = cVar;
                this.f31622g = this.f31618c.size();
            } else {
                if (this.f31619d == null && cVar.f31628d < this.f31623h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f31620e != null && cVar.f31628d > this.f31623h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f31623h = cVar.f31628d;
            this.f31618c.add(cVar);
            return this;
        }

        b g(float f8, float f9, float f10, int i8) {
            return h(f8, f9, f10, i8, false);
        }

        b h(float f8, float f9, float f10, int i8, boolean z7) {
            if (i8 > 0 && f10 > 0.0f) {
                for (int i9 = 0; i9 < i8; i9++) {
                    c((i9 * f10) + f8, f9, f10, z7);
                }
            }
            return this;
        }

        f i() {
            if (this.f31619d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < this.f31618c.size(); i8++) {
                c cVar = (c) this.f31618c.get(i8);
                arrayList.add(new c(j(this.f31619d.f31626b, this.f31616a, this.f31621f, i8), cVar.f31626b, cVar.f31627c, cVar.f31628d, cVar.f31629e, cVar.f31630f, cVar.f31631g, cVar.f31632h));
            }
            return new f(this.f31616a, arrayList, this.f31621f, this.f31622g);
        }
    }

    static final class c {

        /* renamed from: a, reason: collision with root package name */
        final float f31625a;

        /* renamed from: b, reason: collision with root package name */
        final float f31626b;

        /* renamed from: c, reason: collision with root package name */
        final float f31627c;

        /* renamed from: d, reason: collision with root package name */
        final float f31628d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f31629e;

        /* renamed from: f, reason: collision with root package name */
        final float f31630f;

        /* renamed from: g, reason: collision with root package name */
        final float f31631g;

        /* renamed from: h, reason: collision with root package name */
        final float f31632h;

        c(float f8, float f9, float f10, float f11) {
            this(f8, f9, f10, f11, false, 0.0f, 0.0f, 0.0f);
        }

        static c a(c cVar, c cVar2, float f8) {
            return new c(E3.a.a(cVar.f31625a, cVar2.f31625a, f8), E3.a.a(cVar.f31626b, cVar2.f31626b, f8), E3.a.a(cVar.f31627c, cVar2.f31627c, f8), E3.a.a(cVar.f31628d, cVar2.f31628d, f8));
        }

        c(float f8, float f9, float f10, float f11, boolean z7, float f12, float f13, float f14) {
            this.f31625a = f8;
            this.f31626b = f9;
            this.f31627c = f10;
            this.f31628d = f11;
            this.f31629e = z7;
            this.f31630f = f12;
            this.f31631g = f13;
            this.f31632h = f14;
        }
    }

    static f m(f fVar, f fVar2, float f8) {
        if (fVar.f() != fVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List g8 = fVar.g();
        List g9 = fVar2.g();
        if (g8.size() != g9.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < fVar.g().size(); i8++) {
            arrayList.add(c.a((c) g8.get(i8), (c) g9.get(i8), f8));
        }
        return new f(fVar.f(), arrayList, E3.a.c(fVar.b(), fVar2.b(), f8), E3.a.c(fVar.i(), fVar2.i(), f8));
    }

    static f n(f fVar, float f8) {
        b bVar = new b(fVar.f(), f8);
        float f9 = (f8 - fVar.j().f31626b) - (fVar.j().f31628d / 2.0f);
        int size = fVar.g().size() - 1;
        while (size >= 0) {
            c cVar = (c) fVar.g().get(size);
            bVar.d(f9 + (cVar.f31628d / 2.0f), cVar.f31627c, cVar.f31628d, size >= fVar.b() && size <= fVar.i(), cVar.f31629e);
            f9 += cVar.f31628d;
            size--;
        }
        return bVar.i();
    }

    c a() {
        return (c) this.f31613b.get(this.f31614c);
    }

    int b() {
        return this.f31614c;
    }

    c c() {
        return (c) this.f31613b.get(0);
    }

    c d() {
        for (int i8 = 0; i8 < this.f31613b.size(); i8++) {
            c cVar = (c) this.f31613b.get(i8);
            if (!cVar.f31629e) {
                return cVar;
            }
        }
        return null;
    }

    List e() {
        return this.f31613b.subList(this.f31614c, this.f31615d + 1);
    }

    float f() {
        return this.f31612a;
    }

    List g() {
        return this.f31613b;
    }

    c h() {
        return (c) this.f31613b.get(this.f31615d);
    }

    int i() {
        return this.f31615d;
    }

    c j() {
        return (c) this.f31613b.get(r0.size() - 1);
    }

    c k() {
        for (int size = this.f31613b.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f31613b.get(size);
            if (!cVar.f31629e) {
                return cVar;
            }
        }
        return null;
    }

    int l() {
        Iterator it = this.f31613b.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (((c) it.next()).f31629e) {
                i8++;
            }
        }
        return this.f31613b.size() - i8;
    }

    private f(float f8, List list, int i8, int i9) {
        this.f31612a = f8;
        this.f31613b = DesugarCollections.unmodifiableList(list);
        this.f31614c = i8;
        this.f31615d = i9;
    }
}
