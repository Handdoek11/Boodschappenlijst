package r3;

/* loaded from: classes.dex */
final class C extends G {

    /* renamed from: a, reason: collision with root package name */
    private String f42540a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f42541b;

    /* renamed from: c, reason: collision with root package name */
    private int f42542c;

    /* renamed from: d, reason: collision with root package name */
    private byte f42543d;

    C() {
    }

    @Override // r3.G
    public final G a(boolean z7) {
        this.f42541b = true;
        this.f42543d = (byte) (1 | this.f42543d);
        return this;
    }

    @Override // r3.G
    public final G b(int i8) {
        this.f42542c = 1;
        this.f42543d = (byte) (this.f42543d | 2);
        return this;
    }

    @Override // r3.G
    public final H c() {
        String str;
        if (this.f42543d == 3 && (str = this.f42540a) != null) {
            return new E(str, this.f42541b, this.f42542c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f42540a == null) {
            sb.append(" libraryName");
        }
        if ((this.f42543d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f42543d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final G d(String str) {
        this.f42540a = "common";
        return this;
    }
}
