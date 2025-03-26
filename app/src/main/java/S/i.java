package S;

import Q.p;

/* loaded from: classes.dex */
public abstract class i {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[LOOP:0: B:5:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a A[EDGE_INSN: B:41:0x007a->B:37:0x007a BREAK  A[LOOP:0: B:5:0x0016->B:36:0x0075], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final S.h a(Q.p r10, boolean r11) {
        /*
            Q.A r0 = r10.B()
            r1 = 8
            int r1 = Q.D.a(r1)
            int r2 = Q.A.a(r0)
            r2 = r2 & r1
            r3 = 0
            if (r2 == 0) goto L7a
            B.e$c r0 = r0.c()
        L16:
            if (r0 == 0) goto L7a
            int r2 = r0.m()
            r2 = r2 & r1
            if (r2 == 0) goto L6e
            r2 = r0
            r4 = r3
        L21:
            if (r2 == 0) goto L6e
            boolean r5 = r2 instanceof Q.M
            if (r5 == 0) goto L29
            r3 = r2
            goto L7a
        L29:
            int r5 = r2.m()
            r5 = r5 & r1
            if (r5 == 0) goto L69
            boolean r5 = r2 instanceof Q.AbstractC0683e
            if (r5 == 0) goto L69
            r5 = r2
            Q.e r5 = (Q.AbstractC0683e) r5
            B.e$c r5 = r5.r()
            r6 = 0
            r7 = r6
        L3d:
            r8 = 1
            if (r5 == 0) goto L66
            int r9 = r5.m()
            r9 = r9 & r1
            if (r9 == 0) goto L61
            int r7 = r7 + 1
            if (r7 != r8) goto L4d
            r2 = r5
            goto L61
        L4d:
            if (r4 != 0) goto L58
            u.b r4 = new u.b
            r8 = 16
            B.e$c[] r8 = new B.e.c[r8]
            r4.<init>(r8, r6)
        L58:
            if (r2 == 0) goto L5e
            r4.c(r2)
            r2 = r3
        L5e:
            r4.c(r5)
        L61:
            B.e$c r5 = r5.k()
            goto L3d
        L66:
            if (r7 != r8) goto L69
            goto L21
        L69:
            B.e$c r2 = Q.AbstractC0682d.a(r4)
            goto L21
        L6e:
            int r2 = r0.j()
            r2 = r2 & r1
            if (r2 == 0) goto L7a
            B.e$c r0 = r0.k()
            goto L16
        L7a:
            J6.r.b(r3)
            Q.M r3 = (Q.M) r3
            B.e$c r0 = r3.f()
            S.e r1 = r10.j()
            J6.r.b(r1)
            S.h r2 = new S.h
            r2.<init>(r0, r11, r10, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: S.i.a(Q.p, boolean):S.h");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(h hVar) {
        return hVar.k() + 2000000000;
    }

    public static final p f(p pVar, I6.l lVar) {
        for (p E7 = pVar.E(); E7 != null; E7 = E7.E()) {
            if (((Boolean) lVar.invoke(E7)).booleanValue()) {
                return E7;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e A[LOOP:0: B:5:0x0016->B:38:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[EDGE_INSN: B:43:0x0083->B:39:0x0083 BREAK  A[LOOP:0: B:5:0x0016->B:38:0x007e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Q.M g(Q.p r9) {
        /*
            Q.A r9 = r9.B()
            r0 = 8
            int r0 = Q.D.a(r0)
            int r1 = Q.A.a(r9)
            r1 = r1 & r0
            r2 = 0
            if (r1 == 0) goto L83
            B.e$c r9 = r9.c()
        L16:
            if (r9 == 0) goto L83
            int r1 = r9.m()
            r1 = r1 & r0
            if (r1 == 0) goto L77
            r1 = r9
            r3 = r2
        L21:
            if (r1 == 0) goto L77
            boolean r4 = r1 instanceof Q.M
            if (r4 == 0) goto L32
            r4 = r1
            Q.M r4 = (Q.M) r4
            boolean r4 = r4.h()
            if (r4 == 0) goto L72
            r2 = r1
            goto L83
        L32:
            int r4 = r1.m()
            r4 = r4 & r0
            if (r4 == 0) goto L72
            boolean r4 = r1 instanceof Q.AbstractC0683e
            if (r4 == 0) goto L72
            r4 = r1
            Q.e r4 = (Q.AbstractC0683e) r4
            B.e$c r4 = r4.r()
            r5 = 0
            r6 = r5
        L46:
            r7 = 1
            if (r4 == 0) goto L6f
            int r8 = r4.m()
            r8 = r8 & r0
            if (r8 == 0) goto L6a
            int r6 = r6 + 1
            if (r6 != r7) goto L56
            r1 = r4
            goto L6a
        L56:
            if (r3 != 0) goto L61
            u.b r3 = new u.b
            r7 = 16
            B.e$c[] r7 = new B.e.c[r7]
            r3.<init>(r7, r5)
        L61:
            if (r1 == 0) goto L67
            r3.c(r1)
            r1 = r2
        L67:
            r3.c(r4)
        L6a:
            B.e$c r4 = r4.k()
            goto L46
        L6f:
            if (r6 != r7) goto L72
            goto L21
        L72:
            B.e$c r1 = Q.AbstractC0682d.a(r3)
            goto L21
        L77:
            int r1 = r9.j()
            r1 = r1 & r0
            if (r1 == 0) goto L83
            B.e$c r9 = r9.k()
            goto L16
        L83:
            Q.M r2 = (Q.M) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: S.i.g(Q.p):Q.M");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c h(h hVar) {
        return (c) f.a(hVar.p(), k.f5032a.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(h hVar) {
        return hVar.k() + 1000000000;
    }
}
