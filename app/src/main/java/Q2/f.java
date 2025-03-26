package q2;

import android.app.job.JobInfo;
import h2.EnumC5832f;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import q2.C6422c;
import t2.InterfaceC6791a;

/* loaded from: classes.dex */
public abstract class f {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC6791a f40946a;

        /* renamed from: b, reason: collision with root package name */
        private Map f40947b = new HashMap();

        public a a(EnumC5832f enumC5832f, b bVar) {
            this.f40947b.put(enumC5832f, bVar);
            return this;
        }

        public f b() {
            if (this.f40946a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f40947b.keySet().size() < EnumC5832f.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f40947b;
            this.f40947b = new HashMap();
            return f.d(this.f40946a, map);
        }

        public a c(InterfaceC6791a interfaceC6791a) {
            this.f40946a = interfaceC6791a;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j8);

            public abstract a c(Set set);

            public abstract a d(long j8);
        }

        public static a a() {
            return new C6422c.b().c(Collections.emptySet());
        }

        abstract long b();

        abstract Set c();

        abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i8, long j8) {
        return (long) (Math.pow(3.0d, i8 - 1) * j8 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j8 > 1 ? j8 : 2L) * r7)));
    }

    public static a b() {
        return new a();
    }

    static f d(InterfaceC6791a interfaceC6791a, Map map) {
        return new C6421b(interfaceC6791a, map);
    }

    public static f f(InterfaceC6791a interfaceC6791a) {
        return b().a(EnumC5832f.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(EnumC5832f.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(EnumC5832f.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(interfaceC6791a).b();
    }

    private static Set i(Object... objArr) {
        return DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, EnumC5832f enumC5832f, long j8, int i8) {
        builder.setMinimumLatency(g(enumC5832f, j8, i8));
        j(builder, ((b) h().get(enumC5832f)).c());
        return builder;
    }

    abstract InterfaceC6791a e();

    public long g(EnumC5832f enumC5832f, long j8, int i8) {
        long a8 = j8 - e().a();
        b bVar = (b) h().get(enumC5832f);
        return Math.min(Math.max(a(i8, bVar.b()), a8), bVar.d());
    }

    abstract Map h();
}
