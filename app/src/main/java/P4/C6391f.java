package p4;

import java.util.List;
import p4.AbstractC6384F;

/* renamed from: p4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6391f extends AbstractC6384F.d {

    /* renamed from: a, reason: collision with root package name */
    private final List f40630a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40631b;

    /* renamed from: p4.f$b */
    static final class b extends AbstractC6384F.d.a {

        /* renamed from: a, reason: collision with root package name */
        private List f40632a;

        /* renamed from: b, reason: collision with root package name */
        private String f40633b;

        b() {
        }

        @Override // p4.AbstractC6384F.d.a
        public AbstractC6384F.d a() {
            List list = this.f40632a;
            if (list != null) {
                return new C6391f(list, this.f40633b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // p4.AbstractC6384F.d.a
        public AbstractC6384F.d.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f40632a = list;
            return this;
        }

        @Override // p4.AbstractC6384F.d.a
        public AbstractC6384F.d.a c(String str) {
            this.f40633b = str;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.d
    public List b() {
        return this.f40630a;
    }

    @Override // p4.AbstractC6384F.d
    public String c() {
        return this.f40631b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.d)) {
            return false;
        }
        AbstractC6384F.d dVar = (AbstractC6384F.d) obj;
        if (this.f40630a.equals(dVar.b())) {
            String str = this.f40631b;
            if (str == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f40630a.hashCode() ^ 1000003) * 1000003;
        String str = this.f40631b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f40630a + ", orgId=" + this.f40631b + "}";
    }

    private C6391f(List list, String str) {
        this.f40630a = list;
        this.f40631b = str;
    }
}
