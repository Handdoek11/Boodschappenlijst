package T4;

import J6.r;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f5227a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f5228b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f5229c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f5230d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f5231e;

    public e(Boolean bool, Double d8, Integer num, Integer num2, Long l8) {
        this.f5227a = bool;
        this.f5228b = d8;
        this.f5229c = num;
        this.f5230d = num2;
        this.f5231e = l8;
    }

    public final Integer a() {
        return this.f5230d;
    }

    public final Long b() {
        return this.f5231e;
    }

    public final Boolean c() {
        return this.f5227a;
    }

    public final Integer d() {
        return this.f5229c;
    }

    public final Double e() {
        return this.f5228b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return r.a(this.f5227a, eVar.f5227a) && r.a(this.f5228b, eVar.f5228b) && r.a(this.f5229c, eVar.f5229c) && r.a(this.f5230d, eVar.f5230d) && r.a(this.f5231e, eVar.f5231e);
    }

    public int hashCode() {
        Boolean bool = this.f5227a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d8 = this.f5228b;
        int hashCode2 = (hashCode + (d8 == null ? 0 : d8.hashCode())) * 31;
        Integer num = this.f5229c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f5230d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l8 = this.f5231e;
        return hashCode4 + (l8 != null ? l8.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f5227a + ", sessionSamplingRate=" + this.f5228b + ", sessionRestartTimeout=" + this.f5229c + ", cacheDuration=" + this.f5230d + ", cacheUpdatedTime=" + this.f5231e + ')';
    }
}
