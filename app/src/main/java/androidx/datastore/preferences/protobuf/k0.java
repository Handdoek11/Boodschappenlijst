package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
class k0 extends i0 {
    k0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public j0 g(Object obj) {
        return ((AbstractC0897v) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(j0 j0Var) {
        return j0Var.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(j0 j0Var) {
        return j0Var.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public j0 k(j0 j0Var, j0 j0Var2) {
        return j0Var2.equals(j0.e()) ? j0Var : j0.k(j0Var, j0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public j0 n() {
        return j0.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, j0 j0Var) {
        p(obj, j0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, j0 j0Var) {
        ((AbstractC0897v) obj).unknownFields = j0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public j0 r(j0 j0Var) {
        j0Var.j();
        return j0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(j0 j0Var, p0 p0Var) {
        j0Var.o(p0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(j0 j0Var, p0 p0Var) {
        j0Var.q(p0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    void j(Object obj) {
        g(obj).j();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    boolean q(b0 b0Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(j0 j0Var, int i8, int i9) {
        j0Var.n(o0.c(i8, 5), Integer.valueOf(i9));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(j0 j0Var, int i8, long j8) {
        j0Var.n(o0.c(i8, 1), Long.valueOf(j8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(j0 j0Var, int i8, j0 j0Var2) {
        j0Var.n(o0.c(i8, 3), j0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(j0 j0Var, int i8, AbstractC0883g abstractC0883g) {
        j0Var.n(o0.c(i8, 2), abstractC0883g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(j0 j0Var, int i8, long j8) {
        j0Var.n(o0.c(i8, 0), Long.valueOf(j8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.i0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public j0 f(Object obj) {
        j0 g8 = g(obj);
        if (g8 != j0.e()) {
            return g8;
        }
        j0 l8 = j0.l();
        p(obj, l8);
        return l8;
    }
}
