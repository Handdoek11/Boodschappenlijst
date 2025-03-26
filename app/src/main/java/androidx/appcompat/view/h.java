package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import z0.AbstractC7030i0;
import z0.C7026g0;
import z0.InterfaceC7028h0;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f7050c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC7028h0 f7051d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7052e;

    /* renamed from: b, reason: collision with root package name */
    private long f7049b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC7030i0 f7053f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f7048a = new ArrayList();

    class a extends AbstractC7030i0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f7054a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f7055b = 0;

        a() {
        }

        @Override // z0.InterfaceC7028h0
        public void b(View view) {
            int i8 = this.f7055b + 1;
            this.f7055b = i8;
            if (i8 == h.this.f7048a.size()) {
                InterfaceC7028h0 interfaceC7028h0 = h.this.f7051d;
                if (interfaceC7028h0 != null) {
                    interfaceC7028h0.b(null);
                }
                d();
            }
        }

        @Override // z0.AbstractC7030i0, z0.InterfaceC7028h0
        public void c(View view) {
            if (this.f7054a) {
                return;
            }
            this.f7054a = true;
            InterfaceC7028h0 interfaceC7028h0 = h.this.f7051d;
            if (interfaceC7028h0 != null) {
                interfaceC7028h0.c(null);
            }
        }

        void d() {
            this.f7055b = 0;
            this.f7054a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f7052e) {
            Iterator it = this.f7048a.iterator();
            while (it.hasNext()) {
                ((C7026g0) it.next()).c();
            }
            this.f7052e = false;
        }
    }

    void b() {
        this.f7052e = false;
    }

    public h c(C7026g0 c7026g0) {
        if (!this.f7052e) {
            this.f7048a.add(c7026g0);
        }
        return this;
    }

    public h d(C7026g0 c7026g0, C7026g0 c7026g02) {
        this.f7048a.add(c7026g0);
        c7026g02.m(c7026g0.d());
        this.f7048a.add(c7026g02);
        return this;
    }

    public h e(long j8) {
        if (!this.f7052e) {
            this.f7049b = j8;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f7052e) {
            this.f7050c = interpolator;
        }
        return this;
    }

    public h g(InterfaceC7028h0 interfaceC7028h0) {
        if (!this.f7052e) {
            this.f7051d = interfaceC7028h0;
        }
        return this;
    }

    public void h() {
        if (this.f7052e) {
            return;
        }
        Iterator it = this.f7048a.iterator();
        while (it.hasNext()) {
            C7026g0 c7026g0 = (C7026g0) it.next();
            long j8 = this.f7049b;
            if (j8 >= 0) {
                c7026g0.i(j8);
            }
            Interpolator interpolator = this.f7050c;
            if (interpolator != null) {
                c7026g0.j(interpolator);
            }
            if (this.f7051d != null) {
                c7026g0.k(this.f7053f);
            }
            c7026g0.o();
        }
        this.f7052e = true;
    }
}
