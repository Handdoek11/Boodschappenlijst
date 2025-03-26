package j$.time.format;

import java.util.ArrayList;

/* loaded from: classes3.dex */
final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    private final f[] f37091a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f37092b;

    e(ArrayList arrayList, boolean z7) {
        this((f[]) arrayList.toArray(new f[arrayList.size()]), z7);
    }

    e(f[] fVarArr, boolean z7) {
        this.f37091a = fVarArr;
        this.f37092b = z7;
    }

    public final e a() {
        return !this.f37092b ? this : new e(this.f37091a, false);
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        int length = sb.length();
        boolean z7 = this.f37092b;
        if (z7) {
            pVar.g();
        }
        try {
            for (f fVar : this.f37091a) {
                if (!fVar.j(pVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z7) {
                pVar.a();
            }
            return true;
        } finally {
            if (z7) {
                pVar.a();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f[] fVarArr = this.f37091a;
        if (fVarArr != null) {
            boolean z7 = this.f37092b;
            sb.append(z7 ? "[" : "(");
            for (f fVar : fVarArr) {
                sb.append(fVar);
            }
            sb.append(z7 ? "]" : ")");
        }
        return sb.toString();
    }
}
