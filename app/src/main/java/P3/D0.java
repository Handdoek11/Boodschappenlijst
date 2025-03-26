package p3;

import java.util.List;

/* loaded from: classes.dex */
final class D0 extends F0 {

    /* renamed from: u, reason: collision with root package name */
    final transient int f40164u;

    /* renamed from: v, reason: collision with root package name */
    final transient int f40165v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ F0 f40166w;

    D0(F0 f02, int i8, int i9) {
        this.f40166w = f02;
        this.f40164u = i8;
        this.f40165v = i9;
    }

    @Override // p3.B0
    final int c() {
        return this.f40166w.d() + this.f40164u + this.f40165v;
    }

    @Override // p3.B0
    final int d() {
        return this.f40166w.d() + this.f40164u;
    }

    @Override // p3.B0
    final Object[] e() {
        return this.f40166w.e();
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC6374x0.a(i8, this.f40165v, "index");
        return this.f40166w.get(i8 + this.f40164u);
    }

    @Override // p3.F0
    /* renamed from: j */
    public final F0 subList(int i8, int i9) {
        AbstractC6374x0.c(i8, i9, this.f40165v);
        int i10 = this.f40164u;
        return this.f40166w.subList(i8 + i10, i9 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40165v;
    }

    @Override // p3.F0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }
}
