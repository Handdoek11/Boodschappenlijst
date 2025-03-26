package r3;

import java.util.List;

/* renamed from: r3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6694l extends AbstractC6695m {

    /* renamed from: u, reason: collision with root package name */
    final transient int f42575u;

    /* renamed from: v, reason: collision with root package name */
    final transient int f42576v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ AbstractC6695m f42577w;

    C6694l(AbstractC6695m abstractC6695m, int i8, int i9) {
        this.f42577w = abstractC6695m;
        this.f42575u = i8;
        this.f42576v = i9;
    }

    @Override // r3.AbstractC6692j
    final int c() {
        return this.f42577w.d() + this.f42575u + this.f42576v;
    }

    @Override // r3.AbstractC6692j
    final int d() {
        return this.f42577w.d() + this.f42575u;
    }

    @Override // r3.AbstractC6692j
    final Object[] e() {
        return this.f42577w.e();
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC6685c.a(i8, this.f42576v, "index");
        return this.f42577w.get(i8 + this.f42575u);
    }

    @Override // r3.AbstractC6695m
    /* renamed from: j */
    public final AbstractC6695m subList(int i8, int i9) {
        AbstractC6685c.c(i8, i9, this.f42576v);
        AbstractC6695m abstractC6695m = this.f42577w;
        int i10 = this.f42575u;
        return abstractC6695m.subList(i8 + i10, i9 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42576v;
    }

    @Override // r3.AbstractC6695m, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }
}
