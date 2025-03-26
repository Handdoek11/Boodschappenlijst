package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
final class q extends l {

    /* renamed from: h, reason: collision with root package name */
    private static final j$.sun.misc.a f37337h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f37338i;

    /* renamed from: e, reason: collision with root package name */
    r f37339e;

    /* renamed from: f, reason: collision with root package name */
    volatile r f37340f;

    /* renamed from: g, reason: collision with root package name */
    volatile Thread f37341g;
    volatile int lockState;

    static int i(Object obj, Object obj2) {
        int compareTo;
        if (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
        }
        return compareTo;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[PHI: r7
  0x004b: PHI (r7v3 java.lang.Class<?>) = (r7v2 java.lang.Class<?>), (r7v4 java.lang.Class<?>) binds: [B:24:0x0049, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    q(j$.util.concurrent.r r11) {
        /*
            r10 = this;
            r0 = -2
            r1 = 0
            r10.<init>(r0, r1, r1)
            r10.f37340f = r11
            r0 = r1
        L8:
            if (r11 == 0) goto L6c
            j$.util.concurrent.l r2 = r11.f37324d
            j$.util.concurrent.r r2 = (j$.util.concurrent.r) r2
            r11.f37344g = r1
            r11.f37343f = r1
            r3 = 0
            if (r0 != 0) goto L1b
            r11.f37342e = r1
            r11.f37346i = r3
        L19:
            r0 = r11
            goto L68
        L1b:
            java.lang.Object r4 = r11.f37322b
            int r5 = r11.f37321a
            r6 = r0
            r7 = r1
        L21:
            java.lang.Object r8 = r6.f37322b
            int r9 = r6.f37321a
            if (r9 <= r5) goto L29
            r8 = -1
            goto L51
        L29:
            if (r9 >= r5) goto L2d
            r8 = 1
            goto L51
        L2d:
            if (r7 != 0) goto L35
            java.lang.Class r7 = j$.util.concurrent.ConcurrentHashMap.c(r4)
            if (r7 == 0) goto L4b
        L35:
            int r9 = j$.util.concurrent.ConcurrentHashMap.f37287g
            if (r8 == 0) goto L48
            java.lang.Class r9 = r8.getClass()
            if (r9 == r7) goto L40
            goto L48
        L40:
            r9 = r4
            java.lang.Comparable r9 = (java.lang.Comparable) r9
            int r9 = r9.compareTo(r8)
            goto L49
        L48:
            r9 = r3
        L49:
            if (r9 != 0) goto L50
        L4b:
            int r8 = i(r4, r8)
            goto L51
        L50:
            r8 = r9
        L51:
            if (r8 > 0) goto L56
            j$.util.concurrent.r r9 = r6.f37343f
            goto L58
        L56:
            j$.util.concurrent.r r9 = r6.f37344g
        L58:
            if (r9 != 0) goto L6a
            r11.f37342e = r6
            if (r8 > 0) goto L61
            r6.f37343f = r11
            goto L63
        L61:
            r6.f37344g = r11
        L63:
            j$.util.concurrent.r r11 = c(r0, r11)
            goto L19
        L68:
            r11 = r2
            goto L8
        L6a:
            r6 = r9
            goto L21
        L6c:
            r10.f37339e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.<init>(j$.util.concurrent.r):void");
    }

    private final void d() {
        if (f37337h.c(this, f37338i, 0, 1)) {
            return;
        }
        boolean z7 = false;
        while (true) {
            int i8 = this.lockState;
            if ((i8 & (-3)) == 0) {
                if (f37337h.c(this, f37338i, i8, 1)) {
                    break;
                }
            } else if ((i8 & 2) == 0) {
                if (f37337h.c(this, f37338i, i8, i8 | 2)) {
                    this.f37341g = Thread.currentThread();
                    z7 = true;
                }
            } else if (z7) {
                LockSupport.park(this);
            }
        }
        if (z7) {
            this.f37341g = null;
        }
    }

    @Override // j$.util.concurrent.l
    final l a(int i8, Object obj) {
        Object obj2;
        Thread thread;
        Thread thread2;
        r rVar = null;
        if (obj != null) {
            l lVar = this.f37340f;
            while (lVar != null) {
                int i9 = this.lockState;
                if ((i9 & 3) != 0) {
                    if (lVar.f37321a == i8 && ((obj2 = lVar.f37322b) == obj || (obj2 != null && obj.equals(obj2)))) {
                        return lVar;
                    }
                    lVar = lVar.f37324d;
                } else {
                    j$.sun.misc.a aVar = f37337h;
                    long j8 = f37338i;
                    if (aVar.c(this, j8, i9, i9 + 4)) {
                        try {
                            r rVar2 = this.f37339e;
                            if (rVar2 != null) {
                                rVar = rVar2.b(i8, obj, null);
                            }
                            if (aVar.f(this, j8) == 6 && (thread2 = this.f37341g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return rVar;
                        } catch (Throwable th) {
                            if (f37337h.f(this, f37338i) == 6 && (thread = this.f37341g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ba, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7 A[LOOP:0: B:3:0x000c->B:61:0x00b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final j$.util.concurrent.r e(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.e(int, java.lang.Object, java.lang.Object):j$.util.concurrent.r");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x008e A[PHI: r0
  0x008e: PHI (r0v4 j$.util.concurrent.r) = (r0v3 j$.util.concurrent.r), (r0v12 j$.util.concurrent.r) binds: [B:55:0x008a, B:51:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean f(j$.util.concurrent.r r11) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.f(j$.util.concurrent.r):boolean");
    }

    static r g(r rVar, r rVar2) {
        r rVar3;
        if (rVar2 != null && (rVar3 = rVar2.f37344g) != null) {
            r rVar4 = rVar3.f37343f;
            rVar2.f37344g = rVar4;
            if (rVar4 != null) {
                rVar4.f37342e = rVar2;
            }
            r rVar5 = rVar2.f37342e;
            rVar3.f37342e = rVar5;
            if (rVar5 == null) {
                rVar3.f37346i = false;
                rVar = rVar3;
            } else if (rVar5.f37343f == rVar2) {
                rVar5.f37343f = rVar3;
            } else {
                rVar5.f37344g = rVar3;
            }
            rVar3.f37343f = rVar2;
            rVar2.f37342e = rVar3;
        }
        return rVar;
    }

    static r h(r rVar, r rVar2) {
        r rVar3;
        if (rVar2 != null && (rVar3 = rVar2.f37343f) != null) {
            r rVar4 = rVar3.f37344g;
            rVar2.f37343f = rVar4;
            if (rVar4 != null) {
                rVar4.f37342e = rVar2;
            }
            r rVar5 = rVar2.f37342e;
            rVar3.f37342e = rVar5;
            if (rVar5 == null) {
                rVar3.f37346i = false;
                rVar = rVar3;
            } else if (rVar5.f37344g == rVar2) {
                rVar5.f37344g = rVar3;
            } else {
                rVar5.f37343f = rVar3;
            }
            rVar3.f37344g = rVar2;
            rVar2.f37342e = rVar3;
        }
        return rVar;
    }

    static r c(r rVar, r rVar2) {
        r rVar3;
        rVar2.f37346i = true;
        while (true) {
            r rVar4 = rVar2.f37342e;
            if (rVar4 == null) {
                rVar2.f37346i = false;
                return rVar2;
            }
            if (!rVar4.f37346i || (rVar3 = rVar4.f37342e) == null) {
                break;
            }
            r rVar5 = rVar3.f37343f;
            if (rVar4 == rVar5) {
                r rVar6 = rVar3.f37344g;
                if (rVar6 != null && rVar6.f37346i) {
                    rVar6.f37346i = false;
                    rVar4.f37346i = false;
                    rVar3.f37346i = true;
                    rVar2 = rVar3;
                } else {
                    if (rVar2 == rVar4.f37344g) {
                        rVar = g(rVar, rVar4);
                        r rVar7 = rVar4.f37342e;
                        rVar3 = rVar7 == null ? null : rVar7.f37342e;
                        rVar4 = rVar7;
                        rVar2 = rVar4;
                    }
                    if (rVar4 != null) {
                        rVar4.f37346i = false;
                        if (rVar3 != null) {
                            rVar3.f37346i = true;
                            rVar = h(rVar, rVar3);
                        }
                    }
                }
            } else if (rVar5 != null && rVar5.f37346i) {
                rVar5.f37346i = false;
                rVar4.f37346i = false;
                rVar3.f37346i = true;
                rVar2 = rVar3;
            } else {
                if (rVar2 == rVar4.f37343f) {
                    rVar = h(rVar, rVar4);
                    r rVar8 = rVar4.f37342e;
                    rVar3 = rVar8 == null ? null : rVar8.f37342e;
                    rVar4 = rVar8;
                    rVar2 = rVar4;
                }
                if (rVar4 != null) {
                    rVar4.f37346i = false;
                    if (rVar3 != null) {
                        rVar3.f37346i = true;
                        rVar = g(rVar, rVar3);
                    }
                }
            }
        }
        return rVar;
    }

    static r b(r rVar, r rVar2) {
        while (rVar2 != null && rVar2 != rVar) {
            r rVar3 = rVar2.f37342e;
            if (rVar3 == null) {
                rVar2.f37346i = false;
                return rVar2;
            }
            if (rVar2.f37346i) {
                rVar2.f37346i = false;
                return rVar;
            }
            r rVar4 = rVar3.f37343f;
            if (rVar4 == rVar2) {
                r rVar5 = rVar3.f37344g;
                if (rVar5 != null && rVar5.f37346i) {
                    rVar5.f37346i = false;
                    rVar3.f37346i = true;
                    rVar = g(rVar, rVar3);
                    rVar3 = rVar2.f37342e;
                    rVar5 = rVar3 == null ? null : rVar3.f37344g;
                }
                if (rVar5 != null) {
                    r rVar6 = rVar5.f37343f;
                    r rVar7 = rVar5.f37344g;
                    if ((rVar7 == null || !rVar7.f37346i) && (rVar6 == null || !rVar6.f37346i)) {
                        rVar5.f37346i = true;
                    } else {
                        if (rVar7 == null || !rVar7.f37346i) {
                            if (rVar6 != null) {
                                rVar6.f37346i = false;
                            }
                            rVar5.f37346i = true;
                            rVar = h(rVar, rVar5);
                            rVar3 = rVar2.f37342e;
                            rVar5 = rVar3 != null ? rVar3.f37344g : null;
                        }
                        if (rVar5 != null) {
                            rVar5.f37346i = rVar3 == null ? false : rVar3.f37346i;
                            r rVar8 = rVar5.f37344g;
                            if (rVar8 != null) {
                                rVar8.f37346i = false;
                            }
                        }
                        if (rVar3 != null) {
                            rVar3.f37346i = false;
                            rVar = g(rVar, rVar3);
                        }
                        rVar2 = rVar;
                    }
                }
                rVar2 = rVar3;
            } else {
                if (rVar4 != null && rVar4.f37346i) {
                    rVar4.f37346i = false;
                    rVar3.f37346i = true;
                    rVar = h(rVar, rVar3);
                    rVar3 = rVar2.f37342e;
                    rVar4 = rVar3 == null ? null : rVar3.f37343f;
                }
                if (rVar4 != null) {
                    r rVar9 = rVar4.f37343f;
                    r rVar10 = rVar4.f37344g;
                    if ((rVar9 == null || !rVar9.f37346i) && (rVar10 == null || !rVar10.f37346i)) {
                        rVar4.f37346i = true;
                    } else {
                        if (rVar9 == null || !rVar9.f37346i) {
                            if (rVar10 != null) {
                                rVar10.f37346i = false;
                            }
                            rVar4.f37346i = true;
                            rVar = g(rVar, rVar4);
                            rVar3 = rVar2.f37342e;
                            rVar4 = rVar3 != null ? rVar3.f37343f : null;
                        }
                        if (rVar4 != null) {
                            rVar4.f37346i = rVar3 == null ? false : rVar3.f37346i;
                            r rVar11 = rVar4.f37343f;
                            if (rVar11 != null) {
                                rVar11.f37346i = false;
                            }
                        }
                        if (rVar3 != null) {
                            rVar3.f37346i = false;
                            rVar = h(rVar, rVar3);
                        }
                        rVar2 = rVar;
                    }
                }
                rVar2 = rVar3;
            }
        }
        return rVar;
    }

    static {
        j$.sun.misc.a h8 = j$.sun.misc.a.h();
        f37337h = h8;
        f37338i = h8.j(q.class, "lockState");
    }
}
