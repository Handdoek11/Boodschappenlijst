package e7;

import A6.g;
import Z6.B;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
final class f extends B {

    /* renamed from: v, reason: collision with root package name */
    private final AtomicReferenceArray f35361v;

    public f(long j8, f fVar, int i8) {
        super(j8, fVar, i8);
        this.f35361v = new AtomicReferenceArray(e.f35360f);
    }

    @Override // Z6.B
    public int n() {
        return e.f35360f;
    }

    @Override // Z6.B
    public void o(int i8, Throwable th, g gVar) {
        r().set(i8, e.f35359e);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f35361v;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f6448t + ", hashCode=" + hashCode() + ']';
    }
}
