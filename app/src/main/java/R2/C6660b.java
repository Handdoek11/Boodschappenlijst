package r2;

import j2.AbstractC6060i;
import j2.AbstractC6067p;

/* renamed from: r2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6660b extends AbstractC6669k {

    /* renamed from: a, reason: collision with root package name */
    private final long f42510a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6067p f42511b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6060i f42512c;

    C6660b(long j8, AbstractC6067p abstractC6067p, AbstractC6060i abstractC6060i) {
        this.f42510a = j8;
        if (abstractC6067p == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f42511b = abstractC6067p;
        if (abstractC6060i == null) {
            throw new NullPointerException("Null event");
        }
        this.f42512c = abstractC6060i;
    }

    @Override // r2.AbstractC6669k
    public AbstractC6060i b() {
        return this.f42512c;
    }

    @Override // r2.AbstractC6669k
    public long c() {
        return this.f42510a;
    }

    @Override // r2.AbstractC6669k
    public AbstractC6067p d() {
        return this.f42511b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6669k)) {
            return false;
        }
        AbstractC6669k abstractC6669k = (AbstractC6669k) obj;
        return this.f42510a == abstractC6669k.c() && this.f42511b.equals(abstractC6669k.d()) && this.f42512c.equals(abstractC6669k.b());
    }

    public int hashCode() {
        long j8 = this.f42510a;
        return ((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f42511b.hashCode()) * 1000003) ^ this.f42512c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f42510a + ", transportContext=" + this.f42511b + ", event=" + this.f42512c + "}";
    }
}
