package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    final b f11274a;

    /* renamed from: b, reason: collision with root package name */
    a f11275b = new a();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f11276a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f11277b;

        /* renamed from: c, reason: collision with root package name */
        int f11278c;

        /* renamed from: d, reason: collision with root package name */
        int f11279d;

        /* renamed from: e, reason: collision with root package name */
        int f11280e;

        a() {
        }

        void a(int i8) {
            this.f11276a = i8 | this.f11276a;
        }

        boolean b() {
            int i8 = this.f11276a;
            if ((i8 & 7) != 0 && (i8 & c(this.f11279d, this.f11277b)) == 0) {
                return false;
            }
            int i9 = this.f11276a;
            if ((i9 & 112) != 0 && (i9 & (c(this.f11279d, this.f11278c) << 4)) == 0) {
                return false;
            }
            int i10 = this.f11276a;
            if ((i10 & 1792) != 0 && (i10 & (c(this.f11280e, this.f11277b) << 8)) == 0) {
                return false;
            }
            int i11 = this.f11276a;
            return (i11 & 28672) == 0 || (i11 & (c(this.f11280e, this.f11278c) << 12)) != 0;
        }

        int c(int i8, int i9) {
            if (i8 > i9) {
                return 1;
            }
            return i8 == i9 ? 2 : 4;
        }

        void d() {
            this.f11276a = 0;
        }

        void e(int i8, int i9, int i10, int i11) {
            this.f11277b = i8;
            this.f11278c = i9;
            this.f11279d = i10;
            this.f11280e = i11;
        }
    }

    interface b {
        View a(int i8);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    s(b bVar) {
        this.f11274a = bVar;
    }

    View a(int i8, int i9, int i10, int i11) {
        int c8 = this.f11274a.c();
        int d8 = this.f11274a.d();
        int i12 = i9 > i8 ? 1 : -1;
        View view = null;
        while (i8 != i9) {
            View a8 = this.f11274a.a(i8);
            this.f11275b.e(c8, d8, this.f11274a.b(a8), this.f11274a.e(a8));
            if (i10 != 0) {
                this.f11275b.d();
                this.f11275b.a(i10);
                if (this.f11275b.b()) {
                    return a8;
                }
            }
            if (i11 != 0) {
                this.f11275b.d();
                this.f11275b.a(i11);
                if (this.f11275b.b()) {
                    view = a8;
                }
            }
            i8 += i12;
        }
        return view;
    }

    boolean b(View view, int i8) {
        this.f11275b.e(this.f11274a.c(), this.f11274a.d(), this.f11274a.b(view), this.f11274a.e(view));
        if (i8 == 0) {
            return false;
        }
        this.f11275b.d();
        this.f11275b.a(i8);
        return this.f11275b.b();
    }
}
