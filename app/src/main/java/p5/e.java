package p5;

import com.headcode.ourgroceries.android.C5688z0;
import s5.Q;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f40837a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40838b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f40839c;

    /* renamed from: d, reason: collision with root package name */
    private final int f40840d;

    private e(String str, String str2, Q q8, int i8) {
        this.f40837a = str;
        this.f40838b = str2;
        this.f40839c = q8;
        this.f40840d = i8;
    }

    public static e e(C5688z0 c5688z0) {
        return new e(c5688z0.T(), c5688z0.W(), c5688z0.U(), c5688z0.U() == Q.SHOPPING ? c5688z0.Q() : 0);
    }

    public static e f(C5688z0 c5688z0) {
        return new e(c5688z0.T(), c5688z0.W(), c5688z0.U(), 0);
    }

    public int a() {
        return this.f40840d;
    }

    public String b() {
        return this.f40837a;
    }

    public Q c() {
        return this.f40839c;
    }

    public String d() {
        return this.f40838b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f40840d == eVar.f40840d && this.f40837a.equals(eVar.f40837a) && this.f40838b.equals(eVar.f40838b) && this.f40839c == eVar.f40839c;
    }

    public int hashCode() {
        return (((((this.f40837a.hashCode() * 31) + this.f40838b.hashCode()) * 31) + this.f40839c.hashCode()) * 31) + this.f40840d;
    }

    public String toString() {
        return "ItemListItem{mId='" + this.f40837a + "', mName='" + this.f40838b + "', mListType=" + this.f40839c + ", mActiveCount=" + this.f40840d + '}';
    }
}
