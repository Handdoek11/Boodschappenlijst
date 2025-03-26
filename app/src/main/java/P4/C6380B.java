package p4;

import p4.AbstractC6385G;

/* renamed from: p4.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6380B extends AbstractC6385G {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6385G.a f40407a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6385G.c f40408b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6385G.b f40409c;

    C6380B(AbstractC6385G.a aVar, AbstractC6385G.c cVar, AbstractC6385G.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f40407a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f40408b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f40409c = bVar;
    }

    @Override // p4.AbstractC6385G
    public AbstractC6385G.a a() {
        return this.f40407a;
    }

    @Override // p4.AbstractC6385G
    public AbstractC6385G.b c() {
        return this.f40409c;
    }

    @Override // p4.AbstractC6385G
    public AbstractC6385G.c d() {
        return this.f40408b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6385G)) {
            return false;
        }
        AbstractC6385G abstractC6385G = (AbstractC6385G) obj;
        return this.f40407a.equals(abstractC6385G.a()) && this.f40408b.equals(abstractC6385G.d()) && this.f40409c.equals(abstractC6385G.c());
    }

    public int hashCode() {
        return ((((this.f40407a.hashCode() ^ 1000003) * 1000003) ^ this.f40408b.hashCode()) * 1000003) ^ this.f40409c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f40407a + ", osData=" + this.f40408b + ", deviceData=" + this.f40409c + "}";
    }
}
