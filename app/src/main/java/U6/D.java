package U6;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5388a;

    /* renamed from: b, reason: collision with root package name */
    public final I6.l f5389b;

    public D(Object obj, I6.l lVar) {
        this.f5388a = obj;
        this.f5389b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d8 = (D) obj;
        return J6.r.a(this.f5388a, d8.f5388a) && J6.r.a(this.f5389b, d8.f5389b);
    }

    public int hashCode() {
        Object obj = this.f5388a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f5389b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f5388a + ", onCancellation=" + this.f5389b + ')';
    }
}
