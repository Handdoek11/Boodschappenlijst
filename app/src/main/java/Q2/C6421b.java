package q2;

import java.util.Map;
import t2.InterfaceC6791a;

/* renamed from: q2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6421b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6791a f40933a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f40934b;

    C6421b(InterfaceC6791a interfaceC6791a, Map map) {
        if (interfaceC6791a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f40933a = interfaceC6791a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f40934b = map;
    }

    @Override // q2.f
    InterfaceC6791a e() {
        return this.f40933a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f40933a.equals(fVar.e()) && this.f40934b.equals(fVar.h());
    }

    @Override // q2.f
    Map h() {
        return this.f40934b;
    }

    public int hashCode() {
        return ((this.f40933a.hashCode() ^ 1000003) * 1000003) ^ this.f40934b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f40933a + ", values=" + this.f40934b + "}";
    }
}
