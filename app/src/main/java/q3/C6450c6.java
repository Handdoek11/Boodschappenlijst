package q3;

/* renamed from: q3.c6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6450c6 extends AbstractC6490h6 {

    /* renamed from: a, reason: collision with root package name */
    private String f41622a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f41623b;

    /* renamed from: c, reason: collision with root package name */
    private int f41624c;

    /* renamed from: d, reason: collision with root package name */
    private byte f41625d;

    C6450c6() {
    }

    @Override // q3.AbstractC6490h6
    public final AbstractC6490h6 a(boolean z7) {
        this.f41623b = true;
        this.f41625d = (byte) (1 | this.f41625d);
        return this;
    }

    @Override // q3.AbstractC6490h6
    public final AbstractC6490h6 b(int i8) {
        this.f41624c = 1;
        this.f41625d = (byte) (this.f41625d | 2);
        return this;
    }

    @Override // q3.AbstractC6490h6
    public final AbstractC6498i6 c() {
        String str;
        if (this.f41625d == 3 && (str = this.f41622a) != null) {
            return new C6466e6(str, this.f41623b, this.f41624c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f41622a == null) {
            sb.append(" libraryName");
        }
        if ((this.f41625d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f41625d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final AbstractC6490h6 d(String str) {
        this.f41622a = "play-services-code-scanner";
        return this;
    }
}
