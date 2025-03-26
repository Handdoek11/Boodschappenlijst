package U6;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public enum O {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5419a;

        static {
            int[] iArr = new int[O.values().length];
            try {
                iArr[O.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[O.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5419a = iArr;
        }
    }

    public final void c(I6.p pVar, Object obj, A6.d dVar) {
        int i8 = a.f5419a[ordinal()];
        if (i8 == 1) {
            a7.a.d(pVar, obj, dVar, null, 4, null);
            return;
        }
        if (i8 == 2) {
            A6.f.a(pVar, obj, dVar);
        } else if (i8 == 3) {
            a7.b.a(pVar, obj, dVar);
        } else if (i8 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean f() {
        return this == LAZY;
    }
}
