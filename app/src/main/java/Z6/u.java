package Z6;

import U6.G0;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public abstract class u {
    private static final v a(Throwable th, String str) {
        if (th != null) {
            throw th;
        }
        d();
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ v b(Throwable th, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            th = null;
        }
        if ((i8 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(G0 g02) {
        return g02.A0() instanceof v;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final G0 e(s sVar, List list) {
        try {
            return sVar.b(list);
        } catch (Throwable th) {
            return a(th, sVar.a());
        }
    }
}
