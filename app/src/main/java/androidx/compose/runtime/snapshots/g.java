package androidx.compose.runtime.snapshots;

import I6.l;

/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: g, reason: collision with root package name */
    private final c f8131g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f8132h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f8133i;

    /* renamed from: j, reason: collision with root package name */
    private final l f8134j;

    /* renamed from: k, reason: collision with root package name */
    private final l f8135k;

    /* renamed from: l, reason: collision with root package name */
    private final c f8136l;

    public g(c cVar, l lVar, boolean z7, boolean z8) {
        l d8;
        super(0, d.f8098v.a(), null);
        this.f8131g = cVar;
        this.f8132h = z7;
        this.f8133i = z8;
        this.f8134j = e.p(lVar, (cVar == null || (d8 = cVar.d()) == null) ? ((a) e.f8119j.get()).d() : d8, z7);
        this.f8136l = this;
    }

    private final c n() {
        c cVar = this.f8131g;
        return cVar == null ? (c) e.f8119j.get() : cVar;
    }

    @Override // androidx.compose.runtime.snapshots.c
    public void a() {
        c cVar;
        l(true);
        if (!this.f8133i || (cVar = this.f8131g) == null) {
            return;
        }
        cVar.a();
    }

    @Override // androidx.compose.runtime.snapshots.c
    public int b() {
        return n().b();
    }

    @Override // androidx.compose.runtime.snapshots.c
    public d c() {
        return n().c();
    }

    @Override // androidx.compose.runtime.snapshots.c
    public l d() {
        return this.f8134j;
    }

    @Override // androidx.compose.runtime.snapshots.c
    public boolean e() {
        return n().e();
    }

    @Override // androidx.compose.runtime.snapshots.c
    public l g() {
        return this.f8135k;
    }

    @Override // androidx.compose.runtime.snapshots.c
    public void i(z.g gVar) {
        n().i(gVar);
    }
}
