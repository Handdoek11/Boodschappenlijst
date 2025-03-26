package j$.time.format;

import j$.time.w;

/* loaded from: classes3.dex */
final class l implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37106a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f37107b;

    public /* synthetic */ l(int i8, Object obj) {
        this.f37106a = i8;
        this.f37107b = obj;
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        switch (this.f37106a) {
            case 0:
                sb.append((String) this.f37107b);
                break;
            default:
                w wVar = (w) pVar.f((a) this.f37107b);
                if (wVar != null) {
                    sb.append(wVar.i());
                    break;
                }
                break;
        }
        return true;
    }

    public final String toString() {
        switch (this.f37106a) {
            case 0:
                return "'" + ((String) this.f37107b).replace("'", "''") + "'";
            default:
                return "ZoneRegionId()";
        }
    }
}
