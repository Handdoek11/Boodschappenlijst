package X5;

import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public abstract class o {
    public static final void a(n nVar, byte[] bArr, int i8, int i9) {
        J6.r.e(nVar, "<this>");
        J6.r.e(bArr, "dst");
        boolean z7 = true;
        Y5.a b8 = Y5.d.b(nVar, 1);
        if (b8 != null) {
            while (true) {
                try {
                    int min = Math.min(i9, b8.k() - b8.i());
                    f.a(b8, bArr, i8, min);
                    i9 -= min;
                    i8 += min;
                    if (i9 <= 0) {
                        Y5.d.a(nVar, b8);
                        break;
                    }
                    try {
                        b8 = Y5.d.c(nVar, b8);
                        if (b8 == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z7 = false;
                        if (z7) {
                            Y5.d.a(nVar, b8);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        if (i9 <= 0) {
            return;
        }
        r.a(i9);
        throw new KotlinNothingValueException();
    }
}
