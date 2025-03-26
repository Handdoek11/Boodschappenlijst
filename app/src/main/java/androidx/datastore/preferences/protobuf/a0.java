package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class a0 implements K {

    /* renamed from: a, reason: collision with root package name */
    private final M f9345a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9346b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f9347c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9348d;

    a0(M m8, String str, Object[] objArr) {
        this.f9345a = m8;
        this.f9346b = str;
        this.f9347c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f9348d = charAt;
            return;
        }
        int i8 = charAt & 8191;
        int i9 = 13;
        int i10 = 1;
        while (true) {
            int i11 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 < 55296) {
                this.f9348d = i8 | (charAt2 << i9);
                return;
            } else {
                i8 |= (charAt2 & 8191) << i9;
                i9 += 13;
                i10 = i11;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public boolean a() {
        return (this.f9348d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public M b() {
        return this.f9345a;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public X c() {
        return (this.f9348d & 1) == 1 ? X.PROTO2 : X.PROTO3;
    }

    Object[] d() {
        return this.f9347c;
    }

    String e() {
        return this.f9346b;
    }
}
