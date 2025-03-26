package androidx.privacysandbox.ads.adservices.topics;

import H.AbstractC0626b;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final long f10696a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10697b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10698c;

    public c(long j8, long j9, int i8) {
        this.f10696a = j8;
        this.f10697b = j9;
        this.f10698c = i8;
    }

    public final long a() {
        return this.f10697b;
    }

    public final long b() {
        return this.f10696a;
    }

    public final int c() {
        return this.f10698c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10696a == cVar.f10696a && this.f10697b == cVar.f10697b && this.f10698c == cVar.f10698c;
    }

    public int hashCode() {
        return (((AbstractC0626b.a(this.f10696a) * 31) + AbstractC0626b.a(this.f10697b)) * 31) + this.f10698c;
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f10696a + ", ModelVersion=" + this.f10697b + ", TopicCode=" + this.f10698c + " }");
    }
}
