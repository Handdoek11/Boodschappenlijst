package m7;

/* loaded from: classes2.dex */
public final class o extends C6232f {

    /* renamed from: c, reason: collision with root package name */
    private final l7.a f39459c;

    /* renamed from: d, reason: collision with root package name */
    private int f39460d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(D d8, l7.a aVar) {
        super(d8);
        J6.r.e(d8, "writer");
        J6.r.e(aVar, "json");
        this.f39459c = aVar;
    }

    @Override // m7.C6232f
    public void b() {
        n(true);
        this.f39460d++;
    }

    @Override // m7.C6232f
    public void c() {
        n(false);
        j("\n");
        int i8 = this.f39460d;
        for (int i9 = 0; i9 < i8; i9++) {
            j(this.f39459c.d().i());
        }
    }

    @Override // m7.C6232f
    public void o() {
        e(' ');
    }

    @Override // m7.C6232f
    public void p() {
        this.f39460d--;
    }
}
