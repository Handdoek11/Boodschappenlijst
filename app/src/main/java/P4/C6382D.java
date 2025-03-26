package p4;

import p4.AbstractC6385G;

/* renamed from: p4.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6382D extends AbstractC6385G.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f40416a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40417b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40418c;

    /* renamed from: d, reason: collision with root package name */
    private final long f40419d;

    /* renamed from: e, reason: collision with root package name */
    private final long f40420e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f40421f;

    /* renamed from: g, reason: collision with root package name */
    private final int f40422g;

    /* renamed from: h, reason: collision with root package name */
    private final String f40423h;

    /* renamed from: i, reason: collision with root package name */
    private final String f40424i;

    C6382D(int i8, String str, int i9, long j8, long j9, boolean z7, int i10, String str2, String str3) {
        this.f40416a = i8;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f40417b = str;
        this.f40418c = i9;
        this.f40419d = j8;
        this.f40420e = j9;
        this.f40421f = z7;
        this.f40422g = i10;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f40423h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f40424i = str3;
    }

    @Override // p4.AbstractC6385G.b
    public int a() {
        return this.f40416a;
    }

    @Override // p4.AbstractC6385G.b
    public int b() {
        return this.f40418c;
    }

    @Override // p4.AbstractC6385G.b
    public long d() {
        return this.f40420e;
    }

    @Override // p4.AbstractC6385G.b
    public boolean e() {
        return this.f40421f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6385G.b)) {
            return false;
        }
        AbstractC6385G.b bVar = (AbstractC6385G.b) obj;
        return this.f40416a == bVar.a() && this.f40417b.equals(bVar.g()) && this.f40418c == bVar.b() && this.f40419d == bVar.j() && this.f40420e == bVar.d() && this.f40421f == bVar.e() && this.f40422g == bVar.i() && this.f40423h.equals(bVar.f()) && this.f40424i.equals(bVar.h());
    }

    @Override // p4.AbstractC6385G.b
    public String f() {
        return this.f40423h;
    }

    @Override // p4.AbstractC6385G.b
    public String g() {
        return this.f40417b;
    }

    @Override // p4.AbstractC6385G.b
    public String h() {
        return this.f40424i;
    }

    public int hashCode() {
        int hashCode = (((((this.f40416a ^ 1000003) * 1000003) ^ this.f40417b.hashCode()) * 1000003) ^ this.f40418c) * 1000003;
        long j8 = this.f40419d;
        int i8 = (hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f40420e;
        return ((((((((i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ (this.f40421f ? 1231 : 1237)) * 1000003) ^ this.f40422g) * 1000003) ^ this.f40423h.hashCode()) * 1000003) ^ this.f40424i.hashCode();
    }

    @Override // p4.AbstractC6385G.b
    public int i() {
        return this.f40422g;
    }

    @Override // p4.AbstractC6385G.b
    public long j() {
        return this.f40419d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f40416a + ", model=" + this.f40417b + ", availableProcessors=" + this.f40418c + ", totalRam=" + this.f40419d + ", diskSpace=" + this.f40420e + ", isEmulator=" + this.f40421f + ", state=" + this.f40422g + ", manufacturer=" + this.f40423h + ", modelClass=" + this.f40424i + "}";
    }
}
