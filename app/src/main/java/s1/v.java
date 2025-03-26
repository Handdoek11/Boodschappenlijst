package s1;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private static final String f42715a = j.f("WorkerFactory");

    class a extends v {
        a() {
        }

        @Override // s1.v
        public ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static v c() {
        return new a();
    }

    public abstract ListenableWorker a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        ListenableWorker a8 = a(context, str, workerParameters);
        if (a8 == null) {
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                j.c().b(f42715a, "Invalid class: " + str, th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a8 = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    j.c().b(f42715a, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a8 == null || !a8.isUsed()) {
            return a8;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
