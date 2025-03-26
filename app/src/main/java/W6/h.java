package W6;

import J6.r;
import Z6.B;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class h extends B {

    /* renamed from: v, reason: collision with root package name */
    private final b f5875v;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReferenceArray f5876w;

    public h(long j8, h hVar, b bVar, int i8) {
        super(j8, hVar, i8);
        this.f5875v = bVar;
        this.f5876w = new AtomicReferenceArray(c.f5850b * 2);
    }

    private final void z(int i8, Object obj) {
        this.f5876w.lazySet(i8 * 2, obj);
    }

    public final void A(int i8, Object obj) {
        this.f5876w.set((i8 * 2) + 1, obj);
    }

    public final void B(int i8, Object obj) {
        z(i8, obj);
    }

    @Override // Z6.B
    public int n() {
        return c.f5850b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        r4 = u().f5841c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        Z6.w.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // Z6.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(int r4, java.lang.Throwable r5, A6.g r6) {
        /*
            r3 = this;
            int r5 = W6.c.f5850b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.v(r4)
        Le:
            java.lang.Object r1 = r3.w(r4)
            boolean r2 = r1 instanceof U6.W0
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof W6.l
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            Z6.E r2 = W6.c.j()
            if (r1 == r2) goto L63
            Z6.E r2 = W6.c.i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            Z6.E r2 = W6.c.p()
            if (r1 == r2) goto Le
            Z6.E r2 = W6.c.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            Z6.E r4 = W6.c.f()
            if (r1 == r4) goto L62
            Z6.E r4 = W6.c.f5852d
            if (r1 != r4) goto L40
            goto L62
        L40:
            Z6.E r4 = W6.c.z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.s(r4)
            if (r0 == 0) goto L73
            W6.b r4 = r3.u()
            I6.l r4 = r4.f5841c
            if (r4 == 0) goto L73
            Z6.w.b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            Z6.E r2 = W6.c.j()
            goto L7f
        L7b:
            Z6.E r2 = W6.c.i()
        L7f:
            boolean r1 = r3.r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.s(r4)
            r1 = r0 ^ 1
            r3.x(r4, r1)
            if (r0 == 0) goto L9a
            W6.b r4 = r3.u()
            I6.l r4 = r4.f5841c
            if (r4 == 0) goto L9a
            Z6.w.b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W6.h.o(int, java.lang.Throwable, A6.g):void");
    }

    public final boolean r(int i8, Object obj, Object obj2) {
        return Z5.c.a(this.f5876w, (i8 * 2) + 1, obj, obj2);
    }

    public final void s(int i8) {
        z(i8, null);
    }

    public final Object t(int i8, Object obj) {
        return this.f5876w.getAndSet((i8 * 2) + 1, obj);
    }

    public final b u() {
        b bVar = this.f5875v;
        r.b(bVar);
        return bVar;
    }

    public final Object v(int i8) {
        return this.f5876w.get(i8 * 2);
    }

    public final Object w(int i8) {
        return this.f5876w.get((i8 * 2) + 1);
    }

    public final void x(int i8, boolean z7) {
        if (z7) {
            u().x0((this.f6448t * c.f5850b) + i8);
        }
        p();
    }

    public final Object y(int i8) {
        Object v7 = v(i8);
        s(i8);
        return v7;
    }
}
