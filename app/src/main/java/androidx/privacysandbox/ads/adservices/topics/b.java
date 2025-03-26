package androidx.privacysandbox.ads.adservices.topics;

import j$.util.Objects;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List f10695a;

    public b(List list) {
        J6.r.e(list, "topics");
        this.f10695a = list;
    }

    public final List a() {
        return this.f10695a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f10695a.size() != bVar.f10695a.size()) {
            return false;
        }
        return J6.r.a(new HashSet(this.f10695a), new HashSet(bVar.f10695a));
    }

    public int hashCode() {
        return Objects.hash(this.f10695a);
    }

    public String toString() {
        return "Topics=" + this.f10695a;
    }
}
