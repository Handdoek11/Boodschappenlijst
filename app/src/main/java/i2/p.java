package i2;

import android.util.SparseArray;
import i2.f;

/* loaded from: classes.dex */
public abstract class p {

    public static abstract class a {
        public abstract p a();

        public abstract a b(s sVar);

        public abstract a c(b bVar);
    }

    public enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);


        /* renamed from: u, reason: collision with root package name */
        private static final SparseArray f36451u;

        /* renamed from: o, reason: collision with root package name */
        private final int f36453o;

        static {
            b bVar = NOT_SET;
            b bVar2 = EVENT_OVERRIDE;
            SparseArray sparseArray = new SparseArray();
            f36451u = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(5, bVar2);
        }

        b(int i8) {
            this.f36453o = i8;
        }
    }

    public static a a() {
        return new f.b();
    }

    public abstract s b();

    public abstract b c();
}
