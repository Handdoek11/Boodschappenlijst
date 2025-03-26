package X5;

import J6.AbstractC0650j;

/* loaded from: classes2.dex */
public final class m extends Z5.d {

    /* renamed from: y, reason: collision with root package name */
    private final int f5956y;

    /* renamed from: z, reason: collision with root package name */
    private final V5.a f5957z;

    public /* synthetic */ m(int i8, int i9, V5.a aVar, int i10, AbstractC0650j abstractC0650j) {
        this((i10 & 1) != 0 ? 4096 : i8, (i10 & 2) != 0 ? 1000 : i9, (i10 & 4) != 0 ? V5.b.f5731a : aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Z5.d
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void l(Y5.a aVar) {
        J6.r.e(aVar, "instance");
        super.l(aVar);
        if (aVar.h().limit() != this.f5956y) {
            StringBuilder sb = new StringBuilder();
            sb.append("Buffer size mismatch. Expected: ");
            sb.append(this.f5956y);
            sb.append(", actual: ");
            sb.append(aVar.h().limit());
            throw new IllegalStateException(sb.toString().toString());
        }
        if (aVar == Y5.a.f6125j.a()) {
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled");
        }
        if (aVar == a.f5944g.a()) {
            throw new IllegalStateException("Empty instance couldn't be recycled");
        }
        if (aVar.D() != 0) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.");
        }
        if (aVar.B() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.");
        }
        if (aVar.C() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Z5.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Y5.a e(Y5.a aVar) {
        J6.r.e(aVar, "instance");
        Y5.a aVar2 = (Y5.a) super.e(aVar);
        aVar2.I();
        aVar2.r();
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Z5.d
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void f(Y5.a aVar) {
        J6.r.e(aVar, "instance");
        this.f5957z.a(aVar.h());
        super.f(aVar);
        aVar.H();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Z5.d
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Y5.a h() {
        return new Y5.a(this.f5957z.b(this.f5956y), null, this, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i8, int i9, V5.a aVar) {
        super(i9);
        J6.r.e(aVar, "allocator");
        this.f5956y = i8;
        this.f5957z = aVar;
    }
}
