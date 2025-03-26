package S6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class e implements R6.d {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f5136a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5137b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5138c;

    /* renamed from: d, reason: collision with root package name */
    private final I6.p f5139d;

    public static final class a implements Iterator, K6.a {

        /* renamed from: o, reason: collision with root package name */
        private int f5140o = -1;

        /* renamed from: s, reason: collision with root package name */
        private int f5141s;

        /* renamed from: t, reason: collision with root package name */
        private int f5142t;

        /* renamed from: u, reason: collision with root package name */
        private P6.i f5143u;

        /* renamed from: v, reason: collision with root package name */
        private int f5144v;

        a() {
            int i8 = P6.m.i(e.this.f5137b, 0, e.this.f5136a.length());
            this.f5141s = i8;
            this.f5142t = i8;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f5142t
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f5140o = r1
                r0 = 0
                r6.f5143u = r0
                goto L9e
            Lc:
                S6.e r0 = S6.e.this
                int r0 = S6.e.c(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f5144v
                int r0 = r0 + r3
                r6.f5144v = r0
                S6.e r4 = S6.e.this
                int r4 = S6.e.c(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f5142t
                S6.e r4 = S6.e.this
                java.lang.CharSequence r4 = S6.e.b(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                P6.i r0 = new P6.i
                int r1 = r6.f5141s
                S6.e r4 = S6.e.this
                java.lang.CharSequence r4 = S6.e.b(r4)
                int r4 = S6.h.J(r4)
                r0.<init>(r1, r4)
                r6.f5143u = r0
                r6.f5142t = r2
                goto L9c
            L47:
                S6.e r0 = S6.e.this
                I6.p r0 = S6.e.a(r0)
                S6.e r4 = S6.e.this
                java.lang.CharSequence r4 = S6.e.b(r4)
                int r5 = r6.f5142t
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                x6.o r0 = (x6.C6933o) r0
                if (r0 != 0) goto L77
                P6.i r0 = new P6.i
                int r1 = r6.f5141s
                S6.e r4 = S6.e.this
                java.lang.CharSequence r4 = S6.e.b(r4)
                int r4 = S6.h.J(r4)
                r0.<init>(r1, r4)
                r6.f5143u = r0
                r6.f5142t = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f5141s
                P6.i r4 = P6.m.m(r4, r2)
                r6.f5143u = r4
                int r2 = r2 + r0
                r6.f5141s = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f5142t = r2
            L9c:
                r6.f5140o = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: S6.e.a.a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public P6.i next() {
            if (this.f5140o == -1) {
                a();
            }
            if (this.f5140o == 0) {
                throw new NoSuchElementException();
            }
            P6.i iVar = this.f5143u;
            J6.r.c(iVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f5143u = null;
            this.f5140o = -1;
            return iVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f5140o == -1) {
                a();
            }
            return this.f5140o == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(CharSequence charSequence, int i8, int i9, I6.p pVar) {
        J6.r.e(charSequence, "input");
        J6.r.e(pVar, "getNextMatch");
        this.f5136a = charSequence;
        this.f5137b = i8;
        this.f5138c = i9;
        this.f5139d = pVar;
    }

    @Override // R6.d
    public Iterator iterator() {
        return new a();
    }
}
