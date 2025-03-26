package j2;

import android.content.Context;
import j2.v;
import l2.C6170a;
import l2.InterfaceC6171b;
import p2.C6325d;
import r2.C6665g;
import r2.C6666h;
import r2.C6667i;
import r2.C6668j;
import r2.InterfaceC6662d;
import r2.N;
import r2.X;
import w6.InterfaceC6894a;

/* renamed from: j2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC6056e {

    /* renamed from: j2.e$b */
    private static final class b implements v.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f38191a;

        private b() {
        }

        @Override // j2.v.a
        public v a() {
            l2.d.a(this.f38191a, Context.class);
            return new c(this.f38191a);
        }

        @Override // j2.v.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b b(Context context) {
            this.f38191a = (Context) l2.d.b(context);
            return this;
        }
    }

    /* renamed from: j2.e$c */
    private static final class c extends v {

        /* renamed from: A, reason: collision with root package name */
        private InterfaceC6894a f38192A;

        /* renamed from: B, reason: collision with root package name */
        private InterfaceC6894a f38193B;

        /* renamed from: C, reason: collision with root package name */
        private InterfaceC6894a f38194C;

        /* renamed from: D, reason: collision with root package name */
        private InterfaceC6894a f38195D;

        /* renamed from: E, reason: collision with root package name */
        private InterfaceC6894a f38196E;

        /* renamed from: o, reason: collision with root package name */
        private final c f38197o;

        /* renamed from: s, reason: collision with root package name */
        private InterfaceC6894a f38198s;

        /* renamed from: t, reason: collision with root package name */
        private InterfaceC6894a f38199t;

        /* renamed from: u, reason: collision with root package name */
        private InterfaceC6894a f38200u;

        /* renamed from: v, reason: collision with root package name */
        private InterfaceC6894a f38201v;

        /* renamed from: w, reason: collision with root package name */
        private InterfaceC6894a f38202w;

        /* renamed from: x, reason: collision with root package name */
        private InterfaceC6894a f38203x;

        /* renamed from: y, reason: collision with root package name */
        private InterfaceC6894a f38204y;

        /* renamed from: z, reason: collision with root package name */
        private InterfaceC6894a f38205z;

        private void f(Context context) {
            this.f38198s = C6170a.a(C6062k.a());
            InterfaceC6171b a8 = l2.c.a(context);
            this.f38199t = a8;
            k2.j a9 = k2.j.a(a8, t2.c.a(), t2.d.a());
            this.f38200u = a9;
            this.f38201v = C6170a.a(k2.l.a(this.f38199t, a9));
            this.f38202w = X.a(this.f38199t, C6665g.a(), C6667i.a());
            this.f38203x = C6170a.a(C6666h.a(this.f38199t));
            this.f38204y = C6170a.a(N.a(t2.c.a(), t2.d.a(), C6668j.a(), this.f38202w, this.f38203x));
            p2.g b8 = p2.g.b(t2.c.a());
            this.f38205z = b8;
            p2.i a10 = p2.i.a(this.f38199t, this.f38204y, b8, t2.d.a());
            this.f38192A = a10;
            InterfaceC6894a interfaceC6894a = this.f38198s;
            InterfaceC6894a interfaceC6894a2 = this.f38201v;
            InterfaceC6894a interfaceC6894a3 = this.f38204y;
            this.f38193B = C6325d.a(interfaceC6894a, interfaceC6894a2, a10, interfaceC6894a3, interfaceC6894a3);
            InterfaceC6894a interfaceC6894a4 = this.f38199t;
            InterfaceC6894a interfaceC6894a5 = this.f38201v;
            InterfaceC6894a interfaceC6894a6 = this.f38204y;
            this.f38194C = q2.s.a(interfaceC6894a4, interfaceC6894a5, interfaceC6894a6, this.f38192A, this.f38198s, interfaceC6894a6, t2.c.a(), t2.d.a(), this.f38204y);
            InterfaceC6894a interfaceC6894a7 = this.f38198s;
            InterfaceC6894a interfaceC6894a8 = this.f38204y;
            this.f38195D = q2.w.a(interfaceC6894a7, interfaceC6894a8, this.f38192A, interfaceC6894a8);
            this.f38196E = C6170a.a(w.a(t2.c.a(), t2.d.a(), this.f38193B, this.f38194C, this.f38195D));
        }

        @Override // j2.v
        InterfaceC6662d d() {
            return (InterfaceC6662d) this.f38204y.get();
        }

        @Override // j2.v
        u e() {
            return (u) this.f38196E.get();
        }

        private c(Context context) {
            this.f38197o = this;
            f(context);
        }
    }

    public static v.a a() {
        return new b();
    }
}
