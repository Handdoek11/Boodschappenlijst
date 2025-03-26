package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.work.impl.utils.futures.c;
import com.google.common.util.concurrent.d;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import s1.e;
import s1.v;

/* loaded from: classes.dex */
public abstract class ListenableWorker {

    /* renamed from: o, reason: collision with root package name */
    private Context f11772o;

    /* renamed from: s, reason: collision with root package name */
    private WorkerParameters f11773s;

    /* renamed from: t, reason: collision with root package name */
    private volatile boolean f11774t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f11775u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f11776v;

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a, reason: collision with other inner class name */
        public static final class C0195a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final androidx.work.b f11777a;

            public C0195a() {
                this(androidx.work.b.f11820c);
            }

            public androidx.work.b e() {
                return this.f11777a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0195a.class != obj.getClass()) {
                    return false;
                }
                return this.f11777a.equals(((C0195a) obj).f11777a);
            }

            public int hashCode() {
                return (C0195a.class.getName().hashCode() * 31) + this.f11777a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f11777a + '}';
            }

            public C0195a(androidx.work.b bVar) {
                this.f11777a = bVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            private final androidx.work.b f11778a;

            public c() {
                this(androidx.work.b.f11820c);
            }

            public androidx.work.b e() {
                return this.f11778a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f11778a.equals(((c) obj).f11778a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f11778a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f11778a + '}';
            }

            public c(androidx.work.b bVar) {
                this.f11778a = bVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0195a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(androidx.work.b bVar) {
            return new c(bVar);
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f11772o = context;
        this.f11773s = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f11772o;
    }

    public Executor getBackgroundExecutor() {
        return this.f11773s.a();
    }

    public d getForegroundInfoAsync() {
        c u7 = c.u();
        u7.r(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return u7;
    }

    public final UUID getId() {
        return this.f11773s.c();
    }

    public final b getInputData() {
        return this.f11773s.d();
    }

    public final Network getNetwork() {
        return this.f11773s.e();
    }

    public final int getRunAttemptCount() {
        return this.f11773s.g();
    }

    public final Set<String> getTags() {
        return this.f11773s.h();
    }

    public C1.a getTaskExecutor() {
        return this.f11773s.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f11773s.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f11773s.k();
    }

    public v getWorkerFactory() {
        return this.f11773s.l();
    }

    public boolean isRunInForeground() {
        return this.f11776v;
    }

    public final boolean isStopped() {
        return this.f11774t;
    }

    public final boolean isUsed() {
        return this.f11775u;
    }

    public void onStopped() {
    }

    public final d setForegroundAsync(e eVar) {
        this.f11776v = true;
        return this.f11773s.b().a(getApplicationContext(), getId(), eVar);
    }

    public d setProgressAsync(b bVar) {
        return this.f11773s.f().a(getApplicationContext(), getId(), bVar);
    }

    public void setRunInForeground(boolean z7) {
        this.f11776v = z7;
    }

    public final void setUsed() {
        this.f11775u = true;
    }

    public abstract d startWork();

    public final void stop() {
        this.f11774t = true;
        onStopped();
    }
}
