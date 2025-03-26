package F1;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class a {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f2229a;

        private b(Context context) {
            this.f2229a = context;
        }

        public a a() {
            Context context = this.f2229a;
            if (context != null) {
                return new F1.b(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public static b c(Context context) {
        return new b(context);
    }

    public abstract void a();

    public abstract d b();

    public abstract void d(c cVar);
}
