package androidx.compose.runtime.snapshots;

import I6.l;
import kotlin.KotlinNothingValueException;
import u.C6806a;
import z.AbstractC6996e;

/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: q, reason: collision with root package name */
    private final b f8128q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f8129r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f8130s;

    public f(b bVar, l lVar, l lVar2, boolean z7, boolean z8) {
        l g8;
        l d8;
        super(0, d.f8098v.a(), e.p(lVar, (bVar == null || (d8 = bVar.d()) == null) ? ((a) e.f8119j.get()).d() : d8, z7), e.q(lVar2, (bVar == null || (g8 = bVar.g()) == null) ? ((a) e.f8119j.get()).g() : g8));
        this.f8128q = bVar;
        this.f8129r = z7;
        this.f8130s = z8;
    }

    private final b p() {
        b bVar = this.f8128q;
        return bVar == null ? (b) e.f8119j.get() : bVar;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.c
    public void a() {
        b bVar;
        l(true);
        if (!this.f8130s || (bVar = this.f8128q) == null) {
            return;
        }
        bVar.a();
    }

    @Override // androidx.compose.runtime.snapshots.c
    public int b() {
        return p().b();
    }

    @Override // androidx.compose.runtime.snapshots.c
    public d c() {
        return p().c();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.c
    public boolean e() {
        return p().e();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.c
    public int f() {
        return p().f();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.c
    public void i(z.g gVar) {
        p().i(gVar);
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.c
    public void m(int i8) {
        p().m(i8);
    }

    @Override // androidx.compose.runtime.snapshots.b
    public C6806a n() {
        return p().n();
    }

    @Override // androidx.compose.runtime.snapshots.b
    public void o(C6806a c6806a) {
        AbstractC6996e.a();
        throw new KotlinNothingValueException();
    }
}
