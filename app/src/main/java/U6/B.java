package U6;

import J6.AbstractC0650j;

/* loaded from: classes2.dex */
final class B {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5367a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0727m f5368b;

    /* renamed from: c, reason: collision with root package name */
    public final I6.l f5369c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5370d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f5371e;

    public B(Object obj, AbstractC0727m abstractC0727m, I6.l lVar, Object obj2, Throwable th) {
        this.f5367a = obj;
        this.f5368b = abstractC0727m;
        this.f5369c = lVar;
        this.f5370d = obj2;
        this.f5371e = th;
    }

    public static /* synthetic */ B b(B b8, Object obj, AbstractC0727m abstractC0727m, I6.l lVar, Object obj2, Throwable th, int i8, Object obj3) {
        if ((i8 & 1) != 0) {
            obj = b8.f5367a;
        }
        if ((i8 & 2) != 0) {
            abstractC0727m = b8.f5368b;
        }
        AbstractC0727m abstractC0727m2 = abstractC0727m;
        if ((i8 & 4) != 0) {
            lVar = b8.f5369c;
        }
        I6.l lVar2 = lVar;
        if ((i8 & 8) != 0) {
            obj2 = b8.f5370d;
        }
        Object obj4 = obj2;
        if ((i8 & 16) != 0) {
            th = b8.f5371e;
        }
        return b8.a(obj, abstractC0727m2, lVar2, obj4, th);
    }

    public final B a(Object obj, AbstractC0727m abstractC0727m, I6.l lVar, Object obj2, Throwable th) {
        return new B(obj, abstractC0727m, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f5371e != null;
    }

    public final void d(C0733p c0733p, Throwable th) {
        AbstractC0727m abstractC0727m = this.f5368b;
        if (abstractC0727m != null) {
            c0733p.k(abstractC0727m, th);
        }
        I6.l lVar = this.f5369c;
        if (lVar != null) {
            c0733p.m(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b8 = (B) obj;
        return J6.r.a(this.f5367a, b8.f5367a) && J6.r.a(this.f5368b, b8.f5368b) && J6.r.a(this.f5369c, b8.f5369c) && J6.r.a(this.f5370d, b8.f5370d) && J6.r.a(this.f5371e, b8.f5371e);
    }

    public int hashCode() {
        Object obj = this.f5367a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC0727m abstractC0727m = this.f5368b;
        int hashCode2 = (hashCode + (abstractC0727m == null ? 0 : abstractC0727m.hashCode())) * 31;
        I6.l lVar = this.f5369c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f5370d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f5371e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f5367a + ", cancelHandler=" + this.f5368b + ", onCancellation=" + this.f5369c + ", idempotentResume=" + this.f5370d + ", cancelCause=" + this.f5371e + ')';
    }

    public /* synthetic */ B(Object obj, AbstractC0727m abstractC0727m, I6.l lVar, Object obj2, Throwable th, int i8, AbstractC0650j abstractC0650j) {
        this(obj, (i8 & 2) != 0 ? null : abstractC0727m, (i8 & 4) != 0 ? null : lVar, (i8 & 8) != 0 ? null : obj2, (i8 & 16) != 0 ? null : th);
    }
}
