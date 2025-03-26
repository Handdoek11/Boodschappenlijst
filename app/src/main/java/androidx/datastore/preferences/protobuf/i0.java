package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class i0 {
    i0() {
    }

    abstract void a(Object obj, int i8, int i9);

    abstract void b(Object obj, int i8, long j8);

    abstract void c(Object obj, int i8, Object obj2);

    abstract void d(Object obj, int i8, AbstractC0883g abstractC0883g);

    abstract void e(Object obj, int i8, long j8);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    abstract Object k(Object obj, Object obj2);

    final void l(Object obj, b0 b0Var) {
        while (b0Var.y() != Integer.MAX_VALUE && m(obj, b0Var)) {
        }
    }

    final boolean m(Object obj, b0 b0Var) {
        int a8 = b0Var.a();
        int a9 = o0.a(a8);
        int b8 = o0.b(a8);
        if (b8 == 0) {
            e(obj, a9, b0Var.K());
            return true;
        }
        if (b8 == 1) {
            b(obj, a9, b0Var.e());
            return true;
        }
        if (b8 == 2) {
            d(obj, a9, b0Var.B());
            return true;
        }
        if (b8 != 3) {
            if (b8 == 4) {
                return false;
            }
            if (b8 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            a(obj, a9, b0Var.i());
            return true;
        }
        Object n8 = n();
        int c8 = o0.c(a9, 4);
        l(n8, b0Var);
        if (c8 != b0Var.a()) {
            throw InvalidProtocolBufferException.a();
        }
        c(obj, a9, r(n8));
        return true;
    }

    abstract Object n();

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, Object obj2);

    abstract boolean q(b0 b0Var);

    abstract Object r(Object obj);

    abstract void s(Object obj, p0 p0Var);

    abstract void t(Object obj, p0 p0Var);
}
