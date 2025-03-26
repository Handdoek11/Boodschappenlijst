package e;

import J6.r;
import android.content.Context;
import android.content.Intent;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5734a {

    /* renamed from: e.a$a, reason: collision with other inner class name */
    public static final class C0250a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f35285a;

        public C0250a(Object obj) {
            this.f35285a = obj;
        }

        public final Object a() {
            return this.f35285a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0250a b(Context context, Object obj) {
        r.e(context, "context");
        return null;
    }

    public abstract Object c(int i8, Intent intent);
}
