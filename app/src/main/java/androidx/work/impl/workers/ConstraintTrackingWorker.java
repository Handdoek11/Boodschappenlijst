package androidx.work.impl.workers;

import A1.p;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.c;
import com.google.common.util.concurrent.d;
import java.util.Collections;
import java.util.List;
import s1.j;
import t1.C6789j;
import w1.C6868d;
import w1.InterfaceC6867c;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC6867c {

    /* renamed from: B, reason: collision with root package name */
    private static final String f11956B = j.f("ConstraintTrkngWrkr");

    /* renamed from: A, reason: collision with root package name */
    private ListenableWorker f11957A;

    /* renamed from: w, reason: collision with root package name */
    private WorkerParameters f11958w;

    /* renamed from: x, reason: collision with root package name */
    final Object f11959x;

    /* renamed from: y, reason: collision with root package name */
    volatile boolean f11960y;

    /* renamed from: z, reason: collision with root package name */
    c f11961z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.e();
        }
    }

    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ d f11963o;

        b(d dVar) {
            this.f11963o = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f11959x) {
                try {
                    if (ConstraintTrackingWorker.this.f11960y) {
                        ConstraintTrackingWorker.this.d();
                    } else {
                        ConstraintTrackingWorker.this.f11961z.s(this.f11963o);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f11958w = workerParameters;
        this.f11959x = new Object();
        this.f11960y = false;
        this.f11961z = c.u();
    }

    public WorkDatabase a() {
        return C6789j.k(getApplicationContext()).o();
    }

    @Override // w1.InterfaceC6867c
    public void b(List list) {
        j.c().a(f11956B, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f11959x) {
            this.f11960y = true;
        }
    }

    void c() {
        this.f11961z.q(ListenableWorker.a.a());
    }

    void d() {
        this.f11961z.q(ListenableWorker.a.b());
    }

    void e() {
        String i8 = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(i8)) {
            j.c().b(f11956B, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        ListenableWorker b8 = getWorkerFactory().b(getApplicationContext(), i8, this.f11958w);
        this.f11957A = b8;
        if (b8 == null) {
            j.c().a(f11956B, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        p m8 = a().B().m(getId().toString());
        if (m8 == null) {
            c();
            return;
        }
        C6868d c6868d = new C6868d(getApplicationContext(), getTaskExecutor(), this);
        c6868d.d(Collections.singletonList(m8));
        if (!c6868d.c(getId().toString())) {
            j.c().a(f11956B, String.format("Constraints not met for delegate %s. Requesting retry.", i8), new Throwable[0]);
            d();
            return;
        }
        j.c().a(f11956B, String.format("Constraints met for delegate %s", i8), new Throwable[0]);
        try {
            d startWork = this.f11957A.startWork();
            startWork.f(new b(startWork), getBackgroundExecutor());
        } catch (Throwable th) {
            j c8 = j.c();
            String str = f11956B;
            c8.a(str, String.format("Delegated worker %s threw exception in startWork.", i8), th);
            synchronized (this.f11959x) {
                try {
                    if (this.f11960y) {
                        j.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        d();
                    } else {
                        c();
                    }
                } finally {
                }
            }
        }
    }

    @Override // w1.InterfaceC6867c
    public void f(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public C1.a getTaskExecutor() {
        return C6789j.k(getApplicationContext()).p();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f11957A;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f11957A;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f11957A.stop();
    }

    @Override // androidx.work.ListenableWorker
    public d startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f11961z;
    }
}
