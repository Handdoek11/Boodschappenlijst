package q;

import J6.r;
import java.util.ConcurrentModificationException;
import r.AbstractC6640a;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6400d {
    public static final void a(C6398b c6398b, int i8) {
        r.e(c6398b, "<this>");
        c6398b.q(new int[i8]);
        c6398b.p(new Object[i8]);
    }

    public static final int b(C6398b c6398b, int i8) {
        r.e(c6398b, "<this>");
        try {
            return AbstractC6640a.a(c6398b.e(), c6398b.n(), i8);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(C6398b c6398b, Object obj, int i8) {
        r.e(c6398b, "<this>");
        int n8 = c6398b.n();
        if (n8 == 0) {
            return -1;
        }
        int b8 = b(c6398b, i8);
        if (b8 < 0 || r.a(obj, c6398b.d()[b8])) {
            return b8;
        }
        int i9 = b8 + 1;
        while (i9 < n8 && c6398b.e()[i9] == i8) {
            if (r.a(obj, c6398b.d()[i9])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = b8 - 1; i10 >= 0 && c6398b.e()[i10] == i8; i10--) {
            if (r.a(obj, c6398b.d()[i10])) {
                return i10;
            }
        }
        return ~i9;
    }

    public static final int d(C6398b c6398b) {
        r.e(c6398b, "<this>");
        return c(c6398b, null, 0);
    }
}
