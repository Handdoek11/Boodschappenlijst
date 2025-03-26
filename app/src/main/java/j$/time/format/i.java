package j$.time.format;

/* loaded from: classes3.dex */
class i implements f {

    /* renamed from: f, reason: collision with root package name */
    static final long[] f37094f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a, reason: collision with root package name */
    final Enum f37095a;

    /* renamed from: b, reason: collision with root package name */
    final int f37096b;

    /* renamed from: c, reason: collision with root package name */
    final int f37097c;

    /* renamed from: d, reason: collision with root package name */
    private final u f37098d;

    /* renamed from: e, reason: collision with root package name */
    final int f37099e;

    /* JADX WARN: Multi-variable type inference failed */
    i(j$.time.temporal.r rVar, int i8, int i9, u uVar) {
        this.f37095a = (Enum) rVar;
        this.f37096b = i8;
        this.f37097c = i9;
        this.f37098d = uVar;
        this.f37099e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected i(j$.time.temporal.r rVar, int i8, int i9, u uVar, int i10) {
        this.f37095a = (Enum) rVar;
        this.f37096b = i8;
        this.f37097c = i9;
        this.f37098d = uVar;
        this.f37099e = i10;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.r, java.lang.Enum] */
    i b() {
        return this.f37099e == -1 ? this : new i(this.f37095a, this.f37096b, this.f37097c, this.f37098d, -1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j$.time.temporal.r, java.lang.Enum] */
    i c(int i8) {
        int i9 = this.f37099e + i8;
        return new i(this.f37095a, this.f37096b, this.f37097c, this.f37098d, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.r, java.lang.Enum, java.lang.Object] */
    @Override // j$.time.format.f
    public boolean j(p pVar, StringBuilder sb) {
        ?? r02 = this.f37095a;
        Long e8 = pVar.e(r02);
        if (e8 == null) {
            return false;
        }
        long longValue = e8.longValue();
        s b8 = pVar.b();
        String l8 = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l8.length();
        int i8 = this.f37097c;
        if (length > i8) {
            throw new j$.time.c("Field " + ((Object) r02) + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i8);
        }
        b8.getClass();
        int i9 = this.f37096b;
        u uVar = this.f37098d;
        if (longValue >= 0) {
            int i10 = c.f37089a[uVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    sb.append('+');
                }
            } else if (i9 < 19 && longValue >= f37094f[i9]) {
                sb.append('+');
            }
        } else {
            int i11 = c.f37089a[uVar.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                sb.append('-');
            } else if (i11 == 4) {
                throw new j$.time.c("Field " + ((Object) r02) + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i12 = 0; i12 < i9 - l8.length(); i12++) {
            sb.append('0');
        }
        sb.append(l8);
        return true;
    }

    public String toString() {
        Enum r02 = this.f37095a;
        int i8 = this.f37097c;
        u uVar = this.f37098d;
        int i9 = this.f37096b;
        if (i9 == 1 && i8 == 19 && uVar == u.NORMAL) {
            return "Value(" + r02 + ")";
        }
        if (i9 == i8 && uVar == u.NOT_NEGATIVE) {
            return "Value(" + r02 + "," + i9 + ")";
        }
        return "Value(" + r02 + "," + i9 + "," + i8 + "," + uVar + ")";
    }
}
