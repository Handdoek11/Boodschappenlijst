package I5;

import java.util.Iterator;
import java.util.List;

/* renamed from: I5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0633g {

    /* renamed from: a, reason: collision with root package name */
    private final String f3260a;

    /* renamed from: b, reason: collision with root package name */
    private final List f3261b;

    /* renamed from: c, reason: collision with root package name */
    private final double f3262c;

    public C0633g(String str, List list) {
        Double d8;
        Object obj;
        String d9;
        Double i8;
        J6.r.e(str, "value");
        J6.r.e(list, "params");
        this.f3260a = str;
        this.f3261b = list;
        Iterator it = list.iterator();
        while (true) {
            d8 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (J6.r.a(((C0634h) obj).c(), "q")) {
                    break;
                }
            }
        }
        C0634h c0634h = (C0634h) obj;
        double d10 = 1.0d;
        if (c0634h != null && (d9 = c0634h.d()) != null && (i8 = S6.h.i(d9)) != null) {
            double doubleValue = i8.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                d8 = i8;
            }
            if (d8 != null) {
                d10 = d8.doubleValue();
            }
        }
        this.f3262c = d10;
    }

    public final String a() {
        return this.f3260a;
    }

    public final List b() {
        return this.f3261b;
    }

    public final double c() {
        return this.f3262c;
    }

    public final String d() {
        return this.f3260a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0633g)) {
            return false;
        }
        C0633g c0633g = (C0633g) obj;
        return J6.r.a(this.f3260a, c0633g.f3260a) && J6.r.a(this.f3261b, c0633g.f3261b);
    }

    public int hashCode() {
        return (this.f3260a.hashCode() * 31) + this.f3261b.hashCode();
    }

    public String toString() {
        return "HeaderValue(value=" + this.f3260a + ", params=" + this.f3261b + ')';
    }
}
