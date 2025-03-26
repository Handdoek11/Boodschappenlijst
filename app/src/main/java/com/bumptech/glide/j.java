package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import d2.AbstractC5703e;
import d2.AbstractC5709k;
import d2.AbstractC5710l;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class j extends Z1.a implements Cloneable {

    /* renamed from: f0, reason: collision with root package name */
    protected static final Z1.f f12565f0 = (Z1.f) ((Z1.f) ((Z1.f) new Z1.f().i(L1.a.f3694c)).b0(g.LOW)).i0(true);

    /* renamed from: R, reason: collision with root package name */
    private final Context f12566R;

    /* renamed from: S, reason: collision with root package name */
    private final k f12567S;

    /* renamed from: T, reason: collision with root package name */
    private final Class f12568T;

    /* renamed from: U, reason: collision with root package name */
    private final b f12569U;

    /* renamed from: V, reason: collision with root package name */
    private final d f12570V;

    /* renamed from: W, reason: collision with root package name */
    private l f12571W;

    /* renamed from: X, reason: collision with root package name */
    private Object f12572X;

    /* renamed from: Y, reason: collision with root package name */
    private List f12573Y;

    /* renamed from: Z, reason: collision with root package name */
    private j f12574Z;

    /* renamed from: a0, reason: collision with root package name */
    private j f12575a0;

    /* renamed from: b0, reason: collision with root package name */
    private Float f12576b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f12577c0 = true;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f12578d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f12579e0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12580a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f12581b;

        static {
            int[] iArr = new int[g.values().length];
            f12581b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12581b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12581b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12581b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f12580a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12580a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12580a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12580a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12580a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12580a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12580a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12580a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    protected j(b bVar, k kVar, Class cls, Context context) {
        this.f12569U = bVar;
        this.f12567S = kVar;
        this.f12568T = cls;
        this.f12566R = context;
        this.f12571W = kVar.r(cls);
        this.f12570V = bVar.i();
        w0(kVar.p());
        b(kVar.q());
    }

    private boolean B0(Z1.a aVar, Z1.c cVar) {
        return !aVar.K() && cVar.l();
    }

    private j G0(Object obj) {
        if (I()) {
            return clone().G0(obj);
        }
        this.f12572X = obj;
        this.f12578d0 = true;
        return (j) e0();
    }

    private Z1.c H0(Object obj, a2.h hVar, Z1.e eVar, Z1.a aVar, Z1.d dVar, l lVar, g gVar, int i8, int i9, Executor executor) {
        Context context = this.f12566R;
        d dVar2 = this.f12570V;
        return Z1.h.z(context, dVar2, obj, this.f12572X, this.f12568T, aVar, i8, i9, gVar, hVar, eVar, this.f12573Y, dVar, dVar2.f(), lVar.c(), executor);
    }

    private Z1.c r0(a2.h hVar, Z1.e eVar, Z1.a aVar, Executor executor) {
        return s0(new Object(), hVar, eVar, null, this.f12571W, aVar.A(), aVar.x(), aVar.w(), aVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Z1.c s0(Object obj, a2.h hVar, Z1.e eVar, Z1.d dVar, l lVar, g gVar, int i8, int i9, Z1.a aVar, Executor executor) {
        Z1.d dVar2;
        Z1.d dVar3;
        if (this.f12575a0 != null) {
            dVar3 = new Z1.b(obj, dVar);
            dVar2 = dVar3;
        } else {
            dVar2 = null;
            dVar3 = dVar;
        }
        Z1.c t02 = t0(obj, hVar, eVar, dVar3, lVar, gVar, i8, i9, aVar, executor);
        if (dVar2 == null) {
            return t02;
        }
        int x7 = this.f12575a0.x();
        int w7 = this.f12575a0.w();
        if (AbstractC5710l.u(i8, i9) && !this.f12575a0.S()) {
            x7 = aVar.x();
            w7 = aVar.w();
        }
        j jVar = this.f12575a0;
        Z1.b bVar = dVar2;
        bVar.q(t02, jVar.s0(obj, hVar, eVar, bVar, jVar.f12571W, jVar.A(), x7, w7, this.f12575a0, executor));
        return bVar;
    }

    private Z1.c t0(Object obj, a2.h hVar, Z1.e eVar, Z1.d dVar, l lVar, g gVar, int i8, int i9, Z1.a aVar, Executor executor) {
        j jVar = this.f12574Z;
        if (jVar == null) {
            if (this.f12576b0 == null) {
                return H0(obj, hVar, eVar, aVar, dVar, lVar, gVar, i8, i9, executor);
            }
            Z1.i iVar = new Z1.i(obj, dVar);
            iVar.p(H0(obj, hVar, eVar, aVar, iVar, lVar, gVar, i8, i9, executor), H0(obj, hVar, eVar, aVar.clone().h0(this.f12576b0.floatValue()), iVar, lVar, v0(gVar), i8, i9, executor));
            return iVar;
        }
        if (this.f12579e0) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        l lVar2 = jVar.f12577c0 ? lVar : jVar.f12571W;
        g A7 = jVar.L() ? this.f12574Z.A() : v0(gVar);
        int x7 = this.f12574Z.x();
        int w7 = this.f12574Z.w();
        if (AbstractC5710l.u(i8, i9) && !this.f12574Z.S()) {
            x7 = aVar.x();
            w7 = aVar.w();
        }
        Z1.i iVar2 = new Z1.i(obj, dVar);
        Z1.c H02 = H0(obj, hVar, eVar, aVar, iVar2, lVar, gVar, i8, i9, executor);
        this.f12579e0 = true;
        j jVar2 = this.f12574Z;
        Z1.c s02 = jVar2.s0(obj, hVar, eVar, iVar2, lVar2, A7, x7, w7, jVar2, executor);
        this.f12579e0 = false;
        iVar2.p(H02, s02);
        return iVar2;
    }

    private g v0(g gVar) {
        int i8 = a.f12581b[gVar.ordinal()];
        if (i8 == 1) {
            return g.NORMAL;
        }
        if (i8 == 2) {
            return g.HIGH;
        }
        if (i8 == 3 || i8 == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + A());
    }

    private void w0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p0((Z1.e) it.next());
        }
    }

    private a2.h y0(a2.h hVar, Z1.e eVar, Z1.a aVar, Executor executor) {
        AbstractC5709k.d(hVar);
        if (!this.f12578d0) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Z1.c r02 = r0(hVar, eVar, aVar, executor);
        Z1.c i8 = hVar.i();
        if (r02.i(i8) && !B0(aVar, i8)) {
            if (!((Z1.c) AbstractC5709k.d(i8)).isRunning()) {
                i8.k();
            }
            return hVar;
        }
        this.f12567S.n(hVar);
        hVar.c(r02);
        this.f12567S.z(hVar, r02);
        return hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a2.i A0(android.widget.ImageView r4) {
        /*
            r3 = this;
            d2.AbstractC5710l.a()
            d2.AbstractC5709k.d(r4)
            boolean r0 = r3.R()
            if (r0 != 0) goto L4c
            boolean r0 = r3.P()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.j.a.f12580a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            Z1.a r0 = r3.clone()
            Z1.a r0 = r0.V()
            goto L4d
        L31:
            Z1.a r0 = r3.clone()
            Z1.a r0 = r0.W()
            goto L4d
        L3a:
            Z1.a r0 = r3.clone()
            Z1.a r0 = r0.V()
            goto L4d
        L43:
            Z1.a r0 = r3.clone()
            Z1.a r0 = r0.U()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            com.bumptech.glide.d r1 = r3.f12570V
            java.lang.Class r2 = r3.f12568T
            a2.i r4 = r1.a(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = d2.AbstractC5703e.b()
            a2.h r4 = r3.y0(r4, r1, r0, r2)
            a2.i r4 = (a2.i) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.j.A0(android.widget.ImageView):a2.i");
    }

    public j C0(Z1.e eVar) {
        if (I()) {
            return clone().C0(eVar);
        }
        this.f12573Y = null;
        return p0(eVar);
    }

    public j D0(File file) {
        return G0(file);
    }

    public j E0(Object obj) {
        return G0(obj);
    }

    public j F0(String str) {
        return G0(str);
    }

    @Override // Z1.a
    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return super.equals(jVar) && Objects.equals(this.f12568T, jVar.f12568T) && this.f12571W.equals(jVar.f12571W) && Objects.equals(this.f12572X, jVar.f12572X) && Objects.equals(this.f12573Y, jVar.f12573Y) && Objects.equals(this.f12574Z, jVar.f12574Z) && Objects.equals(this.f12575a0, jVar.f12575a0) && Objects.equals(this.f12576b0, jVar.f12576b0) && this.f12577c0 == jVar.f12577c0 && this.f12578d0 == jVar.f12578d0;
    }

    @Override // Z1.a
    public int hashCode() {
        return AbstractC5710l.q(this.f12578d0, AbstractC5710l.q(this.f12577c0, AbstractC5710l.p(this.f12576b0, AbstractC5710l.p(this.f12575a0, AbstractC5710l.p(this.f12574Z, AbstractC5710l.p(this.f12573Y, AbstractC5710l.p(this.f12572X, AbstractC5710l.p(this.f12571W, AbstractC5710l.p(this.f12568T, super.hashCode())))))))));
    }

    public j p0(Z1.e eVar) {
        if (I()) {
            return clone().p0(eVar);
        }
        if (eVar != null) {
            if (this.f12573Y == null) {
                this.f12573Y = new ArrayList();
            }
            this.f12573Y.add(eVar);
        }
        return (j) e0();
    }

    @Override // Z1.a
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public j b(Z1.a aVar) {
        AbstractC5709k.d(aVar);
        return (j) super.b(aVar);
    }

    @Override // Z1.a
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public j clone() {
        j jVar = (j) super.clone();
        jVar.f12571W = jVar.f12571W.clone();
        if (jVar.f12573Y != null) {
            jVar.f12573Y = new ArrayList(jVar.f12573Y);
        }
        j jVar2 = jVar.f12574Z;
        if (jVar2 != null) {
            jVar.f12574Z = jVar2.clone();
        }
        j jVar3 = jVar.f12575a0;
        if (jVar3 != null) {
            jVar.f12575a0 = jVar3.clone();
        }
        return jVar;
    }

    public a2.h x0(a2.h hVar) {
        return z0(hVar, null, AbstractC5703e.b());
    }

    a2.h z0(a2.h hVar, Z1.e eVar, Executor executor) {
        return y0(hVar, eVar, this, executor);
    }
}
