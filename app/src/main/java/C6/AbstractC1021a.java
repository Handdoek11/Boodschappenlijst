package c6;

import a6.j;
import android.os.Handler;
import android.os.Looper;
import b6.AbstractC0966a;
import java.util.concurrent.Callable;

/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1021a {

    /* renamed from: a, reason: collision with root package name */
    private static final j f12242a = AbstractC0966a.d(new CallableC0211a());

    /* renamed from: c6.a$a, reason: collision with other inner class name */
    static class CallableC0211a implements Callable {
        CallableC0211a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j call() {
            return b.f12243a;
        }
    }

    /* renamed from: c6.a$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final j f12243a = new C1022b(new Handler(Looper.getMainLooper()), false);
    }

    public static j a() {
        return AbstractC0966a.e(f12242a);
    }
}
