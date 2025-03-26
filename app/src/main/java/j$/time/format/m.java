package j$.time.format;

/* loaded from: classes3.dex */
final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    private final j$.time.temporal.a f37108a;

    /* renamed from: b, reason: collision with root package name */
    private final v f37109b;

    /* renamed from: c, reason: collision with root package name */
    private final b f37110c;

    /* renamed from: d, reason: collision with root package name */
    private volatile i f37111d;

    m(j$.time.temporal.a aVar, v vVar, b bVar) {
        this.f37108a = aVar;
        this.f37109b = vVar;
        this.f37110c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        String a8;
        Long e8 = pVar.e(this.f37108a);
        if (e8 == null) {
            return false;
        }
        j$.time.chrono.n nVar = (j$.time.chrono.n) pVar.d().v(j$.time.temporal.n.e());
        if (nVar == null || nVar == j$.time.chrono.u.f37068d) {
            b bVar = this.f37110c;
            long longValue = e8.longValue();
            v vVar = this.f37109b;
            pVar.c();
            a8 = bVar.f37088a.a(longValue, vVar);
        } else {
            b bVar2 = this.f37110c;
            long longValue2 = e8.longValue();
            v vVar2 = this.f37109b;
            pVar.c();
            a8 = bVar2.f37088a.a(longValue2, vVar2);
        }
        if (a8 != null) {
            sb.append(a8);
            return true;
        }
        if (this.f37111d == null) {
            this.f37111d = new i(this.f37108a, 1, 19, u.NORMAL);
        }
        return this.f37111d.j(pVar, sb);
    }

    public final String toString() {
        v vVar = v.FULL;
        j$.time.temporal.a aVar = this.f37108a;
        v vVar2 = this.f37109b;
        if (vVar2 == vVar) {
            return "Text(" + aVar + ")";
        }
        return "Text(" + aVar + "," + vVar2 + ")";
    }
}
