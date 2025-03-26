package androidx.privacysandbox.ads.adservices.topics;

import s.AbstractC6719b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f10691a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f10692b;

    /* renamed from: androidx.privacysandbox.ads.adservices.topics.a$a, reason: collision with other inner class name */
    public static final class C0178a {

        /* renamed from: a, reason: collision with root package name */
        private String f10693a = "";

        /* renamed from: b, reason: collision with root package name */
        private boolean f10694b = true;

        public final a a() {
            if (this.f10693a.length() > 0) {
                return new a(this.f10693a, this.f10694b);
            }
            throw new IllegalStateException("adsSdkName must be set");
        }

        public final C0178a b(String str) {
            J6.r.e(str, "adsSdkName");
            this.f10693a = str;
            return this;
        }

        public final C0178a c(boolean z7) {
            this.f10694b = z7;
            return this;
        }
    }

    public a(String str, boolean z7) {
        J6.r.e(str, "adsSdkName");
        this.f10691a = str;
        this.f10692b = z7;
    }

    public final String a() {
        return this.f10691a;
    }

    public final boolean b() {
        return this.f10692b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return J6.r.a(this.f10691a, aVar.f10691a) && this.f10692b == aVar.f10692b;
    }

    public int hashCode() {
        return (this.f10691a.hashCode() * 31) + AbstractC6719b.a(this.f10692b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f10691a + ", shouldRecordObservation=" + this.f10692b;
    }
}
