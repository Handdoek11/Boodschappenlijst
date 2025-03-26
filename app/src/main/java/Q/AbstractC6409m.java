package q;

import J6.r;
import r.AbstractC6640a;

/* renamed from: q.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6409m {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f40894a = new Object();

    public static final Object c(C6408l c6408l, int i8) {
        Object obj;
        r.e(c6408l, "<this>");
        int a8 = AbstractC6640a.a(c6408l.f40891s, c6408l.f40893u, i8);
        if (a8 < 0 || (obj = c6408l.f40892t[a8]) == f40894a) {
            return null;
        }
        return obj;
    }

    public static final Object d(C6408l c6408l, int i8, Object obj) {
        Object obj2;
        r.e(c6408l, "<this>");
        int a8 = AbstractC6640a.a(c6408l.f40891s, c6408l.f40893u, i8);
        return (a8 < 0 || (obj2 = c6408l.f40892t[a8]) == f40894a) ? obj : obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C6408l c6408l) {
        int i8 = c6408l.f40893u;
        int[] iArr = c6408l.f40891s;
        Object[] objArr = c6408l.f40892t;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (obj != f40894a) {
                if (i10 != i9) {
                    iArr[i9] = iArr[i10];
                    objArr[i9] = obj;
                    objArr[i10] = null;
                }
                i9++;
            }
        }
        c6408l.f40890o = false;
        c6408l.f40893u = i9;
    }
}
