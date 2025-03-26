package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.c;
import com.google.common.util.concurrent.d;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: w, reason: collision with root package name */
    c f11780w;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f11780w.q(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.f11780w.r(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final d startWork() {
        this.f11780w = c.u();
        getBackgroundExecutor().execute(new a());
        return this.f11780w;
    }
}
